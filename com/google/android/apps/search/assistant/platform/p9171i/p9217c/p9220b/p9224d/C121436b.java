package com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d;

import com.google.assistant.p3781ad.p3787c.p3788a.C48516bh;

/* renamed from: com.google.android.apps.search.assistant.platform.i.c.b.d.b */
/* compiled from: PG */
class C121436b extends C121453s {

    /* renamed from: a */
    public final C48516bh f337092a;

    public C121436b(C48516bh bhVar) {
        if (bhVar != null) {
            this.f337092a = bhVar;
            return;
        }
        throw new NullPointerException("Null appStat");
    }

    /* renamed from: a */
    public final C48516bh mo105142a() {
        return this.f337092a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C121453s) {
            return this.f337092a.equals(((C121453s) obj).mo105142a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f337092a.hashCode() ^ 1000003;
    }

    public final String toString() {
        String obj = this.f337092a.toString();
        return "AppStatAccessor{appStat=" + obj + "}";
    }
}
