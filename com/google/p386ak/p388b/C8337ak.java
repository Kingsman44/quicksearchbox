package com.google.p386ak.p388b;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ak.b.ak */
/* compiled from: PG */
public final class C8337ak extends AbstractMap implements Serializable {

    /* renamed from: a */
    public static final Comparator f29161a = new C8330ad();

    /* renamed from: b */
    C8336aj f29162b;

    /* renamed from: c */
    public int f29163c;

    /* renamed from: d */
    int f29164d;

    /* renamed from: e */
    final C8336aj f29165e;

    /* renamed from: f */
    private final Comparator f29166f;

    /* renamed from: g */
    private final boolean f29167g;

    /* renamed from: h */
    private C8332af f29168h;

    /* renamed from: i */
    private C8334ah f29169i;

    public C8337ak() {
        this(f29161a, true);
    }

    /* renamed from: f */
    private final void m23100f(C8336aj ajVar, boolean z) {
        while (ajVar != null) {
            C8336aj ajVar2 = ajVar.f29153b;
            C8336aj ajVar3 = ajVar.f29154c;
            int i = 0;
            int i2 = ajVar2 != null ? ajVar2.f29160i : 0;
            int i3 = ajVar3 != null ? ajVar3.f29160i : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                C8336aj ajVar4 = ajVar3.f29153b;
                C8336aj ajVar5 = ajVar3.f29154c;
                int i5 = ajVar5 != null ? ajVar5.f29160i : 0;
                if (ajVar4 != null) {
                    i = ajVar4.f29160i;
                }
                int i6 = i - i5;
                if (i6 == -1 || (i6 == 0 && !z)) {
                    m23102h(ajVar);
                } else {
                    m23103i(ajVar3);
                    m23102h(ajVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                C8336aj ajVar6 = ajVar2.f29153b;
                C8336aj ajVar7 = ajVar2.f29154c;
                int i7 = ajVar7 != null ? ajVar7.f29160i : 0;
                if (ajVar6 != null) {
                    i = ajVar6.f29160i;
                }
                int i8 = i - i7;
                if (i8 == 1 || (i8 == 0 && !z)) {
                    m23103i(ajVar);
                } else {
                    m23102h(ajVar2);
                    m23103i(ajVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                ajVar.f29160i = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                ajVar.f29160i = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            ajVar = ajVar.f29152a;
        }
    }

    /* renamed from: g */
    private final void m23101g(C8336aj ajVar, C8336aj ajVar2) {
        C8336aj ajVar3 = ajVar.f29152a;
        ajVar.f29152a = null;
        if (ajVar2 != null) {
            ajVar2.f29152a = ajVar3;
        }
        if (ajVar3 == null) {
            this.f29162b = ajVar2;
        } else if (ajVar3.f29153b == ajVar) {
            ajVar3.f29153b = ajVar2;
        } else {
            ajVar3.f29154c = ajVar2;
        }
    }

    /* renamed from: h */
    private final void m23102h(C8336aj ajVar) {
        C8336aj ajVar2 = ajVar.f29153b;
        C8336aj ajVar3 = ajVar.f29154c;
        C8336aj ajVar4 = ajVar3.f29153b;
        C8336aj ajVar5 = ajVar3.f29154c;
        ajVar.f29154c = ajVar4;
        if (ajVar4 != null) {
            ajVar4.f29152a = ajVar;
        }
        m23101g(ajVar, ajVar3);
        ajVar3.f29153b = ajVar;
        ajVar.f29152a = ajVar3;
        int i = 0;
        int max = Math.max(ajVar2 != null ? ajVar2.f29160i : 0, ajVar4 != null ? ajVar4.f29160i : 0) + 1;
        ajVar.f29160i = max;
        if (ajVar5 != null) {
            i = ajVar5.f29160i;
        }
        ajVar3.f29160i = Math.max(max, i) + 1;
    }

    /* renamed from: i */
    private final void m23103i(C8336aj ajVar) {
        C8336aj ajVar2 = ajVar.f29153b;
        C8336aj ajVar3 = ajVar.f29154c;
        C8336aj ajVar4 = ajVar2.f29153b;
        C8336aj ajVar5 = ajVar2.f29154c;
        ajVar.f29153b = ajVar5;
        if (ajVar5 != null) {
            ajVar5.f29152a = ajVar;
        }
        m23101g(ajVar, ajVar2);
        ajVar2.f29154c = ajVar;
        ajVar.f29152a = ajVar2;
        int i = 0;
        int max = Math.max(ajVar3 != null ? ajVar3.f29160i : 0, ajVar5 != null ? ajVar5.f29160i : 0) + 1;
        ajVar.f29160i = max;
        if (ajVar4 != null) {
            i = ajVar4.f29160i;
        }
        ajVar2.f29160i = Math.max(max, i) + 1;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() {
        return new LinkedHashMap(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C8336aj mo17071a(Object obj, boolean z) {
        int i;
        C8336aj ajVar;
        Comparator comparator = this.f29166f;
        C8336aj ajVar2 = this.f29162b;
        if (ajVar2 != null) {
            Comparable comparable = comparator == f29161a ? (Comparable) obj : null;
            while (true) {
                if (comparable != null) {
                    i = comparable.compareTo(ajVar2.f29157f);
                } else {
                    i = comparator.compare(obj, ajVar2.f29157f);
                }
                if (i == 0) {
                    return ajVar2;
                }
                C8336aj ajVar3 = i < 0 ? ajVar2.f29153b : ajVar2.f29154c;
                if (ajVar3 == null) {
                    break;
                }
                ajVar2 = ajVar3;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        C8336aj ajVar4 = this.f29165e;
        if (ajVar2 != null) {
            ajVar = new C8336aj(this.f29167g, ajVar2, obj, ajVar4, ajVar4.f29156e);
            if (i < 0) {
                ajVar2.f29153b = ajVar;
            } else {
                ajVar2.f29154c = ajVar;
            }
            m23100f(ajVar2, true);
        } else if (comparator != f29161a || (obj instanceof Comparable)) {
            ajVar = new C8336aj(this.f29167g, (C8336aj) null, obj, ajVar4, ajVar4.f29156e);
            this.f29162b = ajVar;
        } else {
            throw new ClassCastException(String.valueOf(obj.getClass().getName()).concat(" is not Comparable"));
        }
        this.f29163c++;
        this.f29164d++;
        return ajVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C8336aj mo17072b(Map.Entry entry) {
        C8336aj c = mo17073c(entry.getKey());
        if (c == null) {
            return null;
        }
        Object obj = c.f29159h;
        Object value = entry.getValue();
        if (obj == value || (obj != null && obj.equals(value))) {
            return c;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C8336aj mo17073c(Object obj) {
        if (obj == null) {
            return null;
        }
        try {
            return mo17071a(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    public final void clear() {
        this.f29162b = null;
        this.f29163c = 0;
        this.f29164d++;
        C8336aj ajVar = this.f29165e;
        ajVar.f29156e = ajVar;
        ajVar.f29155d = ajVar;
    }

    public final boolean containsKey(Object obj) {
        return mo17073c(obj) != null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C8336aj mo17076d(Object obj) {
        C8336aj c = mo17073c(obj);
        if (c != null) {
            mo17077e(c, true);
        }
        return c;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo17077e(C8336aj ajVar, boolean z) {
        C8336aj ajVar2;
        int i;
        C8336aj ajVar3;
        if (z) {
            C8336aj ajVar4 = ajVar.f29156e;
            ajVar4.f29155d = ajVar.f29155d;
            ajVar.f29155d.f29156e = ajVar4;
        }
        C8336aj ajVar5 = ajVar.f29153b;
        C8336aj ajVar6 = ajVar.f29154c;
        C8336aj ajVar7 = ajVar.f29152a;
        int i2 = 0;
        if (ajVar5 == null || ajVar6 == null) {
            if (ajVar5 != null) {
                m23101g(ajVar, ajVar5);
                ajVar.f29153b = null;
            } else if (ajVar6 != null) {
                m23101g(ajVar, ajVar6);
                ajVar.f29154c = null;
            } else {
                m23101g(ajVar, (C8336aj) null);
            }
            m23100f(ajVar7, false);
            this.f29163c--;
            this.f29164d++;
            return;
        }
        if (ajVar5.f29160i > ajVar6.f29160i) {
            do {
                ajVar2 = ajVar5;
                ajVar5 = ajVar5.f29154c;
            } while (ajVar5 != null);
        } else {
            do {
                C8336aj ajVar8 = ajVar6;
                ajVar6 = ajVar6.f29153b;
                ajVar3 = ajVar8;
            } while (ajVar6 != null);
            ajVar2 = ajVar3;
        }
        mo17077e(ajVar2, false);
        C8336aj ajVar9 = ajVar.f29153b;
        if (ajVar9 != null) {
            i = ajVar9.f29160i;
            ajVar2.f29153b = ajVar9;
            ajVar9.f29152a = ajVar2;
            ajVar.f29153b = null;
        } else {
            i = 0;
        }
        C8336aj ajVar10 = ajVar.f29154c;
        if (ajVar10 != null) {
            i2 = ajVar10.f29160i;
            ajVar2.f29154c = ajVar10;
            ajVar10.f29152a = ajVar2;
            ajVar.f29154c = null;
        }
        ajVar2.f29160i = Math.max(i, i2) + 1;
        m23101g(ajVar, ajVar2);
    }

    public final Set entrySet() {
        C8332af afVar = this.f29168h;
        if (afVar != null) {
            return afVar;
        }
        C8332af afVar2 = new C8332af(this);
        this.f29168h = afVar2;
        return afVar2;
    }

    public final Object get(Object obj) {
        C8336aj c = mo17073c(obj);
        if (c != null) {
            return c.f29159h;
        }
        return null;
    }

    public final Set keySet() {
        C8334ah ahVar = this.f29169i;
        if (ahVar != null) {
            return ahVar;
        }
        C8334ah ahVar2 = new C8334ah(this);
        this.f29169i = ahVar2;
        return ahVar2;
    }

    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        } else if (obj2 != null || this.f29167g) {
            C8336aj a = mo17071a(obj, true);
            Object obj3 = a.f29159h;
            a.f29159h = obj2;
            return obj3;
        } else {
            throw new NullPointerException("value == null");
        }
    }

    public final Object remove(Object obj) {
        C8336aj d = mo17076d(obj);
        if (d != null) {
            return d.f29159h;
        }
        return null;
    }

    public final int size() {
        return this.f29163c;
    }

    public C8337ak(Comparator comparator, boolean z) {
        this.f29163c = 0;
        this.f29164d = 0;
        this.f29166f = comparator;
        this.f29167g = z;
        this.f29165e = new C8336aj(z);
    }
}
