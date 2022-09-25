package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.p9791a;

import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46778cv;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60872cz;
import com.google.common.util.concurrent.C60888db;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.a.d */
/* compiled from: PG */
public final class C129012d implements C129009a {

    /* renamed from: a */
    public static final C46690ah f354451a = new C46885y("ENTER_TRANSITION_STATUS_KEY");

    /* renamed from: b */
    public final AtomicReference f354452b = new AtomicReference(C129013e.UNKNOWN);

    /* renamed from: c */
    private final C46778cv f354453c;

    /* renamed from: d */
    private final C60888db f354454d;

    /* renamed from: e */
    private C60870cx f354455e = C60856cj.m92898g();

    public C129012d(C46778cv cvVar, C60888db dbVar) {
        C69664n.m101061g(cvVar, "resultPropagator");
        C69664n.m101061g(dbVar, "lightweightExecutor");
        this.f354453c = cvVar;
        this.f354454d = dbVar;
    }

    /* renamed from: a */
    public final C46851e mo108799a() {
        return new C129011c(this);
    }

    /* renamed from: b */
    public final void mo108800b() {
        this.f354455e.cancel(true);
        C60872cz d = this.f354454d.mo29164d(new C129010b(this), 50, TimeUnit.MILLISECONDS);
        C69664n.m101060f(d, "@SuppressWarnings(\"GoodT…RANSITION_STATUS_KEY)\n  }");
        this.f354455e = d;
        this.f354453c.mo50787a(d, f354451a);
    }
}
