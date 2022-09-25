package com.google.apps.tiktok.tracing;

import android.view.View;
import com.google.android.libraries.web.contrib.p3390j.p3396d.C43665m;

/* renamed from: com.google.apps.tiktok.tracing.cb */
/* compiled from: PG */
public final /* synthetic */ class C47578cb implements View.OnLongClickListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123469a;

    /* renamed from: b */
    public final /* synthetic */ String f123470b = "View.onUrlBarLongClicked";

    /* renamed from: c */
    public final /* synthetic */ View.OnLongClickListener f123471c;

    public /* synthetic */ C47578cb(C47770dh dhVar, View.OnLongClickListener onLongClickListener) {
        this.f123469a = dhVar;
        this.f123471c = onLongClickListener;
    }

    public final boolean onLongClick(View view) {
        C47770dh dhVar = this.f123469a;
        String str = this.f123470b;
        View.OnLongClickListener onLongClickListener = this.f123471c;
        C47538ax c = dhVar.mo51613c(str);
        try {
            ((C43665m) onLongClickListener).f113943a.mo46683a(view);
            if (c == null) {
                return true;
            }
            c.close();
            return true;
        } catch (Throwable th) {
            C47574by.m84679a(th, th);
        }
        throw th;
    }
}
