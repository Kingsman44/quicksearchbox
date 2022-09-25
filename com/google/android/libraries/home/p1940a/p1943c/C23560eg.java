package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C63063ga;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.eg */
/* compiled from: PG */
public final class C23560eg implements C23543dq {
    /* renamed from: b */
    public static final C23562ei m43969b(String str, boolean z) {
        C69664n.m101061g(str, "statusString");
        return new C23562ei(str, z);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23544dr mo28843a(C63063ga gaVar) {
        C69664n.m101061g(gaVar, "value");
        String str = gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
        C69664n.m101060f(str, "value.stringValue");
        return m43969b(str, true);
    }
}
