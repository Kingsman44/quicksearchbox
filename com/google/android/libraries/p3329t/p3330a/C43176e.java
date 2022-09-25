package com.google.android.libraries.p3329t.p3330a;

import android.content.ServiceConnection;
import android.os.Handler;
import android.os.Looper;
import com.google.android.libraries.p3329t.p3331b.C43184g;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.atomic.AtomicInteger;
import org.p5633c.p5634a.C72290n;

/* renamed from: com.google.android.libraries.t.a.e */
/* compiled from: PG */
public final class C43176e {

    /* renamed from: a */
    public static final C59071e f112881a = C59071e.m91332i("com.google.android.libraries.t.a.e");

    /* renamed from: b */
    public final Handler f112882b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final C58817ah f112883c;

    /* renamed from: d */
    public final C43177f f112884d;

    /* renamed from: e */
    public final C43184g f112885e = new C43184g();

    /* renamed from: f */
    public ServiceConnection f112886f;

    /* renamed from: g */
    public final AtomicInteger f112887g = new AtomicInteger();

    /* renamed from: h */
    public final AtomicInteger f112888h = new AtomicInteger();

    /* renamed from: i */
    public final AtomicInteger f112889i = new AtomicInteger();

    /* renamed from: j */
    public final AtomicInteger f112890j = new AtomicInteger();

    /* renamed from: k */
    public final AtomicInteger f112891k = new AtomicInteger();

    /* renamed from: l */
    private boolean f112892l = false;

    /* renamed from: m */
    private final AtomicInteger f112893m = new AtomicInteger();

    public C43176e(C58817ah ahVar, C43177f fVar) {
        this.f112883c = ahVar;
        this.f112884d = fVar;
    }

    /* renamed from: a */
    public final synchronized void mo46241a() {
        if (!this.f112892l) {
            this.f112892l = true;
            this.f112882b.post(new C43173b(this));
        }
    }

    /* renamed from: b */
    public final void mo46242b() {
        C72290n f = this.f112884d.mo46232f();
        ((C59052c) ((C59052c) f112881a.mo56226d()).mo56372aa(48151)).mo56389s("Will retry bind() in %s", f);
        this.f112882b.postDelayed(new C43173b(this), f.f191964b);
    }

    /* renamed from: c */
    public final void mo46243c(ServiceConnection serviceConnection) {
        try {
            this.f112884d.mo46228c().unbindService(serviceConnection);
        } catch (RuntimeException e) {
            this.f112893m.incrementAndGet();
            ((C59052c) ((C59052c) ((C59052c) f112881a.mo56226d()).mo56382g(e)).mo56372aa(48152)).mo56386p("unbindService threw");
        }
    }

    /* renamed from: d */
    public final synchronized boolean mo46244d() {
        return this.f112892l;
    }
}
