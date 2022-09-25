package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.host;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.host.i */
/* compiled from: PG */
public enum C129662i implements C62957cd {
    DEFAULT_NOT_VISIBLE(0),
    INPUT(1),
    RESPONSE(2),
    IMMERSIVE_CANVAS(3),
    INTERPRETER_MODE(4),
    KEYBOARD_INPUT(5),
    ACCOUNT_FIX(6),
    OVER_APP(7),
    ENABLE_ASSISTANT(8),
    ESCAPE_HATCH(9),
    LEGAL_NOTICE(10);
    

    /* renamed from: l */
    public final int f355866l;

    private C129662i(int i) {
        this.f355866l = i;
    }

    /* renamed from: a */
    public static C129662i m211713a(int i) {
        switch (i) {
            case 0:
                return DEFAULT_NOT_VISIBLE;
            case 1:
                return INPUT;
            case 2:
                return RESPONSE;
            case 3:
                return IMMERSIVE_CANVAS;
            case 4:
                return INTERPRETER_MODE;
            case 5:
                return KEYBOARD_INPUT;
            case 6:
                return ACCOUNT_FIX;
            case 7:
                return OVER_APP;
            case 8:
                return ENABLE_ASSISTANT;
            case 9:
                return ESCAPE_HATCH;
            case 10:
                return LEGAL_NOTICE;
            default:
                return null;
        }
    }

    /* renamed from: b */
    public static C62959cf m211714b() {
        return C129661h.f355853a;
    }

    public final int getNumber() {
        return this.f355866l;
    }

    public final String toString() {
        return Integer.toString(this.f355866l);
    }
}
