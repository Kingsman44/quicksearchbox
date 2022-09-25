package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.i.a.gi */
/* compiled from: PG */
public enum C51401gi implements C62957cd {
    CONTROLLER_STATE_UNKNOWN(0),
    PERSON_CONTACT_SELECTION(1),
    PERSON_NAME_SELECTION(2),
    PROVIDER_SELECTION(3),
    FORMAT_SELECTION(19),
    CONTACT_ENDPOINT_LABEL_SELECTION(4),
    CONTACT_ENDPOINT_SELECTION(5),
    ORGANIZATION_DEPARTMENT_SELECTION(18),
    AUM_MEDIUM_CONFIDENCE_CONFIRMATION(6),
    SET_MESSAGE(10),
    SEND_MESSAGE_CONFIRMATION(11),
    CREATE_RELATIONSHIP_CONFIRMATION(12),
    DOWNLOAD_ASSISTANT_PHOTOS(14),
    READ_MESSAGE_CONFIRMATION(15),
    REPLY_INTENT_SELECTION(16),
    AUDIO_FALLBACK_CONFIRMATION(17),
    FULFILLMENT(7),
    CANCEL(8),
    TERMINATE(9);
    

    /* renamed from: t */
    public final int f133877t;

    private C51401gi(int i) {
        this.f133877t = i;
    }

    /* renamed from: a */
    public static C51401gi m86175a(int i) {
        switch (i) {
            case 0:
                return CONTROLLER_STATE_UNKNOWN;
            case 1:
                return PERSON_CONTACT_SELECTION;
            case 2:
                return PERSON_NAME_SELECTION;
            case 3:
                return PROVIDER_SELECTION;
            case 4:
                return CONTACT_ENDPOINT_LABEL_SELECTION;
            case 5:
                return CONTACT_ENDPOINT_SELECTION;
            case 6:
                return AUM_MEDIUM_CONFIDENCE_CONFIRMATION;
            case 7:
                return FULFILLMENT;
            case 8:
                return CANCEL;
            case 9:
                return TERMINATE;
            case 10:
                return SET_MESSAGE;
            case 11:
                return SEND_MESSAGE_CONFIRMATION;
            case 12:
                return CREATE_RELATIONSHIP_CONFIRMATION;
            case 14:
                return DOWNLOAD_ASSISTANT_PHOTOS;
            case 15:
                return READ_MESSAGE_CONFIRMATION;
            case 16:
                return REPLY_INTENT_SELECTION;
            case 17:
                return AUDIO_FALLBACK_CONFIRMATION;
            case 18:
                return ORGANIZATION_DEPARTMENT_SELECTION;
            case 19:
                return FORMAT_SELECTION;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m86176b() {
        return C51400gh.f133856a;
    }

    public final int getNumber() {
        return this.f133877t;
    }

    public final String toString() {
        return Integer.toString(this.f133877t);
    }
}
