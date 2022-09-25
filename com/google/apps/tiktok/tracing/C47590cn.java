package com.google.apps.tiktok.tracing;

import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.cn */
/* compiled from: PG */
public final /* synthetic */ class C47590cn implements View.OnFocusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123505a;

    /* renamed from: b */
    public final /* synthetic */ View.OnFocusChangeListener f123506b;

    /* renamed from: c */
    public final /* synthetic */ String f123507c;

    public /* synthetic */ C47590cn(C47770dh dhVar, View.OnFocusChangeListener onFocusChangeListener, String str) {
        this.f123505a = dhVar;
        this.f123506b = onFocusChangeListener;
        this.f123507c = str;
    }

    public final void onFocusChange(View view, boolean z) {
        C47770dh dhVar = this.f123505a;
        View.OnFocusChangeListener onFocusChangeListener = this.f123506b;
        String str = this.f123507c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                onFocusChangeListener.onFocusChange(view, z);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            onFocusChangeListener.onFocusChange(view, z);
            return;
        }
        throw th;
    }
}
