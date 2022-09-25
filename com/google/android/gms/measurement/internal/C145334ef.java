package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ef */
/* compiled from: PG */
public final class C145334ef {

    /* renamed from: a */
    public boolean f392825a;

    /* renamed from: b */
    final /* synthetic */ C145339ek f392826b;

    /* renamed from: c */
    private final String f392827c;

    /* renamed from: d */
    private final boolean f392828d;

    /* renamed from: e */
    private boolean f392829e;

    public C145334ef(C145339ek ekVar, String str, boolean z) {
        this.f392826b = ekVar;
        C143919bh.m233969l(str);
        this.f392827c = str;
        this.f392828d = z;
    }

    /* renamed from: a */
    public final void mo120911a() {
        if (!this.f392829e) {
            this.f392829e = true;
            this.f392825a = this.f392826b.mo120921a().getBoolean(this.f392827c, this.f392828d);
        }
    }

    /* renamed from: b */
    public final void mo120912b(boolean z) {
        SharedPreferences.Editor edit = this.f392826b.mo120921a().edit();
        edit.putBoolean(this.f392827c, z);
        edit.apply();
        this.f392825a = z;
    }
}
