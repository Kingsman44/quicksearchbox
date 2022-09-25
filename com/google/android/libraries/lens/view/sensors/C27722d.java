package com.google.android.libraries.lens.view.sensors;

import android.content.Context;
import android.hardware.SensorEventListener;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60887da;
import com.google.lens.p4707j.C62452cb;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.sensors.d */
/* compiled from: PG */
public final class C27722d {

    /* renamed from: a */
    public static final C58974d f75681a = C58974d.m91135i("GravityEstimator");

    /* renamed from: b */
    public final C69464a f75682b;

    /* renamed from: c */
    public final Context f75683c;

    /* renamed from: d */
    public final C46428ao f75684d;

    /* renamed from: e */
    public int f75685e;

    /* renamed from: f */
    public volatile C62452cb f75686f;

    /* renamed from: g */
    public SensorEventListener f75687g;

    /* renamed from: h */
    private final C60887da f75688h;

    /* renamed from: i */
    private final C47632e f75689i = new C47632e();

    public C27722d(C69464a aVar, Context context, C60887da daVar, C46428ao aoVar) {
        this.f75683c = context;
        this.f75682b = aVar;
        this.f75688h = daVar;
        this.f75684d = aoVar;
    }

    /* renamed from: a */
    public final void mo33206a() {
        C46459k.m82829b(this.f75689i.mo51511a(new C27720b(this), this.f75688h), "Starting GravityEstimator failed", new Object[0]);
    }

    /* renamed from: b */
    public final void mo33207b() {
        C46459k.m82829b(this.f75689i.mo51511a(new C27719a(this), this.f75688h), "Stopping GravityEstimator failed", new Object[0]);
    }
}
