package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Collection;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ed */
/* compiled from: PG */
public final class C23557ed implements C23571er {

    /* renamed from: a */
    public static final C23556ec f64465a = new C23556ec();

    /* renamed from: b */
    public static final C23401ad f64466b = C23400ac.m43820b(BuildConfig.FLAVOR);

    /* renamed from: c */
    public static final C23523cx f64467c = C23522cw.m43924b(BuildConfig.FLAVOR);

    /* renamed from: d */
    public static final C23403af f64468d = new C23403af(0);

    /* renamed from: e */
    public static final C23399ab f64469e = new C23399ab(0);

    /* renamed from: f */
    private final C23574eu f64470f;

    /* renamed from: g */
    private final C23401ad f64471g;

    /* renamed from: h */
    private final C23523cx f64472h;

    /* renamed from: i */
    private final C23403af f64473i;

    /* renamed from: j */
    private final C23399ab f64474j;

    public C23557ed(C23574eu euVar, C23401ad adVar, C23523cx cxVar, C23403af afVar, C23399ab abVar) {
        C69664n.m101061g(euVar, "typeVal");
        C69664n.m101061g(adVar, "currentRunCycleParameter");
        C69664n.m101061g(cxVar, "nextCycleParameter");
        C69664n.m101061g(afVar, "currentTotalRemainingTimeParameter");
        C69664n.m101061g(abVar, "currentCycleRemainingTimeParameter");
        this.f64470f = euVar;
        this.f64471g = adVar;
        this.f64472h = cxVar;
        this.f64473i = afVar;
        this.f64474j = abVar;
    }

    /* renamed from: a */
    public final C23574eu mo28848a() {
        return this.f64470f;
    }

    /* renamed from: b */
    public final Collection mo28849b() {
        return C69540x.m100947e(this.f64471g, this.f64472h, this.f64473i, this.f64474j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23557ed)) {
            return false;
        }
        C23557ed edVar = (C23557ed) obj;
        return this.f64470f == edVar.f64470f && C69664n.m101066l(this.f64471g, edVar.f64471g) && C69664n.m101066l(this.f64472h, edVar.f64472h) && C69664n.m101066l(this.f64473i, edVar.f64473i) && C69664n.m101066l(this.f64474j, edVar.f64474j);
    }

    public final int hashCode() {
        return (((((((this.f64470f.hashCode() * 31) + this.f64471g.hashCode()) * 31) + this.f64472h.hashCode()) * 31) + this.f64473i.hashCode()) * 31) + this.f64474j.hashCode();
    }

    public final String toString() {
        C23574eu euVar = this.f64470f;
        C23401ad adVar = this.f64471g;
        C23523cx cxVar = this.f64472h;
        C23403af afVar = this.f64473i;
        C23399ab abVar = this.f64474j;
        return "HomeAutomationRunCycleTrait(typeVal=" + euVar + ", currentRunCycleParameter=" + adVar + ", nextCycleParameter=" + cxVar + ", currentTotalRemainingTimeParameter=" + afVar + ", currentCycleRemainingTimeParameter=" + abVar + ")";
    }
}
