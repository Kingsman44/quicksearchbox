package com.google.android.apps.gsa.search.core.carassistant.p6784f;

import com.google.assistant.p3897e.p3910e.p3911a.C51195j;

/* renamed from: com.google.android.apps.gsa.search.core.carassistant.f.d */
/* compiled from: PG */
final class C85716d extends C85717e {

    /* renamed from: a */
    private final C51195j f231785a;

    public C85716d(C51195j jVar) {
        this.f231785a = jVar;
    }

    /* renamed from: b */
    public final int mo79366b() {
        return 2;
    }

    /* renamed from: c */
    public final C51195j mo79370c() {
        return this.f231785a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C85721i) {
            C85721i iVar = (C85721i) obj;
            if (iVar.mo79366b() != 2 || !this.f231785a.equals(iVar.mo79370c())) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f231785a.hashCode();
    }

    public final String toString() {
        String obj = this.f231785a.toString();
        return "FulfillmentOutput{assistantResponse=" + obj + "}";
    }
}
