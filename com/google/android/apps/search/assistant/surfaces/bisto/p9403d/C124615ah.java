package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.ah */
/* compiled from: PG */
public enum C124615ah implements C62957cd {
    NONE_SENT(0),
    HOTWORD_DISABLED_SENT(1),
    HOTWORD_CONSENT_SENT(2),
    HOTWORD_MODEL_UPLOAD_SENT(3),
    HOTWORD_VM_REQUIRED_SENT(4);
    

    /* renamed from: f */
    public final int f343746f;

    private C124615ah(int i) {
        this.f343746f = i;
    }

    /* renamed from: a */
    public static C124615ah m204285a(int i) {
        if (i == 0) {
            return NONE_SENT;
        }
        if (i == 1) {
            return HOTWORD_DISABLED_SENT;
        }
        if (i == 2) {
            return HOTWORD_CONSENT_SENT;
        }
        if (i == 3) {
            return HOTWORD_MODEL_UPLOAD_SENT;
        }
        if (i != 4) {
            return null;
        }
        return HOTWORD_VM_REQUIRED_SENT;
    }

    /* renamed from: b */
    public static C62959cf m204286b() {
        return C124614ag.f343739a;
    }

    public final int getNumber() {
        return this.f343746f;
    }

    public final String toString() {
        return Integer.toString(this.f343746f);
    }
}
