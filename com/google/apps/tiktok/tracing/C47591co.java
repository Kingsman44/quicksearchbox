package com.google.apps.tiktok.tracing;

import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.co */
/* compiled from: PG */
public final /* synthetic */ class C47591co implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123508a;

    /* renamed from: b */
    public final /* synthetic */ String f123509b;

    /* renamed from: c */
    public final /* synthetic */ View.OnClickListener f123510c;

    public /* synthetic */ C47591co(C47770dh dhVar, String str, View.OnClickListener onClickListener) {
        this.f123508a = dhVar;
        this.f123509b = str;
        this.f123510c = onClickListener;
    }

    public final void onClick(View view) {
        C47770dh dhVar = this.f123508a;
        String str = this.f123509b;
        View.OnClickListener onClickListener = this.f123510c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            onClickListener.onClick(view);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
