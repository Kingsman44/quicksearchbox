package com.google.android.apps.gsa.staticplugins.opa.p8340bi.p8341a;

import com.google.android.apps.gsa.shared.p6976ag.p6982e.C89134f;
import p3186j$.util.function.Function;
import p5535j.p5536a.p5545c.p5548c.p5549a.C71111fc;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.bi.a.c */
/* compiled from: PG */
class C108075c implements Function {
    /* renamed from: a */
    public final C71111fc apply(C89134f fVar) {
        C89134f fVar2 = C89134f.UNKNOWN;
        switch (fVar.ordinal()) {
            case 0:
                return C71111fc.UNKNOWN;
            case 1:
                return C71111fc.CONVERSATION_PARAMS_RECEIVED;
            case 2:
                return C71111fc.CLIENT_OP_EXECUTED;
            case 3:
                return C71111fc.CONTACT_SELECTION_RENDERED;
            case 4:
                return C71111fc.CONTACT_SELECTED;
            case 5:
                return C71111fc.MORE_CONTACTS_TAP;
            case 6:
                return C71111fc.CONTACT_CONFIRMATION_RENDERED;
            case 7:
                return C71111fc.CONTACT_PICK_UP_RENDERED;
            case 8:
                return C71111fc.FLUIDACTIONS_CONFIRM;
            case 9:
                return C71111fc.FLUIDACTIONS_CANCEL;
            case 10:
                return C71111fc.CONTACT_LABEL_SELECTION_RENDERED;
            case 11:
                return C71111fc.CONTACT_LABEL_SELECTED;
            case 12:
                return C71111fc.PROVIDER_SELECTION_RENDERED;
            case 13:
                return C71111fc.PROVIDER_SELECTED;
            case 14:
                return C71111fc.CONTACT_ERROR;
            case 15:
                return C71111fc.CLIENT_OP_GENERATED_BY_FLUIDACTIONS;
            case 16:
                return C71111fc.ASSISTANT_DISMISSED;
            case 17:
                return C71111fc.UDC_PERMISSION_REQUEST_SHOWN;
            case 18:
                return C71111fc.UDC_PERMISSION_REQUEST_REJECTED;
            case 19:
                return C71111fc.UDC_PERMISSION_REQUEST_ACCEPTED;
            case 20:
                return C71111fc.REQUEST_USER_UNLOCK_DEVICE;
            case 21:
                return C71111fc.DEVICE_UNLOCKED;
            case 22:
                return C71111fc.USER_QUERY_ISSUED;
            case 23:
                return C71111fc.USER_QUERY_FULFILLED;
            default:
                throw new IllegalArgumentException("unknown enum value: ".concat(String.valueOf(String.valueOf(fVar))));
        }
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
