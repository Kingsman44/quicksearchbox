package com.google.android.gms.car.p10750a.p10751a;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2169h;
import com.google.android.gms.car.C143120bd;
import com.google.android.gms.car.C143134br;
import com.google.android.gms.car.p10750a.C143086f;
import com.google.android.gms.car.p10750a.C143087g;
import com.google.android.gms.car.p10750a.p10751a.p10752a.C142976a;
import com.google.android.gms.car.p10764h.C143316a;
import com.google.android.gms.common.p10781d.C143860a;
import com.google.android.gms.libs.p10836d.p10839c.C144861c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.frameworks.client.p4624a.p4625a.C61301b;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.car.a.a.bh */
/* compiled from: PG */
public final class C143011bh implements C142996at {

    /* renamed from: a */
    public final Context f388055a;

    /* renamed from: b */
    public final C143010bg f388056b;

    /* renamed from: c */
    public final Handler f388057c = new C144861c(Looper.getMainLooper());

    /* renamed from: d */
    public final C143014bk f388058d;

    /* renamed from: e */
    public final C143015bl f388059e;

    /* renamed from: f */
    private C60870cx f388060f;

    /* renamed from: g */
    private final AtomicBoolean f388061g = new AtomicBoolean(false);

    public C143011bh(Context context, C143014bk bkVar, C143015bl blVar) {
        Intent component = new Intent().setComponent(C143120bd.f388180a);
        this.f388055a = context;
        this.f388058d = bkVar;
        this.f388059e = blVar;
        C143010bg bgVar = new C143010bg(this);
        this.f388056b = bgVar;
        this.f388060f = C2169h.m6027a(new C143008be(this));
        C2164c cVar = bgVar.f388053a;
        cVar.getClass();
        try {
            if (!C143860a.m233845a().mo119313d(context, component, bgVar, 129)) {
                mo117960g();
                mo117959f(new C143086f("Gearhead Car Startup Service not found, or process cannot bind."), cVar);
            }
        } catch (SecurityException e) {
            mo117959f(new C143086f((Throwable) e), cVar);
        }
        cVar.mo5436a(new C143009bf(this), C60826bg.f164896a);
    }

    /* renamed from: d */
    public static void m231977d(Handler handler, Runnable runnable) {
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    /* renamed from: a */
    public final synchronized void mo117938a() {
        if (this.f388061g.compareAndSet(false, true)) {
            if (C143316a.m232515e("GH.GhCarClientCtor", 4)) {
                C143316a.m232513c("GH.GhCarClientCtor", (Throwable) null, "Disconnecting GearheadCarClientConnector.");
            }
            if (!this.f388060f.isDone()) {
                this.f388060f.cancel(true);
            }
            mo117960g();
            this.f388060f = C60856cj.m92899h(new IllegalStateException("Client has been disconnected and cannot be used."));
        } else if (C143316a.m232515e("GH.GhCarClientCtor", 4)) {
            C143316a.m232513c("GH.GhCarClientCtor", (Throwable) null, "GearheadCarClientConnector has already been disconnected.");
        }
    }

    /* renamed from: b */
    public final synchronized C143134br mo117939b() {
        C60870cx cxVar = this.f388060f;
        if (cxVar == null || !cxVar.isDone()) {
            throw new IllegalStateException("Client is not connected yet.");
        }
        try {
        } catch (CancellationException | ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IllegalStateException) {
                throw new IllegalStateException("Client is not connected.", cause);
            } else if (cause instanceof C143087g) {
                throw new IllegalStateException("Client connection failed.", cause);
            } else {
                throw new IllegalStateException("Client not connected.", cause);
            }
        }
        return (C143134br) C60856cj.m92909r(this.f388060f);
    }

    /* renamed from: c */
    public final synchronized C60870cx mo117957c() {
        return this.f388060f;
    }

    /* renamed from: e */
    public final synchronized void mo117958e(C143087g gVar, C2164c cVar) {
        C60870cx cxVar = this.f388060f;
        if (cxVar == null) {
            this.f388060f = C60856cj.m92899h(gVar);
            return;
        }
        if (!cxVar.isDone()) {
            if (cVar != null) {
                cVar.mo5439d(gVar);
                return;
            }
        }
        if (C142976a.m231924a(this.f388060f)) {
            this.f388060f = C60856cj.m92899h(gVar);
        }
    }

    /* renamed from: f */
    public final void mo117959f(C143087g gVar, C2164c cVar) {
        if (C143316a.m232515e("GH.GhCarClientCtor", 4)) {
            Throwable cause = gVar.getCause();
            if (cause == null) {
                C143316a.m232514d(4, "GH.GhCarClientCtor", gVar, "onConnectionFailure: %s", C61301b.m93812a(gVar.getMessage()));
            } else {
                C143316a.m232514d(4, "GH.GhCarClientCtor", gVar, "onConnectionFailure: %s, caused by %s: %s", C61301b.m93812a(gVar.getMessage()), C61301b.m93812a(cause.getClass().getName()), C61301b.m93812a(cause.getMessage()));
            }
        }
        mo117958e(gVar, cVar);
        m231977d(this.f388057c, new C143004ba(this, gVar));
    }

    /* renamed from: g */
    public final void mo117960g() {
        if (C143316a.m232515e("GH.GhCarClientCtor", 4)) {
            C143316a.m232513c("GH.GhCarClientCtor", (Throwable) null, "Unbinding service connection.");
        }
        C143860a.m233845a().mo119312c(this.f388055a, this.f388056b);
    }
}
