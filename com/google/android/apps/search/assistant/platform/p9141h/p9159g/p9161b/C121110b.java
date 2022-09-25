package com.google.android.apps.search.assistant.platform.p9141h.p9159g.p9161b;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.assistant.platform.h.g.b.b */
/* compiled from: PG */
public enum C121110b implements C62957cd {
    OMNICONSENT_SCOPE_UNSPECIFIED(0),
    OMNICONSENT_SCOPE_UNSCOPED(1),
    OMNICONSENT_SCOPE_OPA_ANDROID(2),
    OMNICONSENT_SCOPE_ANDROID_SUW(3),
    OMNICONSENT_SCOPE_BISTO(4),
    OMNICONSENT_SCOPE_OPA_ANDROID_AUTO(5);
    

    /* renamed from: g */
    public final int f336541g;

    private C121110b(int i) {
        this.f336541g = i;
    }

    /* renamed from: a */
    public static C121110b m200403a(int i) {
        if (i == 0) {
            return OMNICONSENT_SCOPE_UNSPECIFIED;
        }
        if (i == 1) {
            return OMNICONSENT_SCOPE_UNSCOPED;
        }
        if (i == 2) {
            return OMNICONSENT_SCOPE_OPA_ANDROID;
        }
        if (i == 3) {
            return OMNICONSENT_SCOPE_ANDROID_SUW;
        }
        if (i == 4) {
            return OMNICONSENT_SCOPE_BISTO;
        }
        if (i != 5) {
            return null;
        }
        return OMNICONSENT_SCOPE_OPA_ANDROID_AUTO;
    }

    /* renamed from: b */
    public static C62959cf m200404b() {
        return C121109a.f336533a;
    }

    public final int getNumber() {
        return this.f336541g;
    }

    public final String toString() {
        return Integer.toString(this.f336541g);
    }
}
