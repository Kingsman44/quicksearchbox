package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8055c.p8056a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80229bw;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.c.a.a */
/* compiled from: PG */
final class C103047a extends C103075u {

    /* renamed from: a */
    private final C80229bw f287667a;

    public C103047a(C80229bw bwVar) {
        if (bwVar != null) {
            this.f287667a = bwVar;
            return;
        }
        throw new NullPointerException("Null triggerCondition");
    }

    /* renamed from: a */
    public final C80229bw mo93587a() {
        return this.f287667a;
    }

    /* renamed from: b */
    public final boolean mo93588b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C103075u) {
            C103075u uVar = (C103075u) obj;
            return this.f287667a.equals(uVar.mo93587a()) && !uVar.mo93588b();
        }
    }

    public final int hashCode() {
        return ((this.f287667a.hashCode() ^ 1000003) * 1000003) ^ 1237;
    }

    public final String toString() {
        String obj = this.f287667a.toString();
        return "UsecaseResult{triggerCondition=" + obj + ", allConditionsSatisfied=false}";
    }
}
