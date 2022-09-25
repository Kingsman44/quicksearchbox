package com.google.android.apps.gsa.shared.p7033d.p7035b.p7036a;

import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34134g;
import com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a.C34137j;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.p5578d.C71663i;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;

@C69567e(mo61343b = "com.google.android.apps.gsa.shared.apa.triggering.hotword.LegacyHotwordModule$Companion$apaTriggeringManagedLifecycleConfiguration$1", mo61344c = "LegacyHotwordModule.kt", mo61345d = "invokeSuspend", mo61346e = {32})
/* renamed from: com.google.android.apps.gsa.shared.d.b.a.p */
/* compiled from: PG */
public final class C89713p extends C69572j implements C69626l {

    /* renamed from: a */
    int f242863a;

    /* renamed from: b */
    final /* synthetic */ C34137j f242864b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C89713p(C34137j jVar, C69577g gVar) {
        super(1, gVar);
        this.f242864b = jVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C89713p(this.f242864b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f242863a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C60870cx b = this.f242864b.mo39228b(C34134g.LEGACY);
            this.f242863a = 1;
            obj = C71663i.m104690c(b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        return obj;
    }
}
