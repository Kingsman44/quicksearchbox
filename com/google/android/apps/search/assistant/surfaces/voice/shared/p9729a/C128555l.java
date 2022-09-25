package com.google.android.apps.search.assistant.surfaces.voice.shared.p9729a;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.p5578d.C71663i;
import p3186j$.time.Duration;
import p3186j$.util.concurrent.atomic.DesugarAtomicReference;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.a.l */
/* compiled from: PG */
public final class C128555l implements C128544a {

    /* renamed from: a */
    public static final C46690ah f353488a = new C46885y("EventDataSource");

    /* renamed from: b */
    public static final C59071e f353489b = C59071e.m91331h();

    /* renamed from: c */
    public final C46778cv f353490c;

    /* renamed from: d */
    public long f353491d;

    /* renamed from: e */
    public final AtomicReference f353492e = new AtomicReference(C58485gu.m89845m());

    /* renamed from: f */
    private final C71422aw f353493f;

    /* renamed from: g */
    private final C60888db f353494g;

    public C128555l(C46778cv cvVar, C71422aw awVar, C60888db dbVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f353490c = cvVar;
        this.f353493f = awVar;
        this.f353494g = dbVar;
    }

    /* renamed from: a */
    public final C60870cx mo108509a(Object obj, Duration duration, Object obj2) {
        C69664n.m101061g(duration, "timeout");
        C128548e eVar = new C128548e(this, obj);
        DesugarAtomicReference.getAndUpdate(this.f353492e, new C128551h(eVar));
        C60870cx q = C60856cj.m92908q(C71663i.m104692e(this.f353493f, (C71424ay) null, new C128553j(this, eVar, (C69577g) null), 3), duration.toMillis(), TimeUnit.MILLISECONDS, this.f353494g);
        C69664n.m101060f(q, "@SuppressWarnings(\"GoodT…tweightExecutor\n    )\n  }");
        if (obj2 == null) {
            return q;
        }
        C128552i iVar = new C128552i(obj, obj2);
        return C60846c.m92878g(q, TimeoutException.class, C47810es.m84963c(iVar), this.f353494g);
    }

    /* renamed from: b */
    public final void mo108510b() {
        Object andUpdate = DesugarAtomicReference.getAndUpdate(this.f353492e, C128549f.f353481a);
        C69664n.m101060f(andUpdate, "events\n      .getAndUpdate { ImmutableList.of() }");
        for (C128548e eVar : (Iterable) andUpdate) {
            eVar.f353480e.mo62723u(new CancellationException("Clearing"));
        }
    }

    /* renamed from: c */
    public final void mo108515c() {
        DesugarAtomicReference.getAndUpdate(this.f353492e, new C128550g());
    }
}
