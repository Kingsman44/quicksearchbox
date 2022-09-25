package com.google.android.libraries.lens.view.p2087ay;

import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import com.google.apps.tiktok.concurrent.C46428ao;
import com.google.common.p4526f.p4527a.C58974d;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.lens.view.ay.e */
/* compiled from: PG */
public final class C25644e {

    /* renamed from: a */
    public static final C58974d f69757a = C58974d.m91135i("ExtremeMotionDetector");

    /* renamed from: b */
    public final Executor f69758b;

    /* renamed from: c */
    public final C46428ao f69759c;

    /* renamed from: d */
    public final C25619ab f69760d = new C25619ab();

    /* renamed from: e */
    public final C69464a f69761e;

    /* renamed from: f */
    public WeakReference f69762f = new WeakReference((Object) null);

    /* renamed from: g */
    SensorEventListener f69763g;

    public C25644e(Executor executor, C46428ao aoVar, C69464a aVar) {
        this.f69758b = executor;
        this.f69761e = aVar;
        this.f69759c = aoVar;
    }

    /* renamed from: a */
    public final void mo30764a() {
        SensorEventListener sensorEventListener = this.f69763g;
        if (sensorEventListener != null) {
            ((SensorManager) this.f69761e.mo17428b()).unregisterListener(sensorEventListener);
            this.f69763g = null;
        }
        this.f69762f.clear();
    }
}
