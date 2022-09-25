package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120420b;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120481c;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120507d;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120516m;
import com.google.android.libraries.assistant.hotword.p1516b.C18343b;
import com.google.android.libraries.assistant.hotword.p1516b.C18350i;
import com.google.android.libraries.search.p2904c.C37357av;
import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37405bj;
import com.google.android.libraries.search.p2904c.C37406bk;
import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37409bn;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37419bx;
import com.google.android.libraries.search.p2904c.C37702ie;
import com.google.android.libraries.search.p2904c.C37703if;
import com.google.android.libraries.search.p2904c.p2933j.C37705a;
import com.google.android.libraries.search.p2904c.p2933j.C37773c;
import com.google.android.libraries.search.p2904c.p2933j.p2934a.p2937c.p2938a.C37746f;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60803ak;
import com.google.common.util.concurrent.C60812at;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.q */
/* compiled from: PG */
public final /* synthetic */ class C120409q implements C60803ak {

    /* renamed from: a */
    public final /* synthetic */ C120416x f334918a;

    public /* synthetic */ C120409q(C120416x xVar) {
        this.f334918a = xVar;
    }

    /* renamed from: a */
    public final Object mo23284a(C60812at atVar) {
        Optional optional;
        C120416x xVar = this.f334918a;
        C37419bx bxVar = xVar.f334933b;
        C37406bk bkVar = (C37406bk) C37407bl.f99325c.createBuilder();
        C37705a aVar = (C37705a) C37773c.f100243c.createBuilder();
        C37746f fVar = C37746f.f100178a;
        aVar.copyOnWrite();
        C37773c cVar = (C37773c) aVar.instance;
        fVar.getClass();
        cVar.f100246b = fVar;
        cVar.f100245a = 21;
        bkVar.copyOnWrite();
        C37407bl blVar = (C37407bl) bkVar.instance;
        C37773c cVar2 = (C37773c) aVar.build();
        cVar2.getClass();
        blVar.f99328b = cVar2;
        blVar.f99327a |= 1;
        C37407bl blVar2 = (C37407bl) bkVar.build();
        C120507d dVar = xVar.f334936e;
        Optional optional2 = xVar.f334937f;
        if (!optional2.isPresent() || (((C18343b) optional2.get()).f52031a & 1) == 0) {
            optional = Optional.empty();
        } else {
            C18350i iVar = ((C18343b) optional2.get()).f52032b;
            if (iVar == null) {
                iVar = C18350i.f52041d;
            }
            optional = Optional.m71637of(iVar);
        }
        C37409bn bnVar = (C37409bn) C37410bo.f99330k.createBuilder();
        C37357av avVar = (C37357av) C37360ay.f99224l.createBuilder();
        C120516m mVar = (C120516m) dVar;
        int i = mVar.f335165c;
        avVar.copyOnWrite();
        C37360ay ayVar = (C37360ay) avVar.instance;
        ayVar.f99226a |= 2;
        ayVar.f99228c = i;
        C120481c cVar3 = C120481c.f335068a;
        C120420b bVar = C120420b.MONO;
        int ordinal = mVar.f335164b.ordinal();
        if (ordinal == 0) {
            avVar.copyOnWrite();
            C37360ay ayVar2 = (C37360ay) avVar.instance;
            ayVar2.f99226a |= 4;
            ayVar2.f99229d = 16;
        } else if (ordinal == 1) {
            avVar.copyOnWrite();
            C37360ay ayVar3 = (C37360ay) avVar.instance;
            ayVar3.f99226a |= 4;
            ayVar3.f99229d = 12;
        }
        if (mVar.f335163a.ordinal() == 0) {
            avVar.copyOnWrite();
            C37360ay ayVar4 = (C37360ay) avVar.instance;
            ayVar4.f99226a |= 8;
            ayVar4.f99230e = 2;
        }
        C37360ay ayVar5 = (C37360ay) avVar.build();
        bnVar.copyOnWrite();
        C37410bo boVar = (C37410bo) bnVar.instance;
        ayVar5.getClass();
        boVar.f99337f = ayVar5;
        boVar.f99332a |= 1;
        if (optional.isPresent() && (((C18350i) optional.get()).f52043a & 2) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            C37702ie ieVar = (C37702ie) C37703if.f100132c.createBuilder();
            String str = ((C18350i) optional.get()).f52044b;
            ieVar.copyOnWrite();
            C37703if ifVar = (C37703if) ieVar.instance;
            str.getClass();
            ifVar.f100134a |= 1;
            ifVar.f100135b = str;
            bnVar.copyOnWrite();
            C37410bo boVar2 = (C37410bo) bnVar.instance;
            C37703if ifVar2 = (C37703if) ieVar.build();
            ifVar2.getClass();
            boVar2.f99334c = ifVar2;
            boVar2.f99333b = 13;
        }
        C39226b bVar2 = C39226b.TAG_ASSISTANT_PLATFORM;
        bnVar.copyOnWrite();
        C37410bo boVar3 = (C37410bo) bnVar.instance;
        boVar3.f99336e = Integer.valueOf(bVar2.getNumber());
        boVar3.f99335d = 14;
        bnVar.copyOnWrite();
        C37410bo boVar4 = (C37410bo) bnVar.instance;
        boVar4.f99332a |= 64;
        boVar4.f99339h = true;
        C37405bj b = bxVar.mo40943b(blVar2, (C37410bo) bnVar.build());
        b.mo40941b().mo40939e().mo4106b(C120408p.f334917a, xVar.f334934c);
        atVar.mo57268a(new C120413u(b), xVar.f334934c);
        return b;
    }
}
