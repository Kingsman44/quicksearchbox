package com.google.android.libraries.lens.view.p2159q;

import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24439aa;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24440ab;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24446ah;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24450e;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24456k;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24458m;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24459n;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24465t;
import com.google.android.libraries.lens.ondevice.p2026f.p2027a.p2028a.C24471z;
import com.google.android.libraries.mdi.download.C28713as;
import com.google.android.libraries.mdi.download.C28716av;
import com.google.android.libraries.mdi.download.C28739bq;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29436g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.q.ad */
/* compiled from: PG */
public final /* synthetic */ class C27583ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27608bb f75383a;

    /* renamed from: b */
    public final /* synthetic */ List f75384b;

    /* renamed from: c */
    public final /* synthetic */ C24450e f75385c;

    public /* synthetic */ C27583ad(C27608bb bbVar, List list, C24450e eVar) {
        this.f75383a = bbVar;
        this.f75384b = list;
        this.f75385c = eVar;
    }

    public final Object apply(Object obj) {
        C58833ax axVar;
        C58833ax axVar2;
        C60870cx cxVar;
        int a;
        C27608bb bbVar = this.f75383a;
        List<C24471z> list = this.f75384b;
        C24450e eVar = this.f75385c;
        List list2 = (List) obj;
        if (list.isEmpty()) {
            return bbVar.f75435k;
        }
        ArrayList arrayList = new ArrayList();
        for (C24471z zVar : list) {
            C24465t tVar = zVar.f66983b;
            if (tVar == null) {
                tVar = C24465t.f66964f;
            }
            C24465t tVar2 = tVar;
            String str = tVar2.f66970e;
            C27638l lVar = new C27638l(eVar, tVar2);
            C28739bq m = C28740br.m53599m();
            C24459n nVar = zVar.f66984c;
            if (nVar == null) {
                nVar = C24459n.f66948g;
            }
            if ((nVar.f66950a & 8) != 0) {
                C24459n nVar2 = zVar.f66984c;
                if (nVar2 == null) {
                    nVar2 = C24459n.f66948g;
                }
                axVar = C58833ax.m90834k(nVar2.f66954e);
            } else {
                axVar = C58836b.f156633a;
            }
            C24459n nVar3 = zVar.f66984c;
            if (((nVar3 == null ? C24459n.f66948g : nVar3).f66950a & 16) != 0) {
                if (nVar3 == null) {
                    nVar3 = C24459n.f66948g;
                }
                axVar2 = C58833ax.m90834k(nVar3.f66955f);
            } else {
                axVar2 = C58836b.f156633a;
            }
            C24465t tVar3 = zVar.f66983b;
            if (tVar3 == null) {
                tVar3 = C24465t.f66964f;
            }
            String str2 = tVar3.f66970e;
            if (str2.isEmpty()) {
                C24465t tVar4 = zVar.f66983b;
                if (tVar4 == null) {
                    tVar4 = C24465t.f66964f;
                }
                m.mo34338d(tVar4.f66967b);
                m.mo34340f(true);
            } else {
                m.mo34338d(str2);
                C24465t tVar5 = zVar.f66983b;
                if (tVar5 == null) {
                    tVar5 = C24465t.f66964f;
                }
                ((C29436g) m).f79803c = C58833ax.m90834k(tVar5.f66967b);
            }
            C29436g gVar = (C29436g) m;
            gVar.f79804d = axVar;
            gVar.f79805e = axVar2;
            gVar.f79807g = C58833ax.m90834k(lVar);
            C28713as asVar = (C28713as) C28716av.f78018d.createBuilder();
            C24459n nVar4 = zVar.f66984c;
            if (nVar4 == null) {
                nVar4 = C24459n.f66948g;
            }
            int i = 2;
            int i2 = ((!nVar4.f66951b || (nVar4.f66950a & 2) != 0) && ((a = C24456k.m45538a(nVar4.f66952c)) == 0 || a != 2)) ? 1 : 2;
            asVar.copyOnWrite();
            C28716av avVar = (C28716av) asVar.instance;
            avVar.f78022c = i2 - 1;
            avVar.f78020a |= 2;
            C24459n nVar5 = zVar.f66984c;
            if (nVar5 == null) {
                nVar5 = C24459n.f66948g;
            }
            int a2 = C24458m.m45539a(nVar5.f66953d);
            int i3 = (a2 != 0 && a2 == 2) ? 2 : 1;
            asVar.copyOnWrite();
            C28716av avVar2 = (C28716av) asVar.instance;
            avVar2.f78021b = i3 - 1;
            avVar2.f78020a |= 1;
            gVar.f79806f = C58833ax.m90834k((C28716av) asVar.build());
            C28740br a3 = m.mo34335a();
            C24459n nVar6 = zVar.f66984c;
            if (nVar6 == null) {
                nVar6 = C24459n.f66948g;
            }
            boolean z = nVar6.f66951b;
            if (z) {
                cxVar = ((C29409fd) bbVar.f75426b.mo27525b()).mo34715d(a3);
            } else {
                cxVar = ((C29409fd) bbVar.f75426b.mo27525b()).mo34714c(a3);
            }
            C60870cx cxVar2 = cxVar;
            bbVar.f75439o.put(a3.mo34350i(), cxVar2);
            C27608bb.m51392i(eVar, C27608bb.m51391e(tVar2, 1));
            C24439aa aaVar = (C24439aa) C24440ab.f66917g.createBuilder();
            aaVar.copyOnWrite();
            C24440ab abVar = (C24440ab) aaVar.instance;
            tVar2.getClass();
            abVar.f66920b = tVar2;
            abVar.f66919a |= 1;
            C24446ah ahVar = C24446ah.STATUS_SCHEDULED;
            aaVar.copyOnWrite();
            C24440ab abVar2 = (C24440ab) aaVar.instance;
            abVar2.f66922d = ahVar.f66939g;
            abVar2.f66919a |= 2;
            if (true != str.isEmpty()) {
                i = 3;
            }
            aaVar.copyOnWrite();
            C24440ab abVar3 = (C24440ab) aaVar.instance;
            abVar3.f66924f = i - 1;
            abVar3.f66919a |= 8;
            arrayList.add((C24440ab) aaVar.build());
            C60856cj.m92911t(cxVar2, C47810es.m84974n(new C27604ay(bbVar, zVar, eVar, z, str, tVar2)), bbVar.f75433i);
        }
        return arrayList;
    }
}
