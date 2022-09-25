package com.google.android.libraries.lens.view.sensors.orientation;

import android.content.Context;
import android.view.OrientationEventListener;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47632e;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.sensors.orientation.d */
/* compiled from: PG */
public final class C27727d {

    /* renamed from: a */
    public final Context f75697a;

    /* renamed from: b */
    public final Executor f75698b;

    /* renamed from: c */
    public final C27731h f75699c;

    /* renamed from: d */
    public final C47632e f75700d = new C47632e();

    /* renamed from: e */
    public OrientationEventListener f75701e;

    /* renamed from: f */
    public volatile int f75702f = -1;

    public C27727d(Executor executor, Context context, C27731h hVar) {
        this.f75697a = context;
        this.f75698b = executor;
        this.f75699c = hVar;
    }
}
