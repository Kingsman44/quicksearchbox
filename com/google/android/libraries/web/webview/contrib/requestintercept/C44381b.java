package com.google.android.libraries.web.webview.contrib.requestintercept;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import com.google.android.libraries.web.base.C43269t;
import com.google.android.libraries.web.p3428m.C43904a;
import com.google.android.libraries.web.p3428m.C43948y;
import com.google.android.libraries.web.p3428m.C43949z;
import com.google.android.libraries.web.p3428m.p3429a.C43914c;
import com.google.android.libraries.web.shared.contrib.C44084b;
import com.google.android.libraries.web.shared.lifecycle.C44107h;
import com.google.android.libraries.web.webview.p3492k.p3493a.C44475p;

/* renamed from: com.google.android.libraries.web.webview.contrib.requestintercept.b */
/* compiled from: PG */
public final class C44381b implements C44107h, C43949z {

    /* renamed from: a */
    public final C44380a f115387a;

    /* renamed from: b */
    public C44380a f115388b;

    public C44381b(C43948y yVar, C43269t tVar, C44084b bVar) {
        if (tVar.mo46384b().mo46300c(RequestInterceptFeature.class)) {
            this.f115387a = (C44380a) bVar.mo47055a(RequestInterceptFeature.class, C44380a.class).get();
        } else {
            this.f115387a = null;
        }
        yVar.mo46938e(this);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo44356a() {
    }

    /* renamed from: b */
    public final /* synthetic */ void mo46529b(C43904a aVar) {
    }

    /* renamed from: c */
    public final void mo46530c(C43904a aVar) {
        ((C44475p) ((C43914c) aVar).mo46411d(C44475p.class)).f115619d.f115585d.mo62678c(this);
    }

    /* renamed from: d */
    public final /* synthetic */ void mo46531d() {
    }

    /* renamed from: e */
    public final WebResourceResponse mo47275e(WebResourceRequest webResourceRequest) {
        C44380a aVar = this.f115388b;
        if (aVar != null) {
            return aVar.mo47273a(webResourceRequest);
        }
        C44380a aVar2 = this.f115387a;
        if (aVar2 != null) {
            return aVar2.mo47273a(webResourceRequest);
        }
        return null;
    }
}
