package com.google.apps.tiktok.tracing;

import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.cm */
/* compiled from: PG */
public final /* synthetic */ class C47589cm implements View.OnLayoutChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123502a;

    /* renamed from: b */
    public final /* synthetic */ View.OnLayoutChangeListener f123503b;

    /* renamed from: c */
    public final /* synthetic */ String f123504c = "OnLayoutChangeListener";

    public /* synthetic */ C47589cm(C47770dh dhVar, View.OnLayoutChangeListener onLayoutChangeListener) {
        this.f123502a = dhVar;
        this.f123503b = onLayoutChangeListener;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Throwable th;
        C47770dh dhVar = this.f123502a;
        View.OnLayoutChangeListener onLayoutChangeListener = this.f123503b;
        String str = this.f123504c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th2) {
                C47574by.m84679a(th, th2);
            }
        } else {
            onLayoutChangeListener.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
            return;
        }
        throw th;
    }
}
