package com.google.android.apps.search.assistant.platform.p9080f.p9089c.p9090a;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.common.p4522b.C58485gu;
import java.util.Collection;
import java.util.Iterator;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.processing.crossdevice.impl.RemoteExecutionControllerImpl$isEnabled$1", mo61344c = "RemoteExecutionControllerImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.f.c.a.b */
/* compiled from: PG */
final class C120520b extends C69572j implements C69630p {

    /* renamed from: a */
    final /* synthetic */ C120526h f335171a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C120520b(C120526h hVar, C69577g gVar) {
        super(2, gVar);
        this.f335171a = hVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C120520b) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C58485gu c = this.f335171a.f335193c.mo104605c();
        C69664n.m101060f(c, "clientExecutionProxy.supportedClientOps()");
        boolean z = false;
        if (!(c instanceof Collection) || !c.isEmpty()) {
            Iterator it = c.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (C69664n.m101066l(((C51785da) it.next()).f135878b, "apa.EXECUTE_REMOTE")) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C120520b(this.f335171a, gVar);
    }
}
