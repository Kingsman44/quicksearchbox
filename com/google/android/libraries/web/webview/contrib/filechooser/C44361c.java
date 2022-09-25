package com.google.android.libraries.web.webview.contrib.filechooser;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.support.p031v4.app.Fragment;
import android.webkit.MimeTypeMap;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.web.webview.contrib.filechooser.c */
/* compiled from: PG */
public final class C44361c {

    /* renamed from: a */
    public ValueCallback f115345a;

    /* renamed from: b */
    private final Fragment f115346b;

    public C44361c(Fragment fragment) {
        this.f115346b = fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo47241a(ValueCallback valueCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        ValueCallback valueCallback2 = this.f115345a;
        if (valueCallback2 != null) {
            valueCallback2.onReceiveValue((Object) null);
            ((C59052c) ((C59052c) FileChooserWebFragmentObserver.f115342a.mo56226d()).mo56372aa(54216)).mo56386p("onShowFileChooser called again before the previous request finished.");
        }
        this.f115345a = valueCallback;
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        String[] acceptTypes = fileChooserParams.getAcceptTypes();
        if (acceptTypes != null) {
            String str = acceptTypes[0];
            if (str.startsWith(".")) {
                str = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(1));
            }
            intent.setTypeAndNormalize(str);
        }
        try {
            this.f115346b.startActivityForResult(intent, 100);
        } catch (ActivityNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) FileChooserWebFragmentObserver.f115342a.mo56226d()).mo56382g(e)).mo56372aa(54215)).mo56386p("No activity found to choose files.");
        }
    }
}
