package com.google.android.libraries.gsa.p1859d.p1861b;

import android.app.Activity;
import android.os.Handler;
import android.support.p031v4.app.C0174at;
import android.view.LayoutInflater;
import android.view.View;

/* renamed from: com.google.android.libraries.gsa.d.b.g */
/* compiled from: PG */
final class C22761g extends C0174at {

    /* renamed from: a */
    final Activity f62644a;

    /* renamed from: f */
    final /* synthetic */ C22762h f62645f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22761g(C22762h hVar, Activity activity) {
        super(activity, new Handler());
        this.f62645f = hVar;
        this.f62644a = activity;
    }

    /* renamed from: a */
    public final View mo521a(int i) {
        return this.f62645f.f62642j.f62639aa.findViewById(i);
    }

    /* renamed from: c */
    public final LayoutInflater mo532c() {
        return LayoutInflater.from(this.f742c).cloneInContext(this.f62645f.getBaseContext());
    }

    /* renamed from: f */
    public final /* synthetic */ Object mo533f() {
        return this.f62644a;
    }
}
