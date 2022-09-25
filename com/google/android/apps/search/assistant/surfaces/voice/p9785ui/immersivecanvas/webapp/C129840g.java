package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.webapp;

import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65507aa;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65515ai;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5100a.p5103b.p5104a.C65542z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.webapp.g */
/* compiled from: PG */
public final /* synthetic */ class C129840g implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ CanvasWebAppFragmentPeer f356234a;

    public /* synthetic */ C129840g(CanvasWebAppFragmentPeer canvasWebAppFragmentPeer) {
        this.f356234a = canvasWebAppFragmentPeer;
    }

    public final void accept(Object obj) {
        CanvasWebAppFragmentPeer canvasWebAppFragmentPeer = this.f356234a;
        C65515ai aiVar = (C65515ai) obj;
        C65542z zVar = (C65542z) C65507aa.f178066c.createBuilder();
        zVar.copyOnWrite();
        C65507aa aaVar = (C65507aa) zVar.instance;
        aiVar.getClass();
        aaVar.f178069b = aiVar;
        aaVar.f178068a = 2;
        canvasWebAppFragmentPeer.mo109271f((C65507aa) zVar.build());
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
