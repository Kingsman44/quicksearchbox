package com.google.android.apps.gsa.staticplugins.opa.p8300as.p8301a;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.as.a.c */
/* compiled from: PG */
public enum C107502c implements C62957cd {
    UNDEFINED(0),
    OPA_TEXT_TO_SPEECH(1),
    OPA_CLIENT_OP_RESULT(2),
    OPA_WEB_VIEW(3),
    OPA_IMMERSIVE_CANVAS_UPDATE_STATE(4),
    OPA_UI_RENDERING_STATUS(5),
    OPA_CHARGING_AMBIENT_STATE(6),
    NGA_CLIENT_EVENT(7),
    OPA_UI_READY_FOR_NGA(8),
    OPA_FLUID_ACTIONS_CLIENT_EVENT(9),
    OPA_UI_DISMISS_CLIENT_EVENT(10),
    OPA_AUDIO_SESSION_EVENT(11),
    OPA_IMMERSIVE_CANVAS_UPDATE_PARAMS(12);
    

    /* renamed from: n */
    public final int f299114n;

    private C107502c(int i) {
        this.f299114n = i;
    }

    /* renamed from: a */
    public static C107502c m178394a(int i) {
        switch (i) {
            case 0:
                return UNDEFINED;
            case 1:
                return OPA_TEXT_TO_SPEECH;
            case 2:
                return OPA_CLIENT_OP_RESULT;
            case 3:
                return OPA_WEB_VIEW;
            case 4:
                return OPA_IMMERSIVE_CANVAS_UPDATE_STATE;
            case 5:
                return OPA_UI_RENDERING_STATUS;
            case 6:
                return OPA_CHARGING_AMBIENT_STATE;
            case 7:
                return NGA_CLIENT_EVENT;
            case 8:
                return OPA_UI_READY_FOR_NGA;
            case 9:
                return OPA_FLUID_ACTIONS_CLIENT_EVENT;
            case 10:
                return OPA_UI_DISMISS_CLIENT_EVENT;
            case 11:
                return OPA_AUDIO_SESSION_EVENT;
            case 12:
                return OPA_IMMERSIVE_CANVAS_UPDATE_PARAMS;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m178395b() {
        return C107501b.f299099a;
    }

    public final int getNumber() {
        return this.f299114n;
    }

    public final String toString() {
        return Integer.toString(this.f299114n);
    }
}
