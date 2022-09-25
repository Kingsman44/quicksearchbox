package com.google.android.apps.gsa.shared.bisto.p7028a;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124608aa;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124609ab;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124621an;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124623ap;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124643bi;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124644bj;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124707e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124708f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124709g;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124716n;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124717o;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import java.util.Collection;

/* renamed from: com.google.android.apps.gsa.shared.bisto.a.ab */
/* compiled from: PG */
final class C89436ab extends C89473bl {

    /* renamed from: a */
    final /* synthetic */ Collection f242447a;

    /* renamed from: b */
    final /* synthetic */ Boolean f242448b;

    /* renamed from: c */
    final /* synthetic */ int f242449c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89436ab(C89474bm bmVar, String str, int i, Collection collection, Boolean bool) {
        super(bmVar, str, 37);
        this.f242449c = i;
        this.f242447a = collection;
        this.f242448b = bool;
    }

    /* renamed from: a */
    public final C124709g mo83351a(C124709g gVar) {
        C124708f c = C89474bm.m145533c(gVar);
        C124621an f = C89474bm.m145536f(c);
        C124717o oVar = ((C124623ap) f.instance).f343778h;
        if (oVar == null) {
            oVar = C124717o.f344082m;
        }
        C124716n nVar = (C124716n) oVar.toBuilder();
        C124644bj bjVar = ((C124709g) c.instance).f344053c;
        if (bjVar == null) {
            bjVar = C124644bj.f343868n;
        }
        C124609ab abVar = bjVar.f343879j;
        if (abVar == null) {
            abVar = C124609ab.f343726f;
        }
        C124608aa aaVar = (C124608aa) abVar.toBuilder();
        int i = this.f242449c;
        aaVar.copyOnWrite();
        C124609ab abVar2 = (C124609ab) aaVar.instance;
        abVar2.f343729b = i - 1;
        abVar2.f343728a |= 1;
        int i2 = 3;
        if (this.f242449c == 3 && ((C124717o) nVar.instance).f344087d) {
            C59104x d = C89474bm.f242494a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
            ((C59052c) ((C59052c) d).mo56372aa(10337)).mo56386p("Hotword is no longer supported; HOTWORD_ENABLED is set to false");
            nVar.copyOnWrite();
            C124717o oVar2 = (C124717o) nVar.instance;
            oVar2.f344084a |= 4;
            oVar2.f344087d = false;
        }
        Collection collection = this.f242447a;
        C124717o oVar3 = (C124717o) nVar.instance;
        if ((oVar3.f344084a & 2) != 0) {
            C124707e a = C124707e.m204372a(oVar3.f344086c);
            if (a == null) {
                a = C124707e.UNKNOWN_MODE;
            }
            if (!collection.contains(a)) {
                C59104x d2 = C89474bm.f242494a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "BistoDeviceDatabase");
                ((C59052c) ((C59052c) d2).mo56372aa(10336)).mo56386p("Available audio modes have changed; previous mode is no longer supported.");
            }
        }
        aaVar.copyOnWrite();
        ((C124609ab) aaVar.instance).f343730c = C124609ab.emptyIntList();
        Collection<C124707e> collection2 = this.f242447a;
        aaVar.copyOnWrite();
        C124609ab abVar3 = (C124609ab) aaVar.instance;
        C62961ch chVar = abVar3.f343730c;
        if (!chVar.mo58948c()) {
            abVar3.f343730c = C62942bv.mutableCopy(chVar);
        }
        for (C124707e eVar : collection2) {
            abVar3.f343730c.mo58916g(eVar.f344048d);
        }
        if (true == this.f242448b.booleanValue()) {
            i2 = 2;
        }
        aaVar.copyOnWrite();
        C124609ab abVar4 = (C124609ab) aaVar.instance;
        abVar4.f343731e = i2 - 1;
        abVar4.f343728a |= 2;
        f.copyOnWrite();
        C124623ap apVar = (C124623ap) f.instance;
        C124717o oVar4 = (C124717o) nVar.build();
        oVar4.getClass();
        apVar.f343778h = oVar4;
        apVar.f343771a |= 64;
        c.copyOnWrite();
        C124709g gVar2 = (C124709g) c.instance;
        C124623ap apVar2 = (C124623ap) f.build();
        apVar2.getClass();
        gVar2.f344052b = apVar2;
        gVar2.f344051a |= 1;
        C124643bi h = C89474bm.m145538h(c);
        h.copyOnWrite();
        C124644bj bjVar2 = (C124644bj) h.instance;
        C124609ab abVar5 = (C124609ab) aaVar.build();
        abVar5.getClass();
        bjVar2.f343879j = abVar5;
        bjVar2.f343870a |= 256;
        c.copyOnWrite();
        C124709g gVar3 = (C124709g) c.instance;
        C124644bj bjVar3 = (C124644bj) h.build();
        bjVar3.getClass();
        gVar3.f344053c = bjVar3;
        gVar3.f344051a |= 2;
        return (C124709g) c.build();
    }
}
