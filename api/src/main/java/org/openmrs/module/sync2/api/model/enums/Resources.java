package org.openmrs.module.sync2.api.model.enums;

import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_ALLERGY;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_AUDIT_MESSAGE;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_COHORT;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_DRUG_ORDER;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_ENCOUNTER;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_FORM;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_LOCATION;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_OBSERVATION;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_PATIENT;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_PERSON;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_PRIVILEGE;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_TEST_ORDER;
import static org.openmrs.module.sync2.SyncCategoryConstants.CATEGORY_VISIT;

public enum Resources {

    ALL(""),
    PATIENT(CATEGORY_PATIENT),
    VISIT(CATEGORY_VISIT),
    ENCOUNTER(CATEGORY_ENCOUNTER),
    OBSERVATION(CATEGORY_OBSERVATION),
    LOCATION(CATEGORY_LOCATION),
    PRIVILEGE(CATEGORY_PRIVILEGE),
    AUDIT_MESSAGE(CATEGORY_AUDIT_MESSAGE),
    PERSON(CATEGORY_PERSON),
    ALLERGY(CATEGORY_ALLERGY),
    FORM(CATEGORY_FORM),
    COHORT(CATEGORY_COHORT),
    DRUG_ORDER(CATEGORY_DRUG_ORDER),
    TEST_ORDER(CATEGORY_TEST_ORDER);

    private final String name;

    Resources(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
