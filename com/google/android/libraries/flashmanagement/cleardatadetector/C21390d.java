package com.google.android.libraries.flashmanagement.cleardatadetector;

import android.content.ComponentName;
import android.content.pm.PackageManager;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.flashmanagement.cleardatadetector.d */
/* compiled from: PG */
public final class C21390d {

    /* renamed from: a */
    public final PackageManager f59783a;

    /* renamed from: b */
    public final String f59784b;

    /* renamed from: c */
    public final Executor f59785c;

    /* renamed from: d */
    public final ComponentName f59786d;

    /* renamed from: e */
    public final long f59787e;

    /* renamed from: f */
    public long f59788f;

    /* renamed from: g */
    public final C21392f f59789g;

    public C21390d(PackageManager packageManager, String str, C21392f fVar, Executor executor, long j) {
        this.f59783a = packageManager;
        this.f59784b = str;
        this.f59789g = fVar;
        this.f59785c = executor;
        this.f59786d = new ComponentName(str, DummyReceiver.class.getName());
        this.f59787e = j;
    }
}
