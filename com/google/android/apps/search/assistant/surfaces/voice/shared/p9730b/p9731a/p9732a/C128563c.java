package com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.p9732a;

import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128560a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128564b;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60866ct;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71803m;
import p3186j$.time.Duration;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.shared.b.a.a.c */
/* compiled from: PG */
public final class C128563c implements C128560a {

    /* renamed from: a */
    public static final C46690ah f353508a = new C46885y("TimeoutDataService.TIMEOUT");

    /* renamed from: b */
    public final AtomicReference f353509b = new AtomicReference(C128564b.CANCELLED);

    /* renamed from: c */
    public C71643cp f353510c;

    /* renamed from: d */
    private final C71422aw f353511d;

    /* renamed from: e */
    private final C46778cv f353512e;

    public C128563c(C71422aw awVar, C46778cv cvVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(cvVar, "resultPropagator");
        this.f353511d = awVar;
        this.f353512e = cvVar;
    }

    /* renamed from: a */
    public final C46851e mo108517a() {
        return new C128562b(this);
    }

    /* renamed from: b */
    public final void mo108518b(Duration duration) {
        C69664n.m101061g(duration, "duration");
        C71643cp cpVar = this.f353510c;
        if (cpVar != null) {
            cpVar.mo62723u((CancellationException) null);
        }
        mo108519c(C128564b.SCHEDULED);
        this.f353510c = C71803m.m105043d(this.f353511d, (C69585o) null, (C71424ay) null, new C128561a(duration, this, (C69577g) null), 3);
    }

    /* renamed from: c */
    public final void mo108519c(C128564b bVar) {
        this.f353509b.set(bVar);
        this.f353512e.mo50787a(C60866ct.f164955a, f353508a);
    }
}
