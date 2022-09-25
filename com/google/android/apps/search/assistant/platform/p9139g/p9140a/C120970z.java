package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import com.google.assistant.p3931f.p3939c.C52813ac;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.rendering.widgets.ActionsServiceSessionImpl$collectResponses$9", mo61344c = "ActionsServiceSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {183})
/* renamed from: com.google.android.apps.search.assistant.platform.g.a.z */
/* compiled from: PG */
final class C120970z extends C69572j implements C69630p {

    /* renamed from: a */
    int f336316a;

    /* renamed from: b */
    final /* synthetic */ C120917am f336317b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120970z(C120917am amVar, C69577g gVar) {
        super(2, gVar);
        this.f336317b = amVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120970z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336316a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException unused) {
                this.f336317b.f336196q.mo62909P(C120918an.CANCELED);
                C120917am amVar = this.f336317b;
                amVar.f336183d.mo96812c(C120918an.CANCELED, (C52813ac) amVar.f336190k.get());
            }
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f336317b.f336196q;
            this.f336316a = 1;
            obj = zVar.mo62825a(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C120917am amVar2 = this.f336317b;
        amVar2.f336183d.mo96812c((C120918an) obj, (C52813ac) amVar2.f336190k.get());
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120970z(this.f336317b, gVar);
    }
}
