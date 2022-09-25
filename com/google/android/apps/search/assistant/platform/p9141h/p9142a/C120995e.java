package com.google.android.apps.search.assistant.platform.p9141h.p9142a;

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

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.settingsdata.changenotification.ChangeNotificationListenerService$onChange$1$1", mo61344c = "ChangeNotificationListenerService.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.apps.search.assistant.platform.h.a.e */
/* compiled from: PG */
final class C120995e extends C69572j implements C69630p {

    /* renamed from: a */
    int f336359a;

    /* renamed from: b */
    final /* synthetic */ C120971a f336360b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120995e(C120971a aVar, C69577g gVar) {
        super(2, gVar);
        this.f336360b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120995e) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f336359a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (Exception e) {
                C59052c cVar = (C59052c) ((C59052c) C120981c.f336338a.mo56225c()).mo56382g(e);
                cVar.mo56379ah(new C59094n(35661));
                cVar.mo56386p("Callback execution failed");
            }
        } else {
            C69714l.m101134b(obj);
            C120971a aVar2 = this.f336360b;
            this.f336359a = 1;
            if (aVar2.mo38333a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120995e(this.f336360b, gVar);
    }
}
