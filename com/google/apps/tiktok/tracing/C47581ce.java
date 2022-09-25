package com.google.apps.tiktok.tracing;

import android.content.DialogInterface;
import android.view.KeyEvent;

/* renamed from: com.google.apps.tiktok.tracing.ce */
/* compiled from: PG */
public final /* synthetic */ class C47581ce implements DialogInterface.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123478a;

    /* renamed from: b */
    public final /* synthetic */ String f123479b = "WarmActionsSettingsCallsOptInDialogFragment:backKey event";

    /* renamed from: c */
    public final /* synthetic */ DialogInterface.OnKeyListener f123480c;

    public /* synthetic */ C47581ce(C47770dh dhVar, DialogInterface.OnKeyListener onKeyListener) {
        this.f123478a = dhVar;
        this.f123480c = onKeyListener;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        C47770dh dhVar = this.f123478a;
        String str = this.f123479b;
        DialogInterface.OnKeyListener onKeyListener = this.f123480c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onKey = onKeyListener.onKey(dialogInterface, i, keyEvent);
            if (c != null) {
                c.close();
            }
            return onKey;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
