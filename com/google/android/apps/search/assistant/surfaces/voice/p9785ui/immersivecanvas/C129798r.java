package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas;

import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129714c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9844b.C129715d;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129836c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.C129841h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp.CanvasWebAppFragmentPeer;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a.C128548e;
import com.google.assistant.p3897e.p3921j.p3926e.C51856bq;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65508ab;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65509ac;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.r */
/* compiled from: PG */
public final /* synthetic */ class C129798r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C128548e f356138a;

    public /* synthetic */ C129798r(C128548e eVar) {
        this.f356138a = eVar;
    }

    public final void accept(Object obj) {
        C129714c cVar;
        C128548e eVar = this.f356138a;
        C59071e eVar2 = C129739aa.f356023a;
        CanvasWebAppFragmentPeer a = ((C129836c) obj).mo17754z();
        C129715d dVar = (C129715d) eVar.f353476a;
        if (dVar.f355959a == 1) {
            cVar = (C129714c) dVar.f355960b;
        } else {
            cVar = C129714c.f355952d;
        }
        int i = 2;
        if (cVar.f355955b) {
            ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38494)).mo56386p("Enter Continuous Match Mode");
            C65508ab abVar = (C65508ab) C65509ac.f178070c.createBuilder();
            abVar.copyOnWrite();
            ((C65509ac) abVar.instance).f178072a = 2;
            a.mo109272g((C65509ac) abVar.build());
            return;
        }
        ((C59052c) ((C59052c) CanvasWebAppFragmentPeer.f356144a.mo56224b()).mo56372aa(38493)).mo56386p("Exit Continuous Match Mode");
        int a2 = C51856bq.m86401a(cVar.f355956c);
        if (a2 == 0) {
            a2 = 1;
        }
        C129841h hVar = C129841h.NO_CONTENT;
        int i2 = a2 - 1;
        if (i2 == 1) {
            i = 3;
        } else if (i2 == 2) {
            i = 5;
        }
        a.mo109274i(i);
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
