package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import com.google.android.libraries.assistant.p1363c.p1394f.p1397c.C17308d;
import com.google.common.p4522b.C58479go;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62971cq;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.OpaHandoverImpl$getSupportedClientOps$1", mo61344c = "OpaHandoverImpl.kt", mo61345d = "invokeSuspend", mo61346e = {55})
/* renamed from: com.google.android.libraries.assistant.c.f.a.u */
/* compiled from: PG */
final class C17296u extends C69572j implements C69630p {

    /* renamed from: a */
    int f50116a;

    /* renamed from: b */
    final /* synthetic */ C17297v f50117b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17296u(C17297v vVar, C69577g gVar) {
        super(2, gVar);
        this.f50117b = vVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17296u) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50116a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx a = this.f50117b.f50120b.mo18058a();
            this.f50116a = 1;
            obj = C71663i.m104690c(a, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C62971cq cqVar = ((C17308d) obj).f50132a;
        C69664n.m101060f(cqVar, "context.supportedClientOpsList");
        return C58479go.m89810b(cqVar);
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17296u(this.f50117b, gVar);
    }
}
