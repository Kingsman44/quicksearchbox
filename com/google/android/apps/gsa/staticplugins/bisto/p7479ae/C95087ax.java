package com.google.android.apps.gsa.staticplugins.bisto.p7479ae;

import com.google.android.apps.gsa.staticplugins.bisto.p7489g.C95373bx;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60091kk;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ae.ax */
/* compiled from: PG */
final class C95087ax extends C95095be {

    /* renamed from: a */
    final /* synthetic */ C95097bg f266001a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95087ax(C95097bg bgVar) {
        super(bgVar, "IDLE");
        this.f266001a = bgVar;
    }

    /* renamed from: a */
    public final void mo89003a() {
        super.mo89003a();
        C59104x b = C95097bg.f266015a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "QueryHandler");
        ((C59052c) ((C59052c) b).mo56372aa(18003)).mo56386p("Idle, end interaction");
        C95097bg bgVar = this.f266001a;
        bgVar.f266045q.mo89125d(bgVar.f266051w);
        this.f266001a.f266044p.mo89277r(2);
        C95097bg bgVar2 = this.f266001a;
        String str = bgVar2.f266029M.f266012d;
        C95832d dVar = bgVar2.f266052x;
        if (dVar != null) {
            dVar.mo89809j(C60091kk.HOTWORD_AUDIO_VOICE_STOP);
            bgVar2.f266052x = null;
        }
        if (bgVar2.f266026J != null && !bgVar2.f266017A) {
            C95373bx bxVar = bgVar2.f266047s;
            if (bxVar != null) {
                bxVar.f266875e = 3;
            }
            bgVar2.f266026J.mo89048b();
            bgVar2.f266026J = null;
        }
        bgVar2.f266023G = null;
        bgVar2.f266053y = false;
        bgVar2.f266054z = false;
        bgVar2.f266021E = false;
        bgVar2.f266018B = false;
        bgVar2.f266019C = false;
        bgVar2.f266020D = null;
        bgVar2.mo89015b();
        this.f266001a.f266042n.f266450d.mo89149b(false);
        C95097bg bgVar3 = this.f266001a;
        bgVar3.f266017A = false;
        bgVar3.mo89021i(5);
        this.f266001a.f266027K = 0;
    }

    /* renamed from: d */
    public final void mo89006d() {
    }
}
