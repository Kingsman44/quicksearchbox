package com.google.android.apps.search.googleapp.urlhandler.internal;

import android.content.Intent;
import com.google.common.p4552o.C60492rx;

/* renamed from: com.google.android.apps.search.googleapp.urlhandler.internal.v */
/* compiled from: PG */
public abstract class C139821v {
    /* renamed from: a */
    public abstract UrlIntentResult mo115270a();

    /* renamed from: b */
    public abstract void mo115271b(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public abstract void mo115272c(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo115273d(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract void mo115274e(boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract void mo115275f(Intent intent);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo115276g(C60492rx rxVar);

    /* renamed from: h */
    public abstract void mo115277h(boolean z);

    /* renamed from: i */
    public abstract void mo115278i(boolean z);

    /* renamed from: j */
    public final void mo115290j(Intent intent) {
        if (intent == null) {
            mo115273d(false);
            return;
        }
        mo115273d(true);
        mo115275f(intent);
    }

    /* renamed from: k */
    public final void mo115291k(C60492rx rxVar) {
        if (rxVar == null) {
            mo115274e(false);
            return;
        }
        mo115274e(true);
        mo115276g(rxVar);
    }
}
