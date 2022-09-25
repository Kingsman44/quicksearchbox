package com.google.android.apps.gsa.staticplugins.p7882dy;

import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8887b.C118835b;
import com.google.android.apps.gsa.search.core.p6519al.p6703dh.C85369a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.dy.c */
/* compiled from: PG */
public final class C100320c extends C86734a implements C85369a {

    /* renamed from: a */
    public final C118835b f280535a;

    /* renamed from: b */
    public final C118827a f280536b;

    /* renamed from: c */
    public final C21370a f280537c;

    /* renamed from: f */
    private final C22871g f280538f;

    public C100320c(C118835b bVar, C118827a aVar, C22871g gVar, C21370a aVar2) {
        super(C118575h.WORKER_TELEMETRY, "telemetry");
        this.f280535a = bVar;
        this.f280536b = aVar;
        this.f280538f = gVar;
        this.f280537c = aVar2;
    }

    /* renamed from: a */
    public final C60870cx mo78896a() {
        return this.f280538f.mo28201a("SendTelemetryCallable", new C100319b(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
