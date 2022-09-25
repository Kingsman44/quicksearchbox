package com.google.apps.tiktok.tracing;

import android.widget.PopupWindow;

/* renamed from: com.google.apps.tiktok.tracing.cr */
/* compiled from: PG */
public final /* synthetic */ class C47753cr implements PopupWindow.OnDismissListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123728a;

    /* renamed from: b */
    public final /* synthetic */ PopupWindow.OnDismissListener f123729b;

    /* renamed from: c */
    public final /* synthetic */ String f123730c = "tooltipView dismissed";

    public /* synthetic */ C47753cr(C47770dh dhVar, PopupWindow.OnDismissListener onDismissListener) {
        this.f123728a = dhVar;
        this.f123729b = onDismissListener;
    }

    public final void onDismiss() {
        C47770dh dhVar = this.f123728a;
        PopupWindow.OnDismissListener onDismissListener = this.f123729b;
        String str = this.f123730c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                onDismissListener.onDismiss();
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            onDismissListener.onDismiss();
            return;
        }
        throw th;
    }
}
