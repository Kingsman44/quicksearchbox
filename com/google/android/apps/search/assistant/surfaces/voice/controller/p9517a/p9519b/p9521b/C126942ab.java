package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119834cb;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119863dd;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9529f.C127050h;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4580v.p4582b.C60942a;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71745ea;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConversationConnectionManagerImpl$stop$1", mo61344c = "ConversationConnectionManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.ab */
/* compiled from: PG */
final class C126942ab extends C69572j implements C69630p {

    /* renamed from: a */
    int f349496a;

    /* renamed from: b */
    final /* synthetic */ C119863dd f349497b;

    /* renamed from: c */
    final /* synthetic */ C127050h f349498c;

    /* renamed from: d */
    final /* synthetic */ C126943ac f349499d;

    /* renamed from: e */
    final /* synthetic */ C119834cb f349500e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126942ab(C119863dd ddVar, C127050h hVar, C126943ac acVar, C119834cb cbVar, C69577g gVar) {
        super(2, gVar);
        this.f349497b = ddVar;
        this.f349498c = hVar;
        this.f349499d = acVar;
        this.f349500e = cbVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126942ab) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C119834cb cbVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349496a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C126943ac.f349501a.mo56224b();
            C119863dd ddVar = this.f349497b;
            if (ddVar.f333823a == 2) {
                cbVar = (C119834cb) ddVar.f333824b;
            } else {
                cbVar = C119834cb.f333765b;
            }
            String str = cbVar.f333767a;
            C127050h hVar = this.f349498c;
            cVar.mo56379ah(new C59094n(37317));
            cVar.mo56354G("Stop Interaction requested for interactionId:%s with cancellationReason:%s", str, hVar);
            Duration duration = C126943ac.f349502b;
            C126941aa aaVar = new C126941aa(this.f349499d, this.f349497b, this.f349498c, this.f349500e, (C69577g) null);
            this.f349496a = 1;
            if (C71745ea.m104929a(C60942a.m93083a(duration), aaVar, this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126942ab(this.f349497b, this.f349498c, this.f349499d, this.f349500e, gVar);
    }
}
