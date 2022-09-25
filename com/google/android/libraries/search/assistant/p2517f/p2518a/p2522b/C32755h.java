package com.google.android.libraries.search.assistant.p2517f.p2518a.p2522b;

import com.google.android.libraries.search.assistant.p2705n.p2706a.C34830d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.context.api.impl.AccessSessionImpl$1", mo61344c = "AccessSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {114})
/* renamed from: com.google.android.libraries.search.assistant.f.a.b.h */
/* compiled from: PG */
final class C32755h extends C69572j implements C69630p {

    /* renamed from: a */
    int f87888a;

    /* renamed from: b */
    final /* synthetic */ C32607ac f87889b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C32755h(C32607ac acVar, C69577g gVar) {
        super(2, gVar);
        this.f87889b = acVar;
    }

    /* renamed from: f */
    private static final void m60719f(C32607ac acVar, Throwable th) {
        if (!acVar.f87321l.getAndSet(true)) {
            acVar.f87320k.mo38288a(acVar.f87318i, th != null ? C34830d.m63594a(C34830d.m63595b(th)) : null);
            acVar.mo38188i();
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C32755h) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f87888a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (StatusException e) {
                if (e.f186943a.getCode() == Status.Code.UNAVAILABLE) {
                    C32607ac acVar = this.f87889b;
                    m60719f(acVar, C32662cd.m60553e(acVar.f87318i));
                    C59052c cVar = (C59052c) C32607ac.f87310a.mo56226d();
                    cVar.mo56378ag(C58975e.f156826a, "Context.Consumer");
                    C69664n.m101060f(cVar, "logger\n              .atWarning()");
                    C59052c cVar2 = (C59052c) C32692dg.m60595a(cVar, this.f87889b.f87318i).mo56382g(e);
                    cVar2.mo56379ah(new C59094n(50566));
                    cVar2.mo56386p("AccessSessionRootService is unavailable. Please visit go/context-api-assemblies");
                } else {
                    m60719f(this.f87889b, e);
                }
            } catch (CancellationException unused) {
                m60719f(this.f87889b, (Throwable) null);
            } catch (Throwable th) {
                m60719f(this.f87889b, th);
            }
        } else {
            C69714l.m101134b(obj);
            C32754g gVar = new C32754g(this.f87889b, (C69577g) null);
            this.f87888a = 1;
            if (C71423ax.m104196a(gVar, this) == aVar) {
                return aVar;
            }
        }
        C32607ac acVar2 = this.f87889b;
        m60719f(acVar2, C32662cd.m60553e(acVar2.f87318i));
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C32755h(this.f87889b, gVar);
    }
}
