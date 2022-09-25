package com.google.apps.tiktok.tracing;

import android.text.Editable;
import android.text.TextWatcher;

/* renamed from: com.google.apps.tiktok.tracing.db */
/* compiled from: PG */
public final class C47764db implements TextWatcher {

    /* renamed from: a */
    final /* synthetic */ TextWatcher f123750a;

    /* renamed from: b */
    final /* synthetic */ String f123751b;

    /* renamed from: c */
    final /* synthetic */ C47770dh f123752c;

    public C47764db(C47770dh dhVar, TextWatcher textWatcher, String str) {
        this.f123752c = dhVar;
        this.f123750a = textWatcher;
        this.f123751b = str;
    }

    public final void afterTextChanged(Editable editable) {
        if (C47831fm.m85027v()) {
            this.f123750a.afterTextChanged(editable);
            return;
        }
        C47538ax c = this.f123752c.mo51613c(this.f123751b);
        try {
            this.f123750a.afterTextChanged(editable);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47763da.m84915a(th, th);
        }
        throw th;
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (C47831fm.m85027v()) {
            this.f123750a.beforeTextChanged(charSequence, i, i2, i3);
            return;
        }
        C47538ax c = this.f123752c.mo51613c(this.f123751b);
        try {
            this.f123750a.beforeTextChanged(charSequence, i, i2, i3);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47763da.m84915a(th, th);
        }
        throw th;
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        if (C47831fm.m85027v()) {
            this.f123750a.onTextChanged(charSequence, i, i2, i3);
            return;
        }
        C47538ax c = this.f123752c.mo51613c(this.f123751b);
        try {
            this.f123750a.onTextChanged(charSequence, i, i2, i3);
            if (c != null) {
                c.close();
                return;
            }
            return;
        } catch (Throwable th) {
            C47763da.m84915a(th, th);
        }
        throw th;
    }
}
