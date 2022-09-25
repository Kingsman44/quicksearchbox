package com.google.ads.interactivemedia.p367v3.internal;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ads.interactivemedia.v3.internal.aic */
/* compiled from: PG */
public final class aic extends AbstractMap implements Serializable {

    /* renamed from: f */
    private static final Comparator f20687f = new ahv();

    /* renamed from: a */
    final Comparator f20688a;

    /* renamed from: b */
    aib f20689b;

    /* renamed from: c */
    int f20690c = 0;

    /* renamed from: d */
    int f20691d = 0;

    /* renamed from: e */
    final aib f20692e = new aib();

    /* renamed from: g */
    private ahx f20693g;

    /* renamed from: h */
    private ahz f20694h;

    public aic() {
        Comparator comparator = f20687f;
        this.f20688a = comparator;
    }

    /* renamed from: f */
    private final void m18753f(aib aib, aib aib2) {
        aib aib3 = aib.f20679a;
        aib.f20679a = null;
        if (aib2 != null) {
            aib2.f20679a = aib3;
        }
        if (aib3 == null) {
            this.f20689b = aib2;
        } else if (aib3.f20680b == aib) {
            aib3.f20680b = aib2;
        } else {
            aib3.f20681c = aib2;
        }
    }

    /* renamed from: g */
    private final void m18754g(aib aib, boolean z) {
        while (aib != null) {
            aib aib2 = aib.f20680b;
            aib aib3 = aib.f20681c;
            int i = 0;
            int i2 = aib2 != null ? aib2.f20686h : 0;
            int i3 = aib3 != null ? aib3.f20686h : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                aib aib4 = aib3.f20680b;
                aib aib5 = aib3.f20681c;
                int i5 = aib5 != null ? aib5.f20686h : 0;
                if (aib4 != null) {
                    i = aib4.f20686h;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m18755h(aib);
                } else {
                    m18756i(aib3);
                    m18755h(aib);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                aib aib6 = aib2.f20680b;
                aib aib7 = aib2.f20681c;
                int i7 = aib7 != null ? aib7.f20686h : 0;
                if (aib6 != null) {
                    i = aib6.f20686h;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m18756i(aib);
                } else {
                    m18755h(aib2);
                    m18756i(aib);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                aib.f20686h = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                aib.f20686h = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            aib = aib.f20679a;
        }
    }

    /* renamed from: h */
    private final void m18755h(aib aib) {
        aib aib2 = aib.f20680b;
        aib aib3 = aib.f20681c;
        aib aib4 = aib3.f20680b;
        aib aib5 = aib3.f20681c;
        aib.f20681c = aib4;
        if (aib4 != null) {
            aib4.f20679a = aib;
        }
        m18753f(aib, aib3);
        aib3.f20680b = aib;
        aib.f20679a = aib3;
        int i = 0;
        int max = Math.max(aib2 != null ? aib2.f20686h : 0, aib4 != null ? aib4.f20686h : 0) + 1;
        aib.f20686h = max;
        if (aib5 != null) {
            i = aib5.f20686h;
        }
        aib3.f20686h = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    private final void m18756i(aib aib) {
        aib aib2 = aib.f20680b;
        aib aib3 = aib.f20681c;
        aib aib4 = aib2.f20680b;
        aib aib5 = aib2.f20681c;
        aib.f20680b = aib5;
        if (aib5 != null) {
            aib5.f20679a = aib;
        }
        m18753f(aib, aib2);
        aib2.f20681c = aib;
        aib.f20679a = aib2;
        int i = 0;
        int max = Math.max(aib3 != null ? aib3.f20686h : 0, aib5 != null ? aib5.f20686h : 0) + 1;
        aib.f20686h = max;
        if (aib4 != null) {
            i = aib4.f20686h;
        }
        aib2.f20686h = Math.max(max, i) + 1;
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final aib mo14805a(Object obj, boolean z) {
        int i;
        aib aib;
        Comparator comparator = this.f20688a;
        aib aib2 = this.f20689b;
        if (aib2 != null) {
            Comparable comparable = comparator == f20687f ? (Comparable) obj : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(aib2.f20684f);
                } else {
                    i = comparator.compare(obj, aib2.f20684f);
                }
                if (i == 0) {
                    return aib2;
                }
                aib aib3 = i < 0 ? aib2.f20680b : aib2.f20681c;
                if (aib3 == null) {
                    break;
                }
                aib2 = aib3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        aib aib4 = this.f20692e;
        if (aib2 != null) {
            aib = new aib(aib2, obj, aib4, aib4.f20683e);
            if (i < 0) {
                aib2.f20680b = aib;
            } else {
                aib2.f20681c = aib;
            }
            m18754g(aib2, true);
        } else if (comparator != f20687f || (obj instanceof Comparable)) {
            aib = new aib((aib) null, obj, aib4, aib4.f20683e);
            this.f20689b = aib;
        } else {
            throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
        }
        this.f20690c++;
        this.f20691d++;
        return aib;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final aib mo14806b(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo14805a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final aib mo14807c(Map.Entry entry) {
        aib b = mo14806b(entry.getKey());
        if (b == null) {
            return null;
        }
        Object obj = b.f20685g;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return b;
        }
        return null;
    }

    public final void clear() {
        this.f20689b = null;
        this.f20690c = 0;
        this.f20691d++;
        aib aib = this.f20692e;
        aib.f20683e = aib;
        aib.f20682d = aib;
    }

    public final boolean containsKey(Object obj) {
        return mo14806b(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo14810d(aib aib, boolean z) {
        aib aib2;
        int i;
        aib aib3;
        if (z) {
            aib aib4 = aib.f20683e;
            aib4.f20682d = aib.f20682d;
            aib.f20682d.f20683e = aib4;
        }
        aib aib5 = aib.f20680b;
        aib aib6 = aib.f20681c;
        aib aib7 = aib.f20679a;
        int i2 = 0;
        if (aib5 == null || aib6 == null) {
            if (aib5 != null) {
                m18753f(aib, aib5);
                aib.f20680b = null;
            } else if (aib6 != null) {
                m18753f(aib, aib6);
                aib.f20681c = null;
            } else {
                m18753f(aib, (aib) null);
            }
            m18754g(aib7, false);
            this.f20690c--;
            this.f20691d++;
            return;
        }
        if (aib5.f20686h > aib6.f20686h) {
            do {
                aib2 = aib5;
                aib5 = aib5.f20681c;
            } while (aib5 != null);
        } else {
            do {
                aib aib8 = aib6;
                aib6 = aib6.f20680b;
                aib3 = aib8;
            } while (aib6 != null);
            aib2 = aib3;
        }
        mo14810d(aib2, false);
        aib aib9 = aib.f20680b;
        if (aib9 != null) {
            i = aib9.f20686h;
            aib2.f20680b = aib9;
            aib9.f20679a = aib2;
            aib.f20680b = null;
        } else {
            i = 0;
        }
        aib aib10 = aib.f20681c;
        if (aib10 != null) {
            i2 = aib10.f20686h;
            aib2.f20681c = aib10;
            aib10.f20679a = aib2;
            aib.f20681c = null;
        }
        aib2.f20686h = Math.max(i, i2) + 1;
        m18753f(aib, aib2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final aib mo14811e(Object obj) {
        aib b = mo14806b(obj);
        if (b != null) {
            mo14810d(b, true);
        }
        return b;
    }

    public final Set entrySet() {
        ahx ahx = this.f20693g;
        if (ahx != null) {
            return ahx;
        }
        ahx ahx2 = new ahx(this);
        this.f20693g = ahx2;
        return ahx2;
    }

    public final Object get(Object obj) {
        aib b = mo14806b(obj);
        if (b != null) {
            return b.f20685g;
        }
        return null;
    }

    public final Set keySet() {
        ahz ahz = this.f20694h;
        if (ahz != null) {
            return ahz;
        }
        ahz ahz2 = new ahz(this);
        this.f20694h = ahz2;
        return ahz2;
    }

    public final Object remove(Object obj) {
        aib e = mo14811e(obj);
        if (e != null) {
            return e.f20685g;
        }
        return null;
    }

    public final int size() {
        return this.f20690c;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            aib a = mo14805a(obj, true);
            Object obj3 = a.f20685g;
            a.f20685g = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }
}
