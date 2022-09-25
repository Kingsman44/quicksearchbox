package com.google.ads.interactivemedia.p367v3.internal;

import java.util.Map;

/* renamed from: com.google.ads.interactivemedia.v3.internal.asf */
/* compiled from: PG */
final class asf extends arx {

    /* renamed from: a */
    private final transient ars f21479a;
    /* access modifiers changed from: private */

    /* renamed from: b */
    public final transient Object[] f21480b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public final transient int f21481c = 0;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public final transient int f21482d;

    public asf(ars ars, Object[] objArr, int i) {
        this.f21479a = ars;
        this.f21480b = objArr;
        this.f21482d = i;
    }

    /* renamed from: a */
    public final asp iterator() {
        return mo15277e().listIterator();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null || !value.equals(this.f21479a.get(key))) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final boolean mo15278f() {
        return true;
    }

    /* renamed from: g */
    public final int mo15279g(Object[] objArr) {
        return mo15277e().mo15279g(objArr);
    }

    /* renamed from: m */
    public final arn mo15337m() {
        return new ase(this);
    }

    public final int size() {
        return this.f21482d;
    }
}
