package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.eh */
/* compiled from: PG */
public final class C145336eh {

    /* renamed from: a */
    public long f392834a;

    /* renamed from: b */
    final /* synthetic */ C145339ek f392835b;

    /* renamed from: c */
    private final String f392836c;

    /* renamed from: d */
    private final long f392837d;

    /* renamed from: e */
    private boolean f392838e;

    public C145336eh(C145339ek ekVar, String str, long j) {
        this.f392835b = ekVar;
        C143919bh.m233969l(str);
        this.f392836c = str;
        this.f392837d = j;
    }

    /* renamed from: a */
    public final void mo120915a() {
        if (!this.f392838e) {
            this.f392838e = true;
            this.f392834a = this.f392835b.mo120921a().getLong(this.f392836c, this.f392837d);
        }
    }

    /* renamed from: b */
    public final void mo120916b(long j) {
        SharedPreferences.Editor edit = this.f392835b.mo120921a().edit();
        edit.putLong(this.f392836c, j);
        edit.apply();
        this.f392834a = j;
    }
}
