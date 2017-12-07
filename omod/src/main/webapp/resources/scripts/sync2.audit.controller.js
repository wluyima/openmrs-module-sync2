jQuery(document).ready(function() {

    $("#jsGrid").jsGrid({
        height: "auto",
        width: "100%",

        sorting: true,
        paging: true,
        pageLoading: true,
        autoload: true,
        filtering: true,
        pageSize: 10,
        pageButtonCount: 5,
        pageIndex: getPageIndex(),

        controller: {
            loadData: function (filter) {
                var d = $.Deferred();

                jQuery.ajax({
                    url: "/openmrs/ws/rest/sync2/messages",
                    type: "GET",
                    dataType: "json",
                    data: filter
                }).done(function (response) {
                    d.resolve(response);
                });

                return d.promise();
            }
        },
        fields: [ {
                name: 'id', type: "number", visible: false
            }, {
                title: titles[0], name: "resourceName", type: "select", items: syncResourceName, valueField: "id", textField: "name", sorting: true, filtering: true, width: '10%'
            }, {
                title: titles[1], name: "timestamp", sorting: true, filtering: false, width: '20%'
            }, {
                title: titles[2], name: "resourceUrl", sorting: true, filtering: false, width: '50%'
            }, {
                title: titles[3], name: "success", type: "select", items: syncStatus, valueField: "id", textField: "name" , sorting: true, filtering: true, align: "center", width: '10%',
                itemTemplate: function(value) {
                    var result;
                    if (value === true) {
                        result = $("<div>").prepend('<img id="successImage" src="/openmrs/ms/uiframework/resource/sync2/images/success.png" />');
                    } else {
                        result = $("<div>").prepend('<img id="failureImage" src="/openmrs/ms/uiframework/resource/sync2/images/failure.png" />');
                    }
                    return result;
                }
            }, {
                title: titles[4], name: "action" , type: "select", items: syncAction, valueField: "id", textField: "name", filtering: true, width: '10%'
            }
        ]
    });
});

function getPageIndex(){
    var url = new URL(window.location.href);
    var param = url.searchParams.get("pageIndex");
	if (param == null) {
		return 1;
	}
	return parseInt(param);
}