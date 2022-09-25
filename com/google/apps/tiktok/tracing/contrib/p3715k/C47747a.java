package com.google.apps.tiktok.tracing.contrib.p3715k;

import android.webkit.ValueCallback;
import com.google.apps.tiktok.tracing.C47538ax;
import com.google.apps.tiktok.tracing.C47831fm;

/* renamed from: com.google.apps.tiktok.tracing.contrib.k.a */
/* compiled from: PG */
public final /* synthetic */ class C47747a implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C47538ax f123717a;

    /* renamed from: b */
    public final /* synthetic */ ValueCallback f123718b;

    public /* synthetic */ C47747a(C47538ax axVar, ValueCallback valueCallback) {
        this.f123717a = axVar;
        this.f123718b = valueCallback;
    }

    public final void onReceiveValue(Object obj) {
        C47538ax axVar = this.f123717a;
        ValueCallback valueCallback = this.f123718b;
        C47538ax y = C47831fm.m85030y(axVar);
        try {
            valueCallback.onReceiveValue(obj);
        } finally {
            C47831fm.m85030y(y);
        }
    }
}
