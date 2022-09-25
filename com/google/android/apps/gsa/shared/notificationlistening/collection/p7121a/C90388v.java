package com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a;

import java.util.Locale;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.a.v */
/* compiled from: PG */
final class C90388v {

    /* renamed from: a */
    public final Integer f252443a;

    /* renamed from: b */
    public final Integer f252444b;

    /* renamed from: c */
    public final Integer f252445c;

    /* renamed from: d */
    private final Pattern f252446d;

    /* renamed from: e */
    private final Map f252447e;

    public C90388v(Pattern pattern, Map map, Integer num, int i, Integer num2) {
        this.f252446d = pattern;
        this.f252447e = map;
        this.f252443a = num;
        this.f252444b = Integer.valueOf(i);
        this.f252445c = num2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Pattern mo84089a() {
        Map map = this.f252447e;
        if (map == null) {
            return this.f252446d;
        }
        Pattern pattern = (Pattern) map.get(Locale.getDefault());
        return pattern != null ? pattern : this.f252446d;
    }

    public final String toString() {
        Integer num = this.f252443a;
        Integer num2 = this.f252444b;
        Integer num3 = this.f252445c;
        String pattern = this.f252446d.toString();
        return num + " : " + num2 + " : " + num3 + " : " + pattern;
    }
}
