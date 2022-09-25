package com.google.android.apps.search.podcasts.playerpanel.p10598a;

import com.google.android.apps.search.podcasts.widgets.valueselector.C141288f;
import java.util.Arrays;
import java.util.Locale;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.playerpanel.a.n */
/* compiled from: PG */
public final class C140867n implements C141288f {

    /* renamed from: a */
    private final int f382526a;

    public C140867n(int i) {
        this.f382526a = i;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo115955a() {
        return Integer.valueOf(this.f382526a);
    }

    /* renamed from: b */
    public final String mo115956b() {
        return String.valueOf(this.f382526a);
    }

    /* renamed from: c */
    public final String mo115957c() {
        String format = String.format(Locale.US, "%d min", Arrays.copyOf(new Object[]{Integer.valueOf(this.f382526a)}, 1));
        C69664n.m101060f(format, "format(locale, format, *args)");
        return format;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C140867n) && this.f382526a == ((C140867n) obj).f382526a;
    }

    public final int hashCode() {
        return this.f382526a;
    }
}
