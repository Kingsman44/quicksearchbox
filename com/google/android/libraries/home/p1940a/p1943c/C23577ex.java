package com.google.android.libraries.home.p1940a.p1943c;

import com.evernote.android.state.BuildConfig;
import java.util.Map;
import p3186j$.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.home.a.c.ex */
/* compiled from: PG */
public final class C23577ex extends C23567en {

    /* renamed from: a */
    public static final C23576ew f64590a = new C23576ew();

    /* renamed from: b */
    public static final C23577ex f64591b = new C23577ex(BuildConfig.FLAVOR);

    public C23577ex() {
        this(BuildConfig.FLAVOR);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23577ex(String str) {
        super(C23542dp.CHALLENGE, str, true, false, "challenge", "challenge");
        C69664n.m101061g(str, "stringValue");
        Map map = C23575ev.f64576a;
        C69664n.m101061g(str, "challengeString");
        C23575ev evVar = (C23575ev) Map.EL.getOrDefault(C23575ev.f64576a, str, C23575ev.UNKNOWN);
    }
}
