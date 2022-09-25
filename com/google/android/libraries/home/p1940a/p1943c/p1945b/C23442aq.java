package com.google.android.libraries.home.p1940a.p1943c.p1945b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23543dq;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.protobuf.C63063ga;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.b.aq */
/* compiled from: PG */
public final class C23442aq implements C23543dq {
    /* renamed from: b */
    public static final C23443ar m43855b(String str, boolean z) {
        C69664n.m101061g(str, "activeMode");
        return new C23443ar(str, z);
    }

    /* renamed from: c */
    public static /* synthetic */ C23443ar m43856c(String str, int i) {
        return m43855b(str, (i & 2) != 0);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23544dr mo28843a(C63063ga gaVar) {
        C69664n.m101061g(gaVar, "value");
        String str = gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
        C69664n.m101060f(str, "value.stringValue");
        return m43855b(str, true);
    }
}
