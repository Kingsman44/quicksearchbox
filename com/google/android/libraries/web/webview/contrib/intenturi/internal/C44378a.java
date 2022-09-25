package com.google.android.libraries.web.webview.contrib.intenturi.internal;

import android.net.Uri;
import com.google.android.libraries.web.contrib.requestblock.C43721h;
import com.google.android.libraries.web.p3353c.C43367l;
import com.google.android.libraries.web.webview.contrib.intenturi.p3477a.C44375a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.web.webview.contrib.intenturi.internal.a */
/* compiled from: PG */
final /* synthetic */ class C44378a implements C43721h {

    /* renamed from: a */
    public static final C44378a f115384a = new C44378a();

    /* renamed from: a */
    public final boolean mo30517a(C43367l lVar) {
        C69664n.m101061g(lVar, "p0");
        C69664n.m101061g(lVar, "<this>");
        Uri parse = Uri.parse(lVar.f113296b);
        C69664n.m101060f(parse, "parse(currentUrl)");
        return C44375a.m78360a(parse);
    }
}
