package com.google.android.libraries.assistant.p1363c.p1394f.p1395a;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71816z;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.libraries.assistant.apa.opahandover.impl.HandoverSessionImpl$start$handoverDoneDeferred$1$3", mo61344c = "HandoverSessionImpl.kt", mo61345d = "invokeSuspend", mo61346e = {120})
/* renamed from: com.google.android.libraries.assistant.c.f.a.n */
/* compiled from: PG */
final class C17289n extends C69572j implements C69630p {

    /* renamed from: a */
    int f50094a;

    /* renamed from: b */
    final /* synthetic */ C17291p f50095b;

    /* renamed from: c */
    final /* synthetic */ C71422aw f50096c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17289n(C17291p pVar, C71422aw awVar, C69577g gVar) {
        super(2, gVar);
        this.f50095b = pVar;
        this.f50096c = awVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C17289n) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f50094a != 0) {
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                C71423ax.m104198c(this.f50096c, e);
            }
        } else {
            C69714l.m101134b(obj);
            C71816z zVar = this.f50095b.f50109j;
            this.f50094a = 1;
            if (zVar.mo62825a(this) == aVar) {
                return aVar;
            }
        }
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C17289n(this.f50095b, this.f50096c, gVar);
    }
}
