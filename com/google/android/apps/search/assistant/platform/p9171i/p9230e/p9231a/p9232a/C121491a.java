package com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9232a;

import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121494b;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121495c;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121496d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121499g;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121500h;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121501i;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121502j;
import com.google.assistant.p4001w.p4002a.C53503j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicBoolean;
import p3186j$.time.Duration;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.i.e.a.a.a */
/* compiled from: PG */
public final class C121491a implements C121496d {

    /* renamed from: a */
    private static final C59071e f337163a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.i.e.a.a.a");

    /* renamed from: b */
    private static final AtomicBoolean f337164b = new AtomicBoolean(false);

    private C121491a() {
    }

    /* renamed from: b */
    public static void m200750b() {
        if (!f337164b.getAndSet(true)) {
            C121499g.m200776b(new C121491a());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C121495c mo105181a() {
        return C121495c.OFF;
    }

    /* renamed from: c */
    public final void mo105182c(C121502j jVar, Instant instant, Duration duration, String str) {
        ((C59052c) ((C59052c) f337163a.mo56226d()).mo56372aa(35840)).mo56353F("Async Span finished: %s in %dms", ((C121494b) jVar).f337167a, duration.toMillis());
    }

    /* renamed from: d */
    public final void mo105183d(C121502j jVar, Instant instant) {
        ((C59052c) ((C59052c) f337163a.mo56226d()).mo56372aa(35841)).mo56389s("Event: %s", ((C121494b) jVar).f337167a);
    }

    /* renamed from: e */
    public final void mo105184e(C121502j jVar, long j) {
        ((C59052c) ((C59052c) f337163a.mo56226d()).mo56372aa(35842)).mo56353F("Quantity: %s = %d", ((C121494b) jVar).f337167a, j);
    }

    /* renamed from: f */
    public final void mo105185f(C121502j jVar, Instant instant, Duration duration) {
        ((C59052c) ((C59052c) f337163a.mo56226d()).mo56372aa(35843)).mo56353F("Span finished: %s in %dms", ((C121494b) jVar).f337167a, duration.toMillis());
    }

    /* renamed from: g */
    public final boolean mo105186g(C121500h hVar, C121501i iVar) {
        return true;
    }

    /* renamed from: h */
    public final /* synthetic */ void mo105187h(Instant instant, Duration duration, C53503j jVar) {
    }
}
