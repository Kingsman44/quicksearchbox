package com.google.apps.p3589d.p3593d;

import com.google.apps.p3589d.p3591b.C45719j;

/* renamed from: com.google.apps.d.d.h */
/* compiled from: PG */
public final class C45749h {

    /* renamed from: a */
    public static final C45749h f120309a = m81559b(C45763v.m81596d());

    /* renamed from: b */
    public final C45737ae f120310b;

    private C45749h(C45737ae aeVar) {
        this.f120310b = aeVar;
    }

    /* renamed from: a */
    public static C45749h m81558a(C45737ae aeVar) {
        if (aeVar.f120246a == C45740ah.LINES) {
            return new C45749h(aeVar);
        }
        throw new AssertionError("Must have a LINES table at the DOM root.");
    }

    /* renamed from: b */
    public static C45749h m81559b(C45763v vVar) {
        return m81558a(C45737ae.m81535o(C45740ah.LINES, (String) null, C45719j.m81477h(C45719j.m81477h(vVar))));
    }

    /* renamed from: c */
    public final C45749h mo49881c(C45750i iVar) {
        return new C45749h(new C45737ae(this.f120310b, iVar));
    }

    /* renamed from: d */
    public final C45763v mo49882d() {
        if (this.f120310b.f120249j.f120220a.size() == 1 && C45737ae.m81534n(this.f120310b.f120249j) == 1) {
            return (C45763v) ((C45719j) this.f120310b.f120249j.mo49815d(0)).mo49815d(0);
        }
        return null;
    }
}
