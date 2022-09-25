package com.google.android.apps.gsa.staticplugins.bisto.p7510o.p7512b;

import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95288a;
import com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95832d;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.gsa.p1876k.p1879c.C22865a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60091kk;
import java.util.concurrent.Semaphore;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.o.b.q */
/* compiled from: PG */
final class C95753q extends C95754r {

    /* renamed from: a */
    final /* synthetic */ C95759w f268071a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C95753q(C95759w wVar) {
        super(wVar);
        this.f268071a = wVar;
    }

    /* renamed from: e */
    public final void mo89735e() {
        synchronized (this.f268071a) {
            C58976aa aaVar = C58975e.f156826a;
            this.f268071a.f268081B = null;
            C22872h.m42742b(C22865a.class);
            C95759w wVar = this.f268071a;
            C95832d dVar = wVar.f268106q;
            if (dVar != null) {
                dVar.mo89804e(C60091kk.HOTWORD_RECOGNIZED_SECOND_STAGE, C95832d.m158873b(wVar.f268103n));
            }
            if (this.f268071a.f268104o.mo83479y()) {
                C59104x b = C95759w.f268078a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b).mo56372aa(15398)).mo56386p("hotword suppressed by watch");
                this.f268071a.f268104o.mo83458d();
                C95759w wVar2 = this.f268071a;
                wVar2.f268100k.mo89293f(wVar2.f268093d);
                this.f268071a.mo89747m(C95748l.NONE);
                this.f268071a.mo89746l();
                return;
            }
            C95760x xVar = this.f268071a.f268099j;
            C59104x b2 = C95760x.f268116a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "HotwordStage2Listener");
            ((C59052c) ((C59052c) b2).mo56372aa(15444)).mo56386p("onSecondStageRecognized()");
            if (xVar.f268119d.mo83553h("bistoVibrate")) {
                C59104x b3 = C95760x.f268116a.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "HotwordStage2Listener");
                ((C59052c) ((C59052c) b3).mo56372aa(15443)).mo56386p("doVibrate()");
                if (xVar.f268118c.hasVibrator()) {
                    xVar.f268118c.vibrate(C95760x.f268117b, -1);
                }
            }
            if (xVar.f268120e.mo89026d()) {
                C59104x b4 = C95760x.f268116a.mo56224b();
                b4.mo56378ag(C58975e.f156826a, "HotwordStage2Listener");
                ((C59052c) ((C59052c) b4).mo56372aa(15445)).mo56386p("About to play start sound");
                xVar.f268120e.mo89023b();
            }
            C95759w wVar3 = this.f268071a;
            wVar3.f268100k.mo89292e(wVar3.f268093d);
            C95759w wVar4 = this.f268071a;
            if (wVar4.f268105p.mo89131j()) {
                wVar4.f268105p.mo89133l();
            } else {
                wVar4.f268105p.mo89132k(new C95288a(), true);
            }
            if (this.f268071a.f268094e.mo89695r()) {
                C59104x b5 = C95759w.f268078a.mo56224b();
                b5.mo56378ag(C58975e.f156826a, "HotwordStage2");
                ((C59052c) ((C59052c) b5).mo56372aa(15397)).mo56386p("isInVoiceQuery cancelling it");
                Semaphore semaphore = new Semaphore(0);
                this.f268071a.f268096g.mo28212l("finishGsaDialogWithMinorDelay", new C95752p(this, semaphore));
                semaphore.acquireUninterruptibly();
            }
            this.f268071a.mo89747m(C95748l.RECOGNIZING_CACHING);
        }
    }
}
