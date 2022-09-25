package com.google.android.apps.gsa.staticplugins.opamediaplayer;

import android.content.Context;
import com.google.android.apps.gsa.p6486s.C84263c;
import com.google.android.apps.gsa.p6486s.C84269i;
import com.google.android.apps.gsa.p6486s.C84272l;
import com.google.android.apps.gsa.p6486s.C84277q;
import com.google.android.apps.gsa.p6486s.C84278r;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.p7066m.C90049da;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115164a;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115165b;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115166c;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115167d;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115168e;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8643c.C115169f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8651g.C115484a;
import com.google.android.libraries.gsa.conversation.p1855h.C22695ah;
import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.assistant.p3897e.p3921j.C52173hy;
import com.google.assistant.p3897e.p3921j.C52174hz;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.w */
/* compiled from: PG */
public final /* synthetic */ class C115839w implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C115157bb f321238a;

    /* renamed from: b */
    public final /* synthetic */ C84278r f321239b;

    /* renamed from: c */
    public final /* synthetic */ boolean f321240c;

    /* renamed from: d */
    public final /* synthetic */ C58833ax f321241d;

    public /* synthetic */ C115839w(C115157bb bbVar, C84278r rVar, boolean z, C58833ax axVar) {
        this.f321238a = bbVar;
        this.f321239b = rVar;
        this.f321240c = z;
        this.f321241d = axVar;
    }

    /* renamed from: a */
    public final Object mo17947a() {
        int a;
        C115157bb bbVar = this.f321238a;
        C84278r rVar = this.f321239b;
        boolean z = this.f321240c;
        C58833ax axVar = this.f321241d;
        if (!((String) rVar.mo77771c().mo56109e("opa_media_player")).equals(bbVar.mo101860l())) {
            bbVar.mo101862n();
        }
        float f = 1.0f;
        if (bbVar.f319597h.mo79746e(C90049da.f248761c) && (rVar.mo77769a().f136913a & 256) != 0) {
            f = (float) rVar.mo77769a().f136920h;
        }
        Context context = bbVar.f319592c;
        C86124t tVar = bbVar.f319597h;
        float f2 = ((C115169f) bbVar.f319601l.f319612c.instance).f319630d;
        C115164a aVar = (C115164a) C115169f.f319625h.createBuilder();
        C52176ia a2 = rVar.mo77769a();
        aVar.copyOnWrite();
        C115169f fVar = (C115169f) aVar.instance;
        a2.getClass();
        fVar.f319628b = a2;
        fVar.f319627a |= 1;
        int i = (rVar.mo77769a().f136913a & 8) != 0 ? rVar.mo77769a().f136916d : 0;
        aVar.copyOnWrite();
        C115169f fVar2 = (C115169f) aVar.instance;
        fVar2.f319627a |= 2;
        fVar2.f319629c = i;
        aVar.copyOnWrite();
        C115169f fVar3 = (C115169f) aVar.instance;
        fVar3.f319627a |= 4;
        fVar3.f319630d = f2;
        aVar.copyOnWrite();
        C115169f fVar4 = (C115169f) aVar.instance;
        fVar4.f319627a |= 8;
        fVar4.f319631e = f;
        C58833ax d = rVar.mo77772d();
        if (d.mo56113h()) {
            C115165b bVar = (C115165b) C115168e.f319620c.createBuilder();
            C115166c cVar = (C115166c) C115167d.f319614d.createBuilder();
            String b = ((C84277q) d.mo56107c()).mo77779b();
            cVar.copyOnWrite();
            C115167d dVar = (C115167d) cVar.instance;
            b.getClass();
            dVar.f319616a |= 1;
            dVar.f319617b = b;
            C88431bb a3 = ((C84277q) d.mo56107c()).mo77778a();
            cVar.copyOnWrite();
            C115167d dVar2 = (C115167d) cVar.instance;
            a3.getClass();
            dVar2.f319618c = a3;
            dVar2.f319616a |= 2;
            C115167d dVar3 = (C115167d) cVar.build();
            bVar.copyOnWrite();
            C115168e eVar = (C115168e) bVar.instance;
            dVar3.getClass();
            eVar.f319623b = dVar3;
            eVar.f319622a |= 1;
            C115168e eVar2 = (C115168e) bVar.build();
            aVar.copyOnWrite();
            C115169f fVar5 = (C115169f) aVar.instance;
            eVar2.getClass();
            fVar5.f319632f = eVar2;
            fVar5.f319627a |= 16;
        }
        if (rVar.mo77771c().mo56113h()) {
            String str = (String) rVar.mo77771c().mo56107c();
            aVar.copyOnWrite();
            C115169f fVar6 = (C115169f) aVar.instance;
            str.getClass();
            fVar6.f319627a |= 32;
            fVar6.f319633g = str;
        }
        bbVar.f319601l = new C115162bg(context, tVar, (C115169f) aVar.build());
        bbVar.mo101866s(1);
        if (rVar.mo77770b().mo56113h()) {
            C52176ia a4 = rVar.mo77769a();
            if (a4.f136914b.size() >= 0 && (a = C52173hy.m86533a(((C52174hz) a4.f136914b.get(0)).f136903j)) != 0 && a == 3) {
                ((C22695ah) rVar.mo77770b().mo56107c()).mo27807a(C115484a.m191566a(rVar.mo77769a(), bbVar.f319597h));
            }
        }
        if (rVar.mo77773e()) {
            int i2 = rVar.mo77769a().f136916d;
            while (true) {
                if (i2 < rVar.mo77769a().f136914b.size()) {
                    if (C115157bb.m190863q((C52174hz) rVar.mo77769a().f136914b.get(i2))) {
                        break;
                    }
                    i2++;
                } else {
                    i2 = -1;
                    break;
                }
            }
            if (i2 != -1) {
                C84269i iVar = C84269i.PLAY;
                C84263c cVar2 = new C84263c();
                cVar2.mo77755b(i2);
                return bbVar.mo77788d(iVar, cVar2.mo77754a());
            }
            C59104x d2 = C115157bb.f319590a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
            ((C59052c) ((C59052c) d2).mo56372aa(29681)).mo56386p("Couldn't find any first item to play.");
        }
        if (bbVar.f319600k.mo56113h()) {
            C115159bd bdVar = new C115159bd((C115493i) bbVar.f319600k.mo56107c());
            C58976aa aaVar = C58975e.f156826a;
            if ((bdVar.mo77814t() || bdVar.mo77812r()) && z) {
                return bbVar.mo77787c(C84269i.STOP);
            }
        }
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C84272l.SUCCESS);
        }
        C58833ax b2 = bbVar.f319601l.mo101869b(((Integer) axVar.mo56107c()).intValue());
        if (b2.mo56113h()) {
            return bbVar.f319594e.mo28202b("update-metadata", new C115123aj(bbVar, b2));
        }
        C59104x d3 = C115157bb.f319590a.mo56226d();
        d3.mo56378ag(C58975e.f156826a, "OpaMediaPlayer");
        ((C59052c) ((C59052c) d3).mo56372aa(29680)).mo56386p("Update metadata requested but invalid media index given.");
        return C60856cj.m92900i(C84272l.SUCCESS);
    }
}
