package com.google.android.apps.search.googleapp.discover.p10238u.p10242c;

import com.google.android.libraries.search.p3024j.C38522a;
import com.google.apps.tiktok.p3644h.C47137n;
import com.google.apps.tiktok.p3644h.C47141r;
import com.google.common.base.C58838bb;
import com.google.common.p4574q.C60735n;
import com.google.frameworks.client.data.android.C61373ao;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.c.a */
/* compiled from: PG */
public final class C134996a {
    /* renamed from: a */
    public static final C47141r m218913a(String str, int i, C61373ao aoVar) {
        C58838bb.m90871f(C60735n.m92690d(i), "Port out of range: %s", i);
        C60735n b = C60735n.m92689b(str);
        C58838bb.m90873h(!b.mo57124c(), "Host has a port: %s", str);
        C60735n nVar = new C60735n(b.f164743a, i, b.f164744b);
        C60735n a = C38522a.m67774a("discover.grpc.url", nVar.f164743a, nVar.mo57123a());
        C47137n nVar2 = new C47137n();
        nVar2.f122753a = a.f164743a;
        nVar2.f122754b = Integer.valueOf(a.mo57123a());
        nVar2.mo51035b(aoVar);
        C47141r c = nVar2.mo51042c();
        C69664n.m101060f(c, "builder()\n      .setHost…iceConfig)\n      .build()");
        return c;
    }
}
