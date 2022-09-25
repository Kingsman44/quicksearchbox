package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126935c;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9520a.C126936d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.C127811d;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127794k;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127803t;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.C127804u;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p3186j$.time.Instant;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ExecutionReporter$reportSuccessfulExecution$1", mo61344c = "ExecutionReporter.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ad */
/* compiled from: PG */
final class C126944ad extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C126935c f349520a;

    /* renamed from: b */
    final /* synthetic */ C126936d f349521b;

    /* renamed from: c */
    final /* synthetic */ Instant f349522c;

    /* renamed from: d */
    final /* synthetic */ C127811d f349523d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126944ad(C127811d dVar, C126935c cVar, C126936d dVar2, Instant instant, C69577g gVar) {
        super(2, gVar);
        this.f349523d = dVar;
        this.f349520a = cVar;
        this.f349521b = dVar2;
        this.f349522c = instant;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126944ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C127811d dVar = this.f349523d;
        C126935c cVar = this.f349520a;
        C126936d dVar2 = this.f349521b;
        Instant instant = this.f349522c;
        C69664n.m101061g(instant, "timestamp");
        C59052c cVar2 = (C59052c) C127811d.f351784a.mo56224b();
        cVar2.mo56379ah(new C59094n(37658));
        cVar2.mo56354G("Recording successful %s execution with %s modality", cVar, dVar2);
        if (cVar.equals(C126935c.INPUT_PLATE)) {
            if (dVar2.equals(C126936d.VOICE)) {
                C127804u uVar = dVar.f351785b;
                C46459k.m82829b(uVar.f351768a.mo40256t(C127803t.f351767a, uVar.f351769b), "Recording voice query execution failed", new Object[0]);
            }
            C127804u uVar2 = dVar.f351785b;
            C46459k.m82829b(uVar2.f351768a.mo40256t(new C127794k(instant), uVar2.f351769b), "Recording query execution failed", new Object[0]);
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126944ad(this.f349523d, this.f349520a, this.f349521b, this.f349522c, gVar);
    }
}
