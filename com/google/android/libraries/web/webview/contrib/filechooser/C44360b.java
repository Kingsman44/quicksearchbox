package com.google.android.libraries.web.webview.contrib.filechooser;

import android.support.p031v4.app.C0154a;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import dagger.hilt.android.internal.managers.C68324h;
import p3186j$.util.function.BiConsumer;

/* renamed from: com.google.android.libraries.web.webview.contrib.filechooser.b */
/* compiled from: PG */
public final /* synthetic */ class C44360b implements BiConsumer {

    /* renamed from: a */
    public final /* synthetic */ FileChooserWebFragmentObserver f115344a;

    public /* synthetic */ C44360b(FileChooserWebFragmentObserver fileChooserWebFragmentObserver) {
        this.f115344a = fileChooserWebFragmentObserver;
    }

    public final void accept(Object obj, Object obj2) {
        FileChooserWebFragmentObserver fileChooserWebFragmentObserver = this.f115344a;
        ValueCallback valueCallback = (ValueCallback) obj;
        WebChromeClient.FileChooserParams fileChooserParams = (WebChromeClient.FileChooserParams) obj2;
        C44363e eVar = (C44363e) fileChooserWebFragmentObserver.f115343b.getChildFragmentManager().f634a.mo671c("file_chooser_fragment");
        if (eVar == null) {
            eVar = new C44363e();
            C68324h.m98669f(eVar);
            C0154a aVar = new C0154a(fileChooserWebFragmentObserver.f115343b.getChildFragmentManager());
            aVar.mo685r(eVar, "file_chooser_fragment");
            aVar.mo509f();
        }
        eVar.mo17754z().mo47241a(valueCallback, fileChooserParams);
    }

    public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return BiConsumer.CC.$default$andThen(this, biConsumer);
    }
}
