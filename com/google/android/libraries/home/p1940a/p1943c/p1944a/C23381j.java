package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23543dq;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.protobuf.C63063ga;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.a.j */
/* compiled from: PG */
public final class C23381j implements C23543dq {
    /* renamed from: b */
    public static final C23382k m43807b(String str) {
        C69664n.m101061g(str, "iceServersJsonStr");
        return new C23382k(str, true);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23544dr mo28843a(C63063ga gaVar) {
        C69664n.m101061g(gaVar, "value");
        String str = gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
        C69664n.m101060f(str, "value.stringValue");
        return m43807b(str);
    }
}
