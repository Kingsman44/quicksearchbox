package com.google.apps.tiktok.tracing;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: com.google.apps.tiktok.tracing.ch */
/* compiled from: PG */
public final /* synthetic */ class C47584ch implements View.OnKeyListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123487a;

    /* renamed from: b */
    public final /* synthetic */ String f123488b;

    /* renamed from: c */
    public final /* synthetic */ View.OnKeyListener f123489c;

    public /* synthetic */ C47584ch(C47770dh dhVar, String str, View.OnKeyListener onKeyListener) {
        this.f123487a = dhVar;
        this.f123488b = str;
        this.f123489c = onKeyListener;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        C47770dh dhVar = this.f123487a;
        String str = this.f123488b;
        View.OnKeyListener onKeyListener = this.f123489c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onKey = onKeyListener.onKey(view, i, keyEvent);
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
