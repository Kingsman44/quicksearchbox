package com.google.apps.tiktok.tracing;

import android.view.KeyEvent;
import android.widget.TextView;

/* renamed from: com.google.apps.tiktok.tracing.ca */
/* compiled from: PG */
public final /* synthetic */ class C47577ca implements TextView.OnEditorActionListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123466a;

    /* renamed from: b */
    public final /* synthetic */ TextView.OnEditorActionListener f123467b;

    /* renamed from: c */
    public final /* synthetic */ String f123468c;

    public /* synthetic */ C47577ca(C47770dh dhVar, TextView.OnEditorActionListener onEditorActionListener, String str) {
        this.f123466a = dhVar;
        this.f123467b = onEditorActionListener;
        this.f123468c = str;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        C47770dh dhVar = this.f123466a;
        TextView.OnEditorActionListener onEditorActionListener = this.f123467b;
        String str = this.f123468c;
        if (C47831fm.m85027v()) {
            return onEditorActionListener.onEditorAction(textView, i, keyEvent);
        }
        C47538ax c = dhVar.mo51613c(str);
        try {
            boolean onEditorAction = onEditorActionListener.onEditorAction(textView, i, keyEvent);
            if (c == null) {
                return onEditorAction;
            }
            c.close();
            return onEditorAction;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
