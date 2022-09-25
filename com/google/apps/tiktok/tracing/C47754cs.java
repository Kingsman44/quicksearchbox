package com.google.apps.tiktok.tracing;

import android.widget.CompoundButton;

/* renamed from: com.google.apps.tiktok.tracing.cs */
/* compiled from: PG */
public final /* synthetic */ class C47754cs implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C47770dh f123731a;

    /* renamed from: b */
    public final /* synthetic */ CompoundButton.OnCheckedChangeListener f123732b;

    /* renamed from: c */
    public final /* synthetic */ String f123733c;

    public /* synthetic */ C47754cs(C47770dh dhVar, CompoundButton.OnCheckedChangeListener onCheckedChangeListener, String str) {
        this.f123731a = dhVar;
        this.f123732b = onCheckedChangeListener;
        this.f123733c = str;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C47770dh dhVar = this.f123731a;
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f123732b;
        String str = this.f123733c;
        if (!C47831fm.m85027v()) {
            C47538ax c = dhVar.mo51613c(str);
            try {
                onCheckedChangeListener.onCheckedChanged(compoundButton, z);
                if (c != null) {
                    c.close();
                    return;
                }
                return;
            } catch (Throwable th) {
                C47574by.m84679a(th, th);
            }
        } else {
            onCheckedChangeListener.onCheckedChanged(compoundButton, z);
            return;
        }
        throw th;
    }
}
