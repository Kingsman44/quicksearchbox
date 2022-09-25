package com.google.apps.tiktok.tracing;

import android.content.DialogInterface;

/* renamed from: com.google.apps.tiktok.tracing.ci */
/* compiled from: PG */
public final /* synthetic */ class C47585ci implements DialogInterface.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123490a;

    /* renamed from: b */
    public final /* synthetic */ String f123491b;

    /* renamed from: c */
    public final /* synthetic */ DialogInterface.OnDismissListener f123492c;

    public /* synthetic */ C47585ci(C47770dh dhVar, String str, DialogInterface.OnDismissListener onDismissListener) {
        this.f123490a = dhVar;
        this.f123491b = str;
        this.f123492c = onDismissListener;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        C47770dh dhVar = this.f123490a;
        String str = this.f123491b;
        DialogInterface.OnDismissListener onDismissListener = this.f123492c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            onDismissListener.onDismiss(dialogInterface);
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
