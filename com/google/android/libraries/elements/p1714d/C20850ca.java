package com.google.android.libraries.elements.p1714d;

import com.google.android.libraries.elements.interfaces.C21231aa;
import com.google.android.libraries.elements.interfaces.C21236af;
import com.google.android.libraries.elements.interfaces.C21254ax;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21263bf;
import com.google.android.libraries.elements.interfaces.C21269bl;
import com.google.android.libraries.elements.interfaces.C21296cl;
import com.google.android.libraries.elements.interfaces.C21313t;
import com.google.android.libraries.elements.interfaces.FetcherResolver;
import com.google.android.libraries.elements.internal.C21359t;
import com.google.android.libraries.elements.p1714d.p1715a.C20783h;
import com.google.android.libraries.elements.p1714d.p1715a.C20784i;
import com.google.android.libraries.elements.p1714d.p1719e.p1720a.C20975g;
import com.google.common.base.C58833ax;
import com.google.protobuf.C62917ay;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.elements.d.ca */
/* compiled from: PG */
public final class C20850ca {
    /* renamed from: a */
    public static C21236af m39188a(C58833ax axVar, C58833ax axVar2) {
        return (C21236af) axVar.mo56109e((C21236af) axVar2.mo56109e(C21236af.f59567b));
    }

    /* renamed from: b */
    public static C21254ax m39189b(C21269bl blVar) {
        return new C20872cw(blVar, C20931e.f58701a, 160982084, C20842bz.f58401a, false);
    }

    /* renamed from: c */
    public static C21254ax m39190c(C21269bl blVar) {
        return new C20872cw(blVar, C20804aq.m39055a(), 158796327, C20836bt.f58395a, false);
    }

    /* renamed from: d */
    public static C21254ax m39191d(C21269bl blVar, C21313t tVar, C21296cl clVar, C21259bb bbVar, boolean z, C58833ax axVar, C58833ax axVar2, Map map) {
        C21259bb bbVar2 = bbVar;
        return new C20872cw(blVar, new C20822bf(((Boolean) axVar2.mo56109e(false)).booleanValue(), tVar, new C21359t(bbVar), clVar, bbVar, z, axVar.mo56113h() && axVar.mo56107c() == C21263bf.LAZY_INITIALIZATION, map), 191923252, C20841by.f58400a, false);
    }

    /* renamed from: e */
    public static C21254ax m39192e(C21269bl blVar, C21313t tVar, C21296cl clVar, C21259bb bbVar, Map map, C21236af afVar) {
        return new C20872cw(blVar, new C20917dm(new C21359t(bbVar), tVar, clVar, bbVar, afVar, map), 193805739, C20835bs.f58394a, false);
    }

    /* renamed from: f */
    public static C21254ax m39193f(C21269bl blVar, C21313t tVar, C21259bb bbVar) {
        return new C20872cw(blVar, new C20928dx(bbVar, tVar, new C21359t(bbVar)), 197633010, C20839bw.f58398a, false);
    }

    /* renamed from: g */
    public static C21254ax m39194g(C21269bl blVar, C21313t tVar, C21296cl clVar, C21259bb bbVar, Map map, C21236af afVar, boolean z, C58833ax axVar, C58833ax axVar2, C58833ax axVar3, C58833ax axVar4) {
        return new C20872cw(blVar, new C21072eh(tVar, clVar, bbVar, z, axVar.mo56113h() && axVar.mo56107c() == C21263bf.LAZY_INITIALIZATION, map, afVar, ((Boolean) axVar2.mo56109e(false)).booleanValue(), ((Boolean) axVar3.mo56109e(false)).booleanValue(), ((Boolean) axVar4.mo56109e(false)).booleanValue()), 158796380, C20838bv.f58397a, false);
    }

    /* renamed from: h */
    public static C21254ax m39195h(C20794ag agVar, C21269bl blVar) {
        return new C20872cw(blVar, agVar, 168777401, C20840bx.f58399a, false);
    }

    /* renamed from: i */
    public static C21254ax m39196i(C21269bl blVar, C21313t tVar, C20975g gVar, C58833ax axVar, C69464a aVar, C21259bb bbVar, C21359t tVar2, C20784i iVar, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C21231aa aaVar = (C21231aa) it.next();
            C62917ay a = aaVar.mo26704a();
            int a2 = a.mo58810a();
            C20783h hVar = new C20783h(iVar, a, aaVar);
            FetcherResolver sharedResolver = FetcherResolver.sharedResolver();
            if (sharedResolver != null) {
                sharedResolver.register(a2, hVar);
            }
        }
        C58833ax axVar2 = axVar;
        return new C20872cw(blVar, new C21119i(gVar, aVar, tVar, bbVar, tVar2, iVar), 158796298, C20837bu.f58396a, ((Boolean) axVar.mo56109e(true)).booleanValue());
    }
}
