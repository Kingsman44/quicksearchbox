package com.google.apps.tiktok.tracing;

import android.content.DialogInterface;

/* renamed from: com.google.apps.tiktok.tracing.cq */
/* compiled from: PG */
public final /* synthetic */ class C47752cq implements DialogInterface.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123725a;

    /* renamed from: b */
    public final /* synthetic */ String f123726b;

    /* renamed from: c */
    public final /* synthetic */ DialogInterface.OnClickListener f123727c;

    public /* synthetic */ C47752cq(C47770dh dhVar, String str, DialogInterface.OnClickListener onClickListener) {
        this.f123725a = dhVar;
        this.f123726b = str;
        this.f123727c = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C47770dh dhVar = this.f123725a;
        String str = this.f123726b;
        DialogInterface.OnClickListener onClickListener = this.f123727c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            onClickListener.onClick(dialogInterface, i);
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
