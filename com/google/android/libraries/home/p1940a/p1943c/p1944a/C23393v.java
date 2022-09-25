package com.google.android.libraries.home.p1940a.p1943c.p1944a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.home.p1940a.p1943c.C23543dq;
import com.google.android.libraries.home.p1940a.p1943c.C23544dr;
import com.google.protobuf.C63063ga;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.a.v */
/* compiled from: PG */
public final class C23393v implements C23543dq {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C23544dr mo28843a(C63063ga gaVar) {
        C69664n.m101061g(gaVar, "value");
        String str = gaVar.f170181a == 3 ? (String) gaVar.f170182b : BuildConfig.FLAVOR;
        C69664n.m101060f(str, "value.stringValue");
        C69664n.m101061g(str, "tokenTypeString");
        Map map = C23394w.f63949a;
        C69664n.m101061g(str, "value");
        Object obj = C23394w.f63949a.get(str);
        if (obj == null) {
            obj = C23394w.WWN;
        }
        C23394w wVar = (C23394w) obj;
        C69664n.m101061g(wVar, "tokenType");
        return new C23395x(wVar.f63957h, true);
    }
}
