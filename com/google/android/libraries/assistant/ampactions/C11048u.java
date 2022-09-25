package com.google.android.libraries.assistant.ampactions;

import android.webkit.WebView;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.ampactions.u */
/* compiled from: PG */
public final /* synthetic */ class C11048u implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11049v f36286a;

    /* renamed from: b */
    public final /* synthetic */ String f36287b;

    public /* synthetic */ C11048u(C11049v vVar, String str) {
        this.f36286a = vVar;
        this.f36287b = str;
    }

    public final Object apply(Object obj) {
        C11049v vVar = this.f36286a;
        String str = this.f36287b;
        AmpWebView ampWebView = new AmpWebView((WebView) obj);
        vVar.f36289b.put(str, ampWebView);
        return ampWebView;
    }
}
