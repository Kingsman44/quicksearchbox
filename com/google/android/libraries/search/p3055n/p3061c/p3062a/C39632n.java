package com.google.android.libraries.search.p3055n.p3061c.p3062a;

import android.content.Context;
import android.service.voice.AlwaysOnHotwordDetector;
import androidx.p104d.p105a.C2164c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39457g;
import com.google.android.libraries.search.p3055n.p3061c.p3062a.p3065c.C39458h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62910ar;
import com.google.protobuf.p4750c.C62948a;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.libraries.search.n.c.a.n */
/* compiled from: PG */
final class C39632n extends AlwaysOnHotwordDetector.Callback {

    /* renamed from: a */
    final /* synthetic */ C2164c f104314a;

    /* renamed from: b */
    final /* synthetic */ C39633o f104315b;

    public C39632n(C39633o oVar, C2164c cVar) {
        this.f104315b = oVar;
        this.f104314a = cVar;
    }

    public final void onAvailabilityChanged(int i) {
        C39633o oVar = this.f104315b;
        String a = C39386ab.m68780a(i);
        String str = oVar.f104330o;
        oVar.mo41963d(str + " -> " + a);
        oVar.f104330o = a;
        C39633o oVar2 = this.f104315b;
        if (oVar2.f104333r == null) {
            C39458h hVar = oVar2.f104327l;
            AlwaysOnHotwordDetector alwaysOnHotwordDetector = oVar2.f104332q;
            alwaysOnHotwordDetector.getClass();
            C21370a aVar = (C21370a) hVar.f103880a.mo17428b();
            aVar.getClass();
            ScheduledExecutorService scheduledExecutorService = (ScheduledExecutorService) hVar.f103881b.mo17428b();
            scheduledExecutorService.getClass();
            Context context = (Context) hVar.f103882c.mo17428b();
            context.getClass();
            Executor executor = (Executor) hVar.f103883d.mo17428b();
            executor.getClass();
            oVar2.f104333r = new C39457g(alwaysOnHotwordDetector, i, aVar, scheduledExecutorService, context, executor);
        }
        C39457g gVar = this.f104315b.f104333r;
        C59104x b = C39457g.f103868a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "DspModelEnrollmentMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53668)).mo56387q("alwaysOnHotwordDetectorAvailability  %d", i);
        String a2 = C39386ab.m68780a(i);
        String str2 = gVar.f103876i;
        gVar.mo41843b(str2 + " -> " + a2);
        gVar.f103876i = a2;
        gVar.f103873f.getAndSet(i);
        C58833ax axVar = (C58833ax) gVar.f103874g.get();
        if (axVar.mo56113h()) {
            ((C2164c) axVar.mo56107c()).mo5437b(Integer.valueOf(i));
        }
        C59104x b2 = C39633o.f104316a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b2).mo56372aa(53480)).mo56387q("#onAvailabilityChanged alwaysOnHotwordDetectorAvailability: %d", i);
        this.f104314a.mo5437b((Object) null);
    }

    public final void onDetected(AlwaysOnHotwordDetector.EventPayload eventPayload) {
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53481)).mo56386p("#onDetected. DSP hotword detected");
        this.f104315b.f104328m.mo41869c(C37176a.f97281ib);
        C39633o oVar = this.f104315b;
        C62910ar j = C62948a.m95459j(oVar.f104323h.mo26871c());
        oVar.f104326k.set(false);
        C60870cx b2 = oVar.f104318c.mo51512b(new C39534h(oVar, eventPayload, j), oVar.f104319d);
        C60845bz n = C47810es.m84974n(new C39631m(oVar));
        C60856cj.m92911t(b2, C47810es.m84974n(n), oVar.f104319d);
    }

    public final void onError() {
        this.f104315b.f104326k.set(false);
        C59104x d = C39633o.f104316a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) d).mo56372aa(53482)).mo56386p("onError");
        this.f104315b.mo41963d("ERROR_REPORTED_BY_ALWAYS_ON_HOTWORD_DETECTOR");
        C39390af afVar = this.f104315b.f104331p;
        afVar.getClass();
        C39638t tVar = new C39638t();
        tVar.mo41807b(C39392ah.DSP_ERROR);
        tVar.f104350a = "AlwaysOnHotwordDetector.Callback#onError";
        afVar.mo41801a(tVar.mo41806a());
    }

    public final void onRecognitionPaused() {
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53483)).mo56386p("onRecognitionPaused ");
        this.f104315b.mo41963d("PAUSE_REPORTED_BY_ALWAYS_ON_HOTWORD_DETECTOR");
    }

    public final void onRecognitionResumed() {
        C59104x b = C39633o.f104316a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "AOHotwordDetectorMgr");
        ((C59052c) ((C59052c) b).mo56372aa(53484)).mo56386p("onRecognitionResumed ");
        this.f104315b.mo41963d("RESUME_REPORTED_BY_ALWAYS_ON_HOTWORD_DETECTOR");
    }
}
