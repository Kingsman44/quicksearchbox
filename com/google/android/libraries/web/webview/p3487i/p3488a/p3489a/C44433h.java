package com.google.android.libraries.web.webview.p3487i.p3488a.p3489a;

import android.webkit.ValueCallback;
import com.google.android.libraries.web.profile.p3431a.C44060h;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.i.a.a.h */
/* compiled from: PG */
final class C44433h implements ValueCallback {

    /* renamed from: a */
    final /* synthetic */ C69577g f115506a;

    public C44433h(C69577g gVar) {
        this.f115506a = gVar;
    }

    public final /* bridge */ /* synthetic */ void onReceiveValue(Object obj) {
        Boolean bool = (Boolean) obj;
        C69664n.m101060f(bool, "success");
        if (bool.booleanValue()) {
            this.f115506a.mo61338mb(C69788q.f186170a);
        } else {
            this.f115506a.mo61338mb(C69714l.m101133a(new C44060h("Cookie failed to be set", (Throwable) null)));
        }
    }
}
