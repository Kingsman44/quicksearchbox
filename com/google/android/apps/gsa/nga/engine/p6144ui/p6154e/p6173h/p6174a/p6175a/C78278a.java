package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6175a;

import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80696by;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80734di;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.a.a */
/* compiled from: PG */
final class C78278a extends C78293ao {

    /* renamed from: a */
    private final C80734di f215558a;

    /* renamed from: b */
    private final C80696by f215559b;

    /* renamed from: c */
    private final C80581o f215560c;

    public C78278a(C80734di diVar, C80696by byVar, C80581o oVar) {
        if (diVar != null) {
            this.f215558a = diVar;
            if (byVar != null) {
                this.f215559b = byVar;
                if (oVar != null) {
                    this.f215560c = oVar;
                    return;
                }
                throw new NullPointerException("Null suggestionChip");
            }
            throw new NullPointerException("Null blueBar");
        }
        throw new NullPointerException("Null heroChip");
    }

    /* renamed from: a */
    public final C80581o mo73281a() {
        return this.f215560c;
    }

    /* renamed from: b */
    public final C80696by mo73282b() {
        return this.f215559b;
    }

    /* renamed from: c */
    public final C80734di mo73283c() {
        return this.f215558a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78293ao) {
            C78293ao aoVar = (C78293ao) obj;
            return this.f215558a.equals(aoVar.mo73283c()) && this.f215559b.equals(aoVar.mo73282b()) && this.f215560c.equals(aoVar.mo73281a());
        }
    }

    public final int hashCode() {
        return ((((this.f215558a.hashCode() ^ 1000003) * 1000003) ^ this.f215559b.hashCode()) * 1000003) ^ this.f215560c.hashCode();
    }

    public final String toString() {
        String obj = this.f215558a.toString();
        String obj2 = this.f215559b.toString();
        String obj3 = this.f215560c.toString();
        return "OnboardingConfig{heroChip=" + obj + ", blueBar=" + obj2 + ", suggestionChip=" + obj3 + "}";
    }
}
