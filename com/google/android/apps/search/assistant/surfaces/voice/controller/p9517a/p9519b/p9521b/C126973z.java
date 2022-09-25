package com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9519b.p9521b;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119851cs;
import com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9575d.C127289i;
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
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.controller.conversation.connection.impl.ConversationConnectionManagerImpl$start$1", mo61344c = "ConversationConnectionManagerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {78})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.controller.a.b.b.z */
/* compiled from: PG */
final class C126973z extends C69572j implements C69630p {

    /* renamed from: a */
    int f349637a;

    /* renamed from: b */
    final /* synthetic */ C126943ac f349638b;

    /* renamed from: c */
    final /* synthetic */ C127289i f349639c;

    /* renamed from: d */
    final /* synthetic */ C119851cs f349640d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C126973z(C126943ac acVar, C127289i iVar, C119851cs csVar, C69577g gVar) {
        super(2, gVar);
        this.f349638b = acVar;
        this.f349639c = iVar;
        this.f349640d = csVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C126973z) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f349637a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C59052c cVar = (C59052c) C126943ac.f349501a.mo56224b();
            cVar.mo56379ah(new C59094n(37315));
            cVar.mo56386p("Start Interaction requested.");
            Duration duration = C126943ac.f349502b;
            C126972y yVar = new C126972y(this.f349638b, this.f349639c, this.f349640d, (C69577g) null);
            this.f349637a = 1;
            obj = C71745ea.m104929a(C60942a.m93083a(duration), yVar, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C69664n.m101060f(obj, "override fun start(\n    …}\n        }\n      }\n    }");
        return obj;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C126973z(this.f349638b, this.f349639c, this.f349640d, gVar);
    }
}
