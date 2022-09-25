package com.google.android.apps.search.assistant.platform.p9236j.p9242b.p9249c.p9254c;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.p4526f.p4527a.C58975e;
import kotlinx.coroutines.p5574b.C71588o;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69631q;
import p5488io.grpc.Status;
import p5488io.grpc.StatusException;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.platform.triggering.invocations.vis.vistoken.ApaVisTokenClientImpl$handleGrpcErrors$1", mo61344c = "ApaVisTokenClientImpl.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.apps.search.assistant.platform.j.b.c.c.s */
/* compiled from: PG */
final class C122036s extends C69572j implements C69631q {

    /* renamed from: a */
    /* synthetic */ Object f338586a;

    /* renamed from: b */
    final /* synthetic */ String f338587b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C122036s(String str, C69577g gVar) {
        super(3, gVar);
        this.f338587b = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo17419a(Object obj, Object obj2, Object obj3) {
        C71588o oVar = (C71588o) obj;
        C122036s sVar = new C122036s(this.f338587b, (C69577g) obj3);
        sVar.f338586a = (Throwable) obj2;
        return sVar.mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        Object obj2 = this.f338586a;
        if (!(obj2 instanceof StatusException) || ((StatusException) obj2).f186943a.getCode() != Status.Code.UNAVAILABLE) {
            C59052c cVar = (C59052c) C121992ab.f338519a.mo56226d();
            cVar.mo56378ag(C58975e.f156826a, "INV.AssistLayer.TknClt");
            Throwable th = (Throwable) obj2;
            C59052c cVar2 = (C59052c) cVar.mo56382g(th);
            String str = this.f338587b;
            cVar2.mo56379ah(new C59094n(36087));
            cVar2.mo56389s("Error in %s", str);
            throw th;
        }
        C59052c cVar3 = (C59052c) C121992ab.f338519a.mo56224b();
        cVar3.mo56378ag(C58975e.f156826a, "INV.AssistLayer.TknClt");
        String str2 = this.f338587b;
        String message = ((Throwable) obj2).getMessage();
        cVar3.mo56379ah(new C59094n(36088));
        cVar3.mo56354G("%s. Error status: UNAVAILABLE. Probably remote process is dead, error message: %s", str2, message);
        return C69788q.f186170a;
    }
}
