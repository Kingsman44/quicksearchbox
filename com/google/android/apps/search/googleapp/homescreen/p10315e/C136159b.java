package com.google.android.apps.search.googleapp.homescreen.p10315e;

import java.util.List;
import p5462h.p5463a.C69540x;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.homescreen.e.b */
/* compiled from: PG */
public final class C136159b {

    /* renamed from: a */
    public static final List f370820a = C69540x.m100947e(1, 2);

    /* renamed from: b */
    public static final List f370821b = C69540x.m100947e(1, 6);

    /* renamed from: c */
    public static final List f370822c = C69540x.m100947e(8, 6);

    /* renamed from: d */
    public static final List f370823d = C69540x.m100947e(8, 7);

    /* renamed from: e */
    public final int f370824e;

    /* renamed from: f */
    public final Integer f370825f;

    public C136159b(int i, Integer num) {
        this.f370824e = i;
        this.f370825f = num;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C136159b)) {
            return false;
        }
        C136159b bVar = (C136159b) obj;
        return this.f370824e == bVar.f370824e && C69664n.m101066l(this.f370825f, bVar.f370825f);
    }

    public final int hashCode() {
        int i = this.f370824e * 31;
        Integer num = this.f370825f;
        return i + (num == null ? 0 : num.hashCode());
    }

    public final String toString() {
        int i = this.f370824e;
        Integer num = this.f370825f;
        return "WeatherInformation(iconResourceId=" + i + ", contentDescriptionResourceId=" + num + ")";
    }
}
