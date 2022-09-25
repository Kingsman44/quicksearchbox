package com.google.android.apps.search.podcasts.player.p10597d;

import android.util.Base64;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69755d;

/* renamed from: com.google.android.apps.search.podcasts.player.d.b */
/* compiled from: PG */
public final class C140786b {
    /* renamed from: a */
    public static final String m228596a(String str) {
        byte[] decode = Base64.decode(str, 11);
        C69664n.m101060f(decode, "decode(base64String, Bas…DDING or Base64.URL_SAFE)");
        return new String(decode, C69755d.f186125a);
    }

    /* renamed from: b */
    public static final String m228597b(String str) {
        byte[] bytes = str.getBytes(C69755d.f186125a);
        C69664n.m101060f(bytes, "this as java.lang.String).getBytes(charset)");
        String encodeToString = Base64.encodeToString(bytes, 11);
        C69664n.m101060f(encodeToString, "encodeToString(\n      st… or Base64.URL_SAFE\n    )");
        return encodeToString;
    }
}
