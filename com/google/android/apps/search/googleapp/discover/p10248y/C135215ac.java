package com.google.android.apps.search.googleapp.discover.p10248y;

import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134268c;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134284d;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134286f;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134296p;
import com.google.android.apps.search.googleapp.discover.feedback.p10185a.C134297q;
import com.google.android.apps.search.googleapp.discover.streamui.p10233i.C134776i;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.p4283bv.p4354e.C57051b;
import java.util.ArrayList;
import java.util.List;
import p3186j$.time.Instant;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.y.ac */
/* compiled from: PG */
public final class C135215ac extends C135216ad {

    /* renamed from: a */
    public final C135274y f368313a;

    /* renamed from: b */
    public final Instant f368314b;

    /* renamed from: c */
    public final C60218r f368315c;

    /* renamed from: d */
    public final C135268s f368316d;

    /* renamed from: e */
    public final List f368317e;

    /* renamed from: f */
    public final C135272w f368318f;

    /* renamed from: g */
    public final List f368319g;

    /* renamed from: h */
    public final C134776i f368320h;

    /* renamed from: i */
    public final C57051b f368321i;

    /* renamed from: j */
    public final C135270u f368322j;

    /* renamed from: k */
    public final boolean f368323k;

    /* renamed from: l */
    private final C135257h f368324l;

    /* renamed from: m */
    private final List f368325m;

    public C135215ac(C135274y yVar, Instant instant, C60218r rVar, C135268s sVar, List list, C135272w wVar, List list2, C134776i iVar, C57051b bVar, C135257h hVar) {
        C69664n.m101061g(instant, "sessionCreateTime");
        C69664n.m101061g(rVar, "rootResponseEventId");
        C69664n.m101061g(list2, "elementsRenderData");
        C69664n.m101061g(bVar, "feedId");
        this.f368313a = yVar;
        this.f368314b = instant;
        this.f368315c = rVar;
        this.f368316d = sVar;
        this.f368317e = list;
        this.f368318f = wVar;
        this.f368319g = list2;
        this.f368320h = iVar;
        this.f368321i = bVar;
        this.f368324l = hVar;
        this.f368322j = hVar != null ? hVar.f368480a : null;
        boolean z = wVar.f368520b == 0;
        this.f368323k = z;
        C69469c cVar = new C69469c(10);
        if (sVar != null) {
            cVar.add(sVar);
        }
        if (hVar != null && z) {
            cVar.add(hVar.f368481b);
        }
        cVar.addAll(list);
        this.f368325m = C69540x.m100943a(cVar);
    }

    /* renamed from: a */
    public final C134286f mo111669a() {
        C134284d dVar = new C134284d();
        List list = dVar.f365788a;
        C134296p pVar = C134296p.PII;
        C69664n.m101061g(pVar, "sensitivity");
        ArrayList arrayList = new ArrayList();
        C134297q.m217880d("SessionRepresentation", this.f368313a.toString(), pVar, arrayList);
        C69540x.m100811r(list, arrayList);
        List list2 = dVar.f365788a;
        C134296p pVar2 = C134296p.NOT_SENSITIVE_OR_PII;
        C69664n.m101061g(pVar2, "sensitivity");
        ArrayList arrayList2 = new ArrayList();
        C135270u uVar = this.f368322j;
        if (uVar != null) {
            C134297q.m217880d("Failure reason", uVar.name(), pVar2, arrayList2);
        }
        C134297q.m217877a("Number of slices", this.f368325m.size(), pVar2, arrayList2);
        C69540x.m100811r(list2, arrayList2);
        C134268c.m217847b(this.f368318f.mo111669a(), dVar);
        return C134268c.m217846a("Renderable Stream with content", dVar);
    }

    /* renamed from: b */
    public final /* synthetic */ C135213aa mo112170b() {
        return this.f368313a;
    }

    /* renamed from: c */
    public final List mo112171c() {
        return this.f368325m;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C135215ac)) {
            return false;
        }
        C135215ac acVar = (C135215ac) obj;
        return C69664n.m101066l(this.f368313a, acVar.f368313a) && C69664n.m101066l(this.f368314b, acVar.f368314b) && C69664n.m101066l(this.f368315c, acVar.f368315c) && C69664n.m101066l(this.f368316d, acVar.f368316d) && C69664n.m101066l(this.f368317e, acVar.f368317e) && C69664n.m101066l(this.f368318f, acVar.f368318f) && C69664n.m101066l(this.f368319g, acVar.f368319g) && C69664n.m101066l(this.f368320h, acVar.f368320h) && C69664n.m101066l(this.f368321i, acVar.f368321i) && C69664n.m101066l(this.f368324l, acVar.f368324l);
    }

    public final int hashCode() {
        int hashCode = ((((this.f368313a.f368523a.hashCode() * 31) + this.f368314b.hashCode()) * 31) + this.f368315c.hashCode()) * 31;
        C135268s sVar = this.f368316d;
        int i = 0;
        int hashCode2 = (((((((((((hashCode + (sVar == null ? 0 : sVar.hashCode())) * 31) + this.f368317e.hashCode()) * 31) + this.f368318f.hashCode()) * 31) + this.f368319g.hashCode()) * 31) + this.f368320h.hashCode()) * 31) + this.f368321i.hashCode()) * 31;
        C135257h hVar = this.f368324l;
        if (hVar != null) {
            i = hVar.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        C135274y yVar = this.f368313a;
        Instant instant = this.f368314b;
        C60218r rVar = this.f368315c;
        C135268s sVar = this.f368316d;
        List list = this.f368317e;
        C135272w wVar = this.f368318f;
        List list2 = this.f368319g;
        C134776i iVar = this.f368320h;
        C57051b bVar = this.f368321i;
        C135257h hVar = this.f368324l;
        return "WithContent(sessionRepresentation=" + yVar + ", sessionCreateTime=" + instant + ", rootResponseEventId=" + rVar + ", preContentSlice=" + sVar + ", contentSlices=" + list + ", paginationData=" + wVar + ", elementsRenderData=" + list2 + ", toolbar=" + iVar + ", feedId=" + bVar + ", failureInfo=" + hVar + ")";
    }
}
