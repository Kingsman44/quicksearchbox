package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Comparator;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aqt */
/* compiled from: PG */
final class aqt extends aqv {
    /* renamed from: f */
    static final aqv m19327f(int i) {
        return i < 0 ? aqv.f21409b : i > 0 ? aqv.f21410c : aqv.f21408a;
    }

    /* renamed from: a */
    public final aqv mo15217a(Object obj, Object obj2, Comparator comparator) {
        return m19327f(comparator.compare(obj, obj2));
    }

    /* renamed from: b */
    public final aqv mo15218b(int i, int i2) {
        return m19327f(i < i2 ? -1 : i > i2 ? 1 : 0);
    }

    /* renamed from: c */
    public final aqv mo15219c(boolean z, boolean z2) {
        return m19327f(aqd.m19287o(z2, z));
    }

    /* renamed from: d */
    public final aqv mo15220d(boolean z, boolean z2) {
        return m19327f(aqd.m19287o(z, z2));
    }

    /* renamed from: e */
    public final int mo15221e() {
        return 0;
    }
}
