package com.google.android.libraries.search.assistant.invocation.p2655o.p2673i.p2674a;

import com.google.android.libraries.search.p3055n.p3061c.C39379a;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.invocation.triggering.source.hotword.HotwordTriggeringFrontend$update$2", mo61344c = "HotwordTriggeringFrontend.kt", mo61345d = "invokeSuspend", mo61346e = {208})
/* renamed from: com.google.android.libraries.search.assistant.invocation.o.i.a.be */
/* compiled from: PG */
final class C34561be extends C69572j implements C69626l {

    /* renamed from: a */
    int f91820a;

    /* renamed from: b */
    final /* synthetic */ C39379a f91821b;

    /* renamed from: c */
    final /* synthetic */ C34646m f91822c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C34561be(C39379a aVar, C34646m mVar, C69577g gVar) {
        super(1, gVar);
        this.f91821b = aVar;
        this.f91822c = mVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C34561be(this.f91821b, this.f91822c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f91820a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C39379a aVar2 = this.f91821b;
            C34646m mVar = this.f91822c;
            C60870cx c = aVar2.mo41788c(mVar.f91993a, mVar.f91994b);
            C69664n.m101060f(c, "update(configuration.con… configuration.accountId)");
            this.f91820a = 1;
            obj = C71663i.m104690c(c, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
