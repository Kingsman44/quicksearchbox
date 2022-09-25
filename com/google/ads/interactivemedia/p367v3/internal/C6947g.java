package com.google.ads.interactivemedia.p367v3.internal;

import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.g */
/* compiled from: PG */
public final class C6947g {

    /* renamed from: a */
    private final C7136n f22151a;

    /* renamed from: b */
    private final WebView f22152b;

    /* renamed from: c */
    private final List f22153c = new ArrayList();

    /* renamed from: d */
    private final Map f22154d = new HashMap();

    /* renamed from: e */
    private final String f22155e;

    /* renamed from: f */
    private final String f22156f;

    /* renamed from: g */
    private final C6974h f22157g;

    private C6947g(C7136n nVar, WebView webView, String str, String str2, C6974h hVar) {
        this.f22151a = nVar;
        this.f22152b = webView;
        this.f22157g = hVar;
        this.f22156f = str;
        this.f22155e = str2;
    }

    /* renamed from: a */
    public static C6947g m20386a(C7136n nVar, WebView webView, String str, String str2) {
        C7009ih.m20724b(nVar, "Partner is null");
        C7009ih.m20724b(webView, "WebView is null");
        if (str2 == null || str2.length() <= 256) {
            return new C6947g(nVar, webView, str, str2, C6974h.JAVASCRIPT);
        }
        throw new IllegalArgumentException("CustomReferenceData is greater than 256 characters");
    }

    /* renamed from: b */
    public final C7136n mo15862b() {
        return this.f22151a;
    }

    /* renamed from: c */
    public final List mo15863c() {
        return Collections.unmodifiableList(this.f22153c);
    }

    /* renamed from: d */
    public final Map mo15864d() {
        return Collections.unmodifiableMap(this.f22154d);
    }

    /* renamed from: e */
    public final WebView mo15865e() {
        return this.f22152b;
    }

    /* renamed from: f */
    public final String mo15866f() {
        return this.f22156f;
    }

    /* renamed from: g */
    public final String mo15867g() {
        return this.f22155e;
    }

    /* renamed from: h */
    public final C6974h mo15868h() {
        return this.f22157g;
    }
}
