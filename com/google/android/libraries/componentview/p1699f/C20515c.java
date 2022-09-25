package com.google.android.libraries.componentview.p1699f;

import android.view.View;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.common.util.concurrent.SettableFuture;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.componentview.f.c */
/* compiled from: PG */
final class C20515c implements View.OnLayoutChangeListener {

    /* renamed from: a */
    final /* synthetic */ View f57628a;

    /* renamed from: b */
    final /* synthetic */ SettableFuture f57629b;

    /* renamed from: c */
    final /* synthetic */ Executor f57630c;

    /* renamed from: d */
    final /* synthetic */ C20517e f57631d;

    public C20515c(C20517e eVar, View view, SettableFuture settableFuture, Executor executor) {
        this.f57631d = eVar;
        this.f57628a = view;
        this.f57629b = settableFuture;
        this.f57630c = executor;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.f57628a.removeOnLayoutChangeListener(this);
        C20482m.m38443k(this.f57629b, this.f57631d.f57634b, this.f57630c);
    }
}
