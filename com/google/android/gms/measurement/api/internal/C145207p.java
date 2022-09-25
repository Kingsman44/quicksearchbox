package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.p */
/* compiled from: PG */
public final class C145207p extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Activity f392468a;

    /* renamed from: b */
    final /* synthetic */ String f392469b;

    /* renamed from: c */
    final /* synthetic */ String f392470c;

    /* renamed from: d */
    final /* synthetic */ C145192am f392471d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145207p(C145192am amVar, Activity activity, String str, String str2) {
        super(amVar, true);
        this.f392471d = amVar;
        this.f392468a = activity;
        this.f392469b = str;
        this.f392470c = str2;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392471d.f392457f;
        C143919bh.m233958a(dVar);
        dVar.setCurrentScreen(new C144166k(this.f392468a), this.f392469b, this.f392470c, this.f392430f);
    }
}
