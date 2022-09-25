package com.google.android.apps.gsa.staticplugins.webview;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.cb */
/* compiled from: PG */
public final class C118166cb implements C60845bz {

    /* renamed from: a */
    public final C89688a f328026a;

    /* renamed from: b */
    private final C22871g f328027b;

    /* renamed from: c */
    private final Object f328028c = new Object();

    /* renamed from: d */
    private String f328029d;

    /* renamed from: e */
    private Object f328030e;

    /* renamed from: f */
    private C118167cc f328031f;

    public C118166cb(C89688a aVar, C22871g gVar) {
        this.f328026a = aVar;
        this.f328027b = gVar;
    }

    /* renamed from: c */
    private final void m196297c() {
        String str = this.f328029d;
        if (str == null) {
            return;
        }
        if (this.f328031f != null) {
            m196298d(str, "onFailure()");
        } else if (this.f328030e != null) {
            m196298d(str, "onSuccess()");
        }
    }

    /* renamed from: d */
    private final void m196298d(String str, String str2) {
        this.f328027b.mo28212l("Evaluate JavaScript", new C118165ca(this, str + "." + str2));
    }

    @JavascriptInterface
    public C118167cc getError() {
        C118167cc ccVar;
        synchronized (this.f328028c) {
            ccVar = this.f328031f;
        }
        return ccVar;
    }

    @JavascriptInterface
    public Object getResult() {
        Object obj;
        synchronized (this.f328028c) {
            obj = this.f328030e;
        }
        return obj;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        synchronized (this.f328028c) {
            this.f328031f = new C118167cc(th);
            m196297c();
        }
    }

    /* renamed from: gm */
    public final void mo17911gm(Object obj) {
        synchronized (this.f328028c) {
            this.f328030e = obj;
            m196297c();
        }
    }

    @JavascriptInterface
    public void setCallback(String str) {
        synchronized (this.f328028c) {
            String str2 = this.f328029d;
            if (str2 == null) {
                this.f328029d = str;
                m196297c();
            } else {
                throw new IllegalStateException("Callback already set to: " + str2);
            }
        }
    }
}
