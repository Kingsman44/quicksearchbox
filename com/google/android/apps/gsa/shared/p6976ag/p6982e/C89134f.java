package com.google.android.apps.gsa.shared.p6976ag.p6982e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.shared.ag.e.f */
/* compiled from: PG */
public enum C89134f implements C62957cd {
    UNKNOWN(0),
    CONVERSATION_PARAMS_RECEIVED(1),
    CLIENT_OP_EXECUTED(2),
    CONTACT_SELECTION_RENDERED(4),
    CONTACT_SELECTED(5),
    MORE_CONTACTS_TAP(6),
    CONTACT_CONFIRMATION_RENDERED(7),
    CONTACT_PICK_UP_RENDERED(8),
    FLUIDACTIONS_CONFIRM(9),
    FLUIDACTIONS_CANCEL(10),
    CONTACT_LABEL_SELECTION_RENDERED(11),
    CONTACT_LABEL_SELECTED(12),
    PROVIDER_SELECTION_RENDERED(13),
    PROVIDER_SELECTED(14),
    CONTACT_ERROR(15),
    CLIENT_OP_GENERATED_BY_FLUIDACTIONS(16),
    ASSISTANT_DISMISSED(17),
    UDC_PERMISSION_REQUEST_SHOWN(18),
    UDC_PERMISSION_REQUEST_REJECTED(19),
    UDC_PERMISSION_REQUEST_ACCEPTED(20),
    REQUEST_USER_UNLOCK_DEVICE(21),
    DEVICE_UNLOCKED(22),
    USER_QUERY_ISSUED(23),
    USER_QUERY_FULFILLED(24);
    

    /* renamed from: y */
    public final int f241638y;

    private C89134f(int i) {
        this.f241638y = i;
    }

    /* renamed from: a */
    public static C89134f m144998a(int i) {
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return CONVERSATION_PARAMS_RECEIVED;
            case 2:
                return CLIENT_OP_EXECUTED;
            case 4:
                return CONTACT_SELECTION_RENDERED;
            case 5:
                return CONTACT_SELECTED;
            case 6:
                return MORE_CONTACTS_TAP;
            case 7:
                return CONTACT_CONFIRMATION_RENDERED;
            case 8:
                return CONTACT_PICK_UP_RENDERED;
            case 9:
                return FLUIDACTIONS_CONFIRM;
            case 10:
                return FLUIDACTIONS_CANCEL;
            case 11:
                return CONTACT_LABEL_SELECTION_RENDERED;
            case 12:
                return CONTACT_LABEL_SELECTED;
            case 13:
                return PROVIDER_SELECTION_RENDERED;
            case 14:
                return PROVIDER_SELECTED;
            case 15:
                return CONTACT_ERROR;
            case 16:
                return CLIENT_OP_GENERATED_BY_FLUIDACTIONS;
            case 17:
                return ASSISTANT_DISMISSED;
            case 18:
                return UDC_PERMISSION_REQUEST_SHOWN;
            case 19:
                return UDC_PERMISSION_REQUEST_REJECTED;
            case 20:
                return UDC_PERMISSION_REQUEST_ACCEPTED;
            case 21:
                return REQUEST_USER_UNLOCK_DEVICE;
            case 22:
                return DEVICE_UNLOCKED;
            case 23:
                return USER_QUERY_ISSUED;
            case 24:
                return USER_QUERY_FULFILLED;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m144999b() {
        return C89133e.f241612a;
    }

    public final int getNumber() {
        return this.f241638y;
    }

    public final String toString() {
        return Integer.toString(this.f241638y);
    }
}
