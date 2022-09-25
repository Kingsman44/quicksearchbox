package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.assistant.shared.d.l;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p4008y.p4009a.C53602k;
import com.google.assistant.p4008y.p4009a.C53606o;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.oc */
/* compiled from: PG */
public final /* synthetic */ class C109757oc implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C109759oe f305802a;

    /* renamed from: b */
    public final /* synthetic */ C109040fj f305803b;

    /* renamed from: c */
    public final /* synthetic */ C109258hw f305804c;

    /* renamed from: d */
    public final /* synthetic */ C107698i f305805d;

    /* renamed from: e */
    public final /* synthetic */ int f305806e;

    public /* synthetic */ C109757oc(C109759oe oeVar, C109040fj fjVar, C109258hw hwVar, int i, C107698i iVar) {
        this.f305802a = oeVar;
        this.f305803b = fjVar;
        this.f305804c = hwVar;
        this.f305806e = i;
        this.f305805d = iVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C109759oe oeVar = this.f305802a;
        C109040fj fjVar = this.f305803b;
        C109258hw hwVar = this.f305804c;
        int i = this.f305806e;
        C107698i iVar = this.f305805d;
        l lVar = (l) obj;
        if (!(lVar == null || (lVar.a & 2) == 0)) {
            C53606o oVar = lVar.c;
            if (oVar == null) {
                oVar = C53606o.f140698f;
            }
            if (!((oVar.f140700a & 8) == 0 || !oVar.f140704e.equals(oeVar.f305813e.b()) || (oVar.f140700a & 2) == 0)) {
                C53602k kVar = oVar.f140702c;
                if (kVar == null) {
                    kVar = C53602k.f140687b;
                }
                if (!kVar.f140689a.isEmpty()) {
                    C53602k kVar2 = oVar.f140702c;
                    if (kVar2 == null) {
                        kVar2 = C53602k.f140687b;
                    }
                    if (((Boolean) Collection.EL.stream(kVar2.f140689a).filter(C109750nx.f305769a).flatMap(C109751ny.f305770a).filter(C109752nz.f305771a).map(new C109755oa(oeVar, hwVar)).reduce(false, C109756ob.f305801a)).booleanValue()) {
                        fjVar.mo97503bM();
                        oeVar.f305810b.mo95369K(false, 0, C58836b.f156633a);
                        oeVar.f305816h.mo100730c();
                    }
                    return C60856cj.m92900i(true);
                }
            }
        }
        return oeVar.mo98102i(fjVar, i, iVar);
    }
}
