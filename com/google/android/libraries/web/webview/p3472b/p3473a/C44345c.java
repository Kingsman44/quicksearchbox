package com.google.android.libraries.web.webview.p3472b.p3473a;

import android.support.p031v4.app.Fragment;
import android.webkit.ValueCallback;
import androidx.lifecycle.C2383n;
import com.google.android.libraries.web.coordinator.internal.fragment.C43751j;
import com.google.android.libraries.web.p3343a.C43220a;
import com.google.android.libraries.web.p3343a.C43228d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.web.webview.b.a.c */
/* compiled from: PG */
public final class C44345c implements C43220a {

    /* renamed from: a */
    private final Fragment f115325a;

    /* renamed from: b */
    private final C44348f f115326b;

    public C44345c(Fragment fragment, C44348f fVar) {
        this.f115325a = fragment;
        this.f115326b = fVar;
    }

    /* renamed from: a */
    public final C60870cx mo46275a(ValueCallback valueCallback) {
        if (this.f115325a.getLifecycle().mo5789a().equals(C2383n.DESTROYED)) {
            return C60856cj.m92899h(new C43228d("WebFragment is destroyed."));
        }
        C44343a aVar = new C44343a(valueCallback);
        try {
            C43751j.m77264a(this.f115326b.f115329a).mo46775b(new C44347e(new C44344b(aVar)));
            return C60866ct.f164955a;
        } catch (C43228d e) {
            return C60856cj.m92899h(e);
        }
    }
}
