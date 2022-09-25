package com.google.android.apps.search.assistant.platform.p9063e.p9064a.p9070c.p9071a;

import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17266e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.assistant.p3897e.p3917i.p3918a.C51605nx;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.speech.p5195a.C66448c;
import com.google.speech.p5195a.C66449d;
import java.util.concurrent.ScheduledExecutorService;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.a.c.a.c */
/* compiled from: PG */
public final class C120178c implements C17266e {

    /* renamed from: a */
    public static final C59071e f334461a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.e.a.c.a.c");

    /* renamed from: b */
    public static final C58495hd f334462b;

    /* renamed from: c */
    public static final C66449d f334463c;

    /* renamed from: d */
    public final boolean f334464d;

    /* renamed from: e */
    public final int f334465e;

    /* renamed from: f */
    private final ScheduledExecutorService f334466f;

    /* renamed from: g */
    private final C60870cx f334467g;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C51605nx.AGGREGATED, "logtop-aggregate");
        gzVar.mo55429h(C51605nx.CALL, "logtop-call");
        gzVar.mo55429h(C51605nx.TEXT, "logtop-text");
        f334462b = gzVar.mo55427f(false);
        C66448c cVar = (C66448c) C66449d.f180680d.createBuilder();
        cVar.copyOnWrite();
        C66449d dVar = (C66449d) cVar.instance;
        dVar.f180682a |= 1;
        dVar.f180683b = 250;
        cVar.copyOnWrite();
        C66449d dVar2 = (C66449d) cVar.instance;
        dVar2.f180682a |= 2;
        dVar2.f180684c = 1;
        f334463c = (C66449d) cVar.build();
    }

    public C120178c(ScheduledExecutorService scheduledExecutorService, C60870cx cxVar, boolean z, long j) {
        this.f334466f = scheduledExecutorService;
        this.f334467g = cxVar;
        this.f334464d = z;
        this.f334465e = (int) j;
    }

    /* renamed from: a */
    public final C60870cx mo23245a() {
        return C47633f.m84733g(this.f334467g).mo51515h(new C120176a(this), this.f334466f);
    }

    /* renamed from: c */
    public final /* synthetic */ C60870cx mo23246c(Consumer consumer) {
        return C60866ct.f164955a;
    }
}
