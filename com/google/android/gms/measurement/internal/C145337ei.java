package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.measurement.internal.ei */
/* compiled from: PG */
public final class C145337ei {

    /* renamed from: a */
    final String f392839a;

    /* renamed from: b */
    public final String f392840b;

    /* renamed from: c */
    public final String f392841c;

    /* renamed from: d */
    public final long f392842d;

    /* renamed from: e */
    final /* synthetic */ C145339ek f392843e;

    public C145337ei(C145339ek ekVar, long j) {
        this.f392843e = ekVar;
        C143919bh.m233969l("health_monitor");
        C143919bh.m233959b(j > 0);
        this.f392839a = "health_monitor:start";
        this.f392840b = "health_monitor:count";
        this.f392841c = "health_monitor:value";
        this.f392842d = j;
    }

    /* renamed from: a */
    public final long mo120917a() {
        return this.f392843e.mo120921a().getLong(this.f392839a, 0);
    }

    /* renamed from: b */
    public final void mo120918b() {
        this.f392843e.mo120904g();
        C144006f fVar = this.f392843e.f393011w.f392924A;
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.f392843e.mo120921a().edit();
        edit.remove(this.f392840b);
        edit.remove(this.f392841c);
        edit.putLong(this.f392839a, currentTimeMillis);
        edit.apply();
    }
}
