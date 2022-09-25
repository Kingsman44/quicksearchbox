package com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9143a;

import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120986e;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120987f;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120988g;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120989h;
import com.google.android.apps.search.assistant.platform.p9141h.p9142a.p9145c.C120991j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70334de;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.changenotification.listeners.ContinuedConversationListener$onContinuedConversationSettingsChanged$1", mo61344c = "ContinuedConversationListener.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.platform.h.a.a.a */
/* compiled from: PG */
public final class C120972a extends C69572j implements C69630p {

    /* renamed from: a */
    int f336318a;

    /* renamed from: b */
    final /* synthetic */ C120973b f336319b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120972a(C120973b bVar, C69577g gVar) {
        super(2, gVar);
        this.f336319b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120972a) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336318a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Throwable th) {
                C59052c cVar = (C59052c) ((C59052c) C120973b.f336320a.mo56225c()).mo56382g(th);
                cVar.mo56379ah(new C59094n(35666));
                cVar.mo56386p("Failed to Notify ChangeNotificationListenerService");
            }
        } else {
            C69714l.m101134b(obj);
            C120973b bVar = this.f336319b;
            bVar.f336321b.mo105023b(bVar.f336323d, C120988g.CC_SETTING);
            C59052c cVar2 = (C59052c) C120973b.f336320a.mo56224b();
            cVar2.mo56379ah(new C59094n(35663));
            cVar2.mo56386p(":search ChangeNotificationListenerService Notified");
            C59052c cVar3 = (C59052c) C120973b.f336320a.mo56224b();
            cVar3.mo56379ah(new C59094n(35664));
            cVar3.mo56386p("Notifying :interactor ChangeNotificationListenerService");
            C120986e eVar = this.f336319b.f336322c;
            C120987f fVar = (C120987f) C120989h.f336352b.createBuilder();
            C69664n.m101060f(fVar, "newBuilder()");
            C120991j a = C69664n.m101061g(fVar, "builder");
            a.mo105021b(C120988g.CC_SETTING);
            C120989h a2 = a.mo105020a();
            this.f336318a = 1;
            if (eVar.mo105018b(a2, new C70334de(), this) == aVar) {
                return aVar;
            }
        }
        C59052c cVar4 = (C59052c) C120973b.f336320a.mo56224b();
        cVar4.mo56379ah(new C59094n(35665));
        cVar4.mo56386p(":interactor ChangeNotificationListenerService Notified");
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120972a(this.f336319b, gVar);
    }
}
