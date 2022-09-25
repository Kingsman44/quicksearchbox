package com.google.android.apps.search.assistant.surfaces.voice.p9539d.p9540a;

import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32801aw;
import com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d.C32810be;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.context.debug.LoggingContextProvider$fetchContext$1", mo61344c = "LoggingContextProvider.kt", mo61345d = "invokeSuspend", mo61346e = {38})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.d.a.c */
/* compiled from: PG */
final class C127178c extends C69572j implements C69630p {

    /* renamed from: a */
    Object f350125a;

    /* renamed from: b */
    Object f350126b;

    /* renamed from: c */
    int f350127c;

    /* renamed from: d */
    final /* synthetic */ C127179d f350128d;

    /* renamed from: e */
    final /* synthetic */ C32810be f350129e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C127178c(C127179d dVar, C32810be beVar, C69577g gVar) {
        super(2, gVar);
        this.f350128d = dVar;
        this.f350129e = beVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C127178c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        Object obj2;
        Object obj3;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f350127c != 0) {
            obj3 = this.f350126b;
            obj2 = this.f350125a;
            try {
                C69714l.m101134b(obj);
            } catch (CancellationException e) {
                C59071e eVar = C127179d.f350130a;
                throw e;
            } catch (Exception e2) {
                C59052c cVar = (C59052c) ((C59052c) C127179d.f350130a.mo56226d()).mo56382g(e2);
                cVar.mo56379ah(new C59094n(37250));
                cVar.mo56389s("Error fetching context for key %s", obj2);
                throw e2;
            }
        } else {
            C69714l.m101134b(obj);
            obj2 = new C127177b(this.f350129e);
            C58872ci d = C58872ci.m90947d(this.f350128d.f350133d);
            C60870cx e3 = this.f350128d.f350132c.mo38175e(this.f350129e);
            C69664n.m101060f(e3, "delegate.fetchContext(request)");
            this.f350125a = obj2;
            this.f350126b = d;
            this.f350127c = 1;
            Object c = C71663i.m104690c(e3, this);
            if (c == aVar) {
                return aVar;
            }
            obj3 = d;
            obj = c;
        }
        C32801aw awVar = (C32801aw) obj;
        Duration ofNanos = Duration.ofNanos(((C58872ci) obj3).mo56159b());
        C69664n.m101060f(ofNanos, "stopwatch.elapsed()");
        if (ofNanos.compareTo(C127179d.f350131b) > 0) {
            C59052c cVar2 = (C59052c) C127179d.f350130a.mo56226d();
            cVar2.mo56379ah(new C59094n(37251));
            cVar2.mo56354G("Slow context fetch for key %s took %s", obj2, ofNanos);
        }
        return awVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C127178c(this.f350128d, this.f350129e, gVar);
    }
}
