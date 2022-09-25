package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.internal.ej */
/* compiled from: PG */
public final class C145338ej {

    /* renamed from: a */
    public String f392844a;

    /* renamed from: b */
    final /* synthetic */ C145339ek f392845b;

    /* renamed from: c */
    private final String f392846c;

    /* renamed from: d */
    private boolean f392847d;

    public C145338ej(C145339ek ekVar, String str) {
        this.f392845b = ekVar;
        C143919bh.m233969l(str);
        this.f392846c = str;
    }

    /* renamed from: a */
    public final void mo120919a() {
        if (!this.f392847d) {
            this.f392847d = true;
            this.f392844a = this.f392845b.mo120921a().getString(this.f392846c, (String) null);
        }
    }

    /* renamed from: b */
    public final void mo120920b(String str) {
        SharedPreferences.Editor edit = this.f392845b.mo120921a().edit();
        edit.putString(this.f392846c, str);
        edit.apply();
        this.f392844a = str;
    }
}
