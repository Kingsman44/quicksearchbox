package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.protobuf.bf */
/* compiled from: PG */
public final class C62926bf {

    /* renamed from: a */
    public static final C62926bf f169887a = new C62926bf((byte[]) null);

    /* renamed from: b */
    final C63031ew f169888b = new C63024ep(16);

    /* renamed from: c */
    public boolean f169889c;

    /* renamed from: d */
    public boolean f169890d;

    private C62926bf() {
    }

    /* renamed from: a */
    static int m95397a(C63066gd gdVar, int i, Object obj) {
        int M = C62906an.m95320M(i);
        if (gdVar == C63066gd.GROUP) {
            C62972cr.m95550j((MessageLite) obj);
            M += M;
        }
        return M + m95398b(gdVar, obj);
    }

    /* renamed from: b */
    static int m95398b(C63066gd gdVar, Object obj) {
        C63066gd gdVar2 = C63066gd.DOUBLE;
        C63067ge geVar = C63067ge.INT;
        switch (gdVar.ordinal()) {
            case 0:
                ((Double) obj).doubleValue();
                boolean z = C62906an.f169852e;
                return 8;
            case 1:
                ((Float) obj).floatValue();
                boolean z2 = C62906an.f169852e;
                return 4;
            case 2:
                return C62906an.m95322O(((Long) obj).longValue());
            case 3:
                return C62906an.m95322O(((Long) obj).longValue());
            case 4:
                return C62906an.m95314G(((Integer) obj).intValue());
            case 5:
                ((Long) obj).longValue();
                boolean z3 = C62906an.f169852e;
                return 8;
            case 6:
                ((Integer) obj).intValue();
                boolean z4 = C62906an.f169852e;
                return 4;
            case 7:
                ((Boolean) obj).booleanValue();
                boolean z5 = C62906an.f169852e;
                return 1;
            case 8:
                if (obj instanceof C63088z) {
                    return C62906an.m95311D((C63088z) obj);
                }
                return C62906an.m95319L((String) obj);
            case 9:
                return C62906an.m95313F((MessageLite) obj);
            case 10:
                if (obj instanceof C62979cy) {
                    return C62906an.m95315H((C62979cy) obj);
                }
                return C62906an.m95316I((MessageLite) obj);
            case 11:
                if (obj instanceof C63088z) {
                    return C62906an.m95311D((C63088z) obj);
                }
                return C62906an.m95310C((byte[]) obj);
            case 12:
                return C62906an.m95321N(((Integer) obj).intValue());
            case 13:
                if (obj instanceof C62957cd) {
                    return C62906an.m95314G(((C62957cd) obj).getNumber());
                }
                return C62906an.m95314G(((Integer) obj).intValue());
            case 14:
                ((Integer) obj).intValue();
                boolean z6 = C62906an.f169852e;
                return 4;
            case 15:
                ((Long) obj).longValue();
                boolean z7 = C62906an.f169852e;
                return 8;
            case 16:
                int intValue = ((Integer) obj).intValue();
                return C62906an.m95321N((intValue >> 31) ^ (intValue + intValue));
            case 17:
                long longValue = ((Long) obj).longValue();
                return C62906an.m95322O((longValue >> 63) ^ (longValue + longValue));
            default:
                throw new RuntimeException("There is no way to get here, but the compiler thinks otherwise.");
        }
    }

    /* renamed from: h */
    static void m95399h(C62906an anVar, C63066gd gdVar, int i, Object obj) {
        if (gdVar != C63066gd.GROUP) {
            anVar.mo58778u(i, gdVar.f170204t);
            C63067ge geVar = C63067ge.INT;
            switch (gdVar.ordinal()) {
                case 0:
                    anVar.mo58769l(Double.doubleToRawLongBits(((Double) obj).doubleValue()));
                    return;
                case 1:
                    anVar.mo58767j(Float.floatToRawIntBits(((Float) obj).floatValue()));
                    return;
                case 2:
                    anVar.mo58782y(((Long) obj).longValue());
                    return;
                case 3:
                    anVar.mo58782y(((Long) obj).longValue());
                    return;
                case 4:
                    anVar.mo58771n(((Integer) obj).intValue());
                    return;
                case 5:
                    anVar.mo58769l(((Long) obj).longValue());
                    return;
                case 6:
                    anVar.mo58767j(((Integer) obj).intValue());
                    return;
                case 7:
                    anVar.mo58760Y(((Boolean) obj).booleanValue() ? (byte) 1 : 0);
                    return;
                case 8:
                    if (obj instanceof C63088z) {
                        anVar.mo58765h((C63088z) obj);
                        return;
                    } else {
                        anVar.mo58777t((String) obj);
                        return;
                    }
                case 9:
                    ((MessageLite) obj).writeTo(anVar);
                    return;
                case 10:
                    anVar.mo58773p((MessageLite) obj);
                    return;
                case 11:
                    if (obj instanceof C63088z) {
                        anVar.mo58765h((C63088z) obj);
                        return;
                    }
                    byte[] bArr = (byte[]) obj;
                    anVar.mo58783z(bArr, bArr.length);
                    return;
                case 12:
                    anVar.mo58780w(((Integer) obj).intValue());
                    return;
                case 13:
                    if (obj instanceof C62957cd) {
                        anVar.mo58771n(((C62957cd) obj).getNumber());
                        return;
                    } else {
                        anVar.mo58771n(((Integer) obj).intValue());
                        return;
                    }
                case 14:
                    anVar.mo58767j(((Integer) obj).intValue());
                    return;
                case 15:
                    anVar.mo58769l(((Long) obj).longValue());
                    return;
                case 16:
                    int intValue = ((Integer) obj).intValue();
                    anVar.mo58780w((intValue >> 31) ^ (intValue + intValue));
                    return;
                case 17:
                    long longValue = ((Long) obj).longValue();
                    anVar.mo58782y((longValue >> 63) ^ (longValue + longValue));
                    return;
                default:
                    return;
            }
        } else {
            MessageLite messageLite = (MessageLite) obj;
            C62972cr.m95550j(messageLite);
            anVar.mo58778u(i, 3);
            messageLite.writeTo(anVar);
            anVar.mo58778u(i, 4);
        }
    }

    /* renamed from: j */
    public static int m95400j(C62939bs bsVar, Object obj) {
        C63066gd gdVar = bsVar.f169965c;
        int i = bsVar.f169964b;
        if (!bsVar.f169966d) {
            return m95397a(gdVar, i, obj);
        }
        int i2 = 0;
        if (bsVar.f169967e) {
            for (Object b : (List) obj) {
                i2 += m95398b(gdVar, b);
            }
            return C62906an.m95320M(i) + i2 + C62906an.m95321N(i2);
        }
        for (Object a : (List) obj) {
            i2 += m95397a(gdVar, i, a);
        }
        return i2;
    }

    /* renamed from: p */
    private static Object m95401p(Object obj) {
        if (obj instanceof C63005dx) {
            return ((C63005dx) obj).mo58960a();
        }
        if (!(obj instanceof byte[])) {
            return obj;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }

    /* renamed from: q */
    private static boolean m95402q(Map.Entry entry) {
        C62939bs bsVar = (C62939bs) entry.getKey();
        if (bsVar.f169965c.f170203s != C63067ge.MESSAGE) {
            return true;
        }
        if (!bsVar.f169966d) {
            return m95403r(entry.getValue());
        }
        for (Object r : (List) entry.getValue()) {
            if (!m95403r(r)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: r */
    private static boolean m95403r(Object obj) {
        if (obj instanceof C63001dt) {
            return ((C63001dt) obj).isInitialized();
        }
        if (obj instanceof C62979cy) {
            return true;
        }
        throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
    }

    /* renamed from: s */
    private static final void m95404s(C62939bs bsVar, Object obj) {
        boolean z;
        C63066gd gdVar = bsVar.f169965c;
        C62972cr.m95548h(obj);
        C63066gd gdVar2 = C63066gd.DOUBLE;
        C63067ge geVar = C63067ge.INT;
        switch (gdVar.f170203s.ordinal()) {
            case 0:
                z = obj instanceof Integer;
                break;
            case 1:
                z = obj instanceof Long;
                break;
            case 2:
                z = obj instanceof Float;
                break;
            case 3:
                z = obj instanceof Double;
                break;
            case 4:
                z = obj instanceof Boolean;
                break;
            case 5:
                z = obj instanceof String;
                break;
            case 6:
                if ((obj instanceof C63088z) || (obj instanceof byte[])) {
                    return;
                }
            case 7:
                if ((obj instanceof Integer) || (obj instanceof C62957cd)) {
                    return;
                }
            case 8:
                if ((obj instanceof MessageLite) || (obj instanceof C62979cy)) {
                    return;
                }
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException(String.format("Wrong object type used with protocol message reflection.\nField number: %d, field java type: %s, value type: %s\n", new Object[]{Integer.valueOf(bsVar.f169964b), bsVar.f169965c.f170203s, obj.getClass().getName()}));
    }

    /* renamed from: c */
    public final int mo58844c(Map.Entry entry) {
        int N;
        int N2;
        C62939bs bsVar = (C62939bs) entry.getKey();
        Object value = entry.getValue();
        if (bsVar.f169965c.f170203s != C63067ge.MESSAGE || bsVar.f169966d || bsVar.f169967e) {
            return m95400j(bsVar, value);
        }
        if (value instanceof C62979cy) {
            int i = ((C62939bs) entry.getKey()).f169964b;
            int N3 = C62906an.m95321N(8);
            int a = ((C62979cy) value).mo58957a();
            N = N3 + N3 + C62906an.m95321N(16) + C62906an.m95321N(i);
            N2 = C62906an.m95321N(24) + C62906an.m95321N(a) + a;
        } else {
            int i2 = ((C62939bs) entry.getKey()).f169964b;
            int N4 = C62906an.m95321N(8);
            N = N4 + N4 + C62906an.m95321N(16) + C62906an.m95321N(i2);
            N2 = C62906an.m95321N(24) + C62906an.m95316I((MessageLite) value);
        }
        return N + N2;
    }

    /* renamed from: d */
    public final C62926bf clone() {
        C62926bf bfVar = new C62926bf();
        for (int i = 0; i < this.f169888b.mo59064a(); i++) {
            Map.Entry e = this.f169888b.mo59070e(i);
            bfVar.mo58856n((C62939bs) e.getKey(), e.getValue());
        }
        for (Map.Entry entry : this.f169888b.mo59065b()) {
            bfVar.mo58856n((C62939bs) entry.getKey(), entry.getValue());
        }
        bfVar.f169890d = this.f169890d;
        return bfVar;
    }

    /* renamed from: e */
    public final Iterator mo58847e() {
        if (this.f169890d) {
            return new C62978cx(this.f169888b.entrySet().iterator());
        }
        return this.f169888b.entrySet().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C62926bf)) {
            return false;
        }
        return this.f169888b.equals(((C62926bf) obj).f169888b);
    }

    /* renamed from: f */
    public final void mo58849f() {
        Map map;
        Map map2;
        if (!this.f169889c) {
            C63031ew ewVar = this.f169888b;
            if (!ewVar.f170135c) {
                for (int i = 0; i < ewVar.mo59064a(); i++) {
                    Map.Entry e = ewVar.mo59070e(i);
                    if (((C62939bs) e.getKey()).f169966d) {
                        e.setValue(Collections.unmodifiableList((List) e.getValue()));
                    }
                }
                for (Map.Entry entry : ewVar.mo59065b()) {
                    if (((C62939bs) entry.getKey()).f169966d) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            if (!ewVar.f170135c) {
                if (ewVar.f170134b.isEmpty()) {
                    map = Collections.emptyMap();
                } else {
                    map = Collections.unmodifiableMap(ewVar.f170134b);
                }
                ewVar.f170134b = map;
                if (ewVar.f170136d.isEmpty()) {
                    map2 = Collections.emptyMap();
                } else {
                    map2 = Collections.unmodifiableMap(ewVar.f170136d);
                }
                ewVar.f170136d = map2;
                ewVar.f170135c = true;
            }
            this.f169889c = true;
        }
    }

    /* renamed from: g */
    public final void mo58850g(Map.Entry entry) {
        C62939bs bsVar = (C62939bs) entry.getKey();
        Object value = entry.getValue();
        if (value instanceof C62979cy) {
            C62979cy cyVar = (C62979cy) value;
            throw null;
        } else if (bsVar.f169966d) {
            Object l = mo58854l(bsVar);
            if (l == null) {
                l = new ArrayList();
            }
            for (Object p : (List) value) {
                ((List) l).add(m95401p(p));
            }
            this.f169888b.put(bsVar, l);
        } else if (bsVar.f169965c.f170203s == C63067ge.MESSAGE) {
            Object l2 = mo58854l(bsVar);
            if (l2 == null) {
                this.f169888b.put(bsVar, m95401p(value));
            } else if (!(l2 instanceof C63005dx)) {
                this.f169888b.put(bsVar, ((C62934bn) ((MessageLite) l2).toBuilder()).mergeFrom((C62942bv) ((MessageLite) value)).build());
            } else {
                C63005dx dxVar = (C63005dx) l2;
                C63005dx dxVar2 = (C63005dx) value;
                throw new UnsupportedOperationException();
            }
        } else {
            this.f169888b.put(bsVar, m95401p(value));
        }
    }

    public final int hashCode() {
        return this.f169888b.hashCode();
    }

    /* renamed from: i */
    public final boolean mo58852i() {
        for (int i = 0; i < this.f169888b.mo59064a(); i++) {
            if (!m95402q(this.f169888b.mo59070e(i))) {
                return false;
            }
        }
        for (Map.Entry q : this.f169888b.mo59065b()) {
            if (!m95402q(q)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: k */
    public final int mo58853k(C62939bs bsVar) {
        if (bsVar.f169966d) {
            Object l = mo58854l(bsVar);
            if (l == null) {
                return 0;
            }
            return ((List) l).size();
        }
        throw new IllegalArgumentException("getRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: l */
    public final Object mo58854l(C62939bs bsVar) {
        Object obj = this.f169888b.get(bsVar);
        if (!(obj instanceof C62979cy)) {
            return obj;
        }
        C62979cy cyVar = (C62979cy) obj;
        throw null;
    }

    /* renamed from: m */
    public final void mo58855m(C62939bs bsVar, Object obj) {
        List list;
        if (bsVar.f169966d) {
            m95404s(bsVar, obj);
            Object l = mo58854l(bsVar);
            if (l == null) {
                list = new ArrayList();
                this.f169888b.put(bsVar, list);
            } else {
                list = (List) l;
            }
            list.add(obj);
            return;
        }
        throw new IllegalArgumentException("addRepeatedField() can only be called on repeated fields.");
    }

    /* renamed from: n */
    public final void mo58856n(C62939bs bsVar, Object obj) {
        if (!bsVar.f169966d) {
            m95404s(bsVar, obj);
        } else if (obj instanceof List) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll((List) obj);
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                m95404s(bsVar, arrayList.get(i));
            }
            obj = arrayList;
        } else {
            throw new IllegalArgumentException("Wrong object type used with protocol message reflection.");
        }
        if (obj instanceof C62979cy) {
            this.f169890d = true;
        }
        this.f169888b.put(bsVar, obj);
    }

    /* renamed from: o */
    public final boolean mo58857o(C62939bs bsVar) {
        if (!bsVar.f169966d) {
            return this.f169888b.get(bsVar) != null;
        }
        throw new IllegalArgumentException("hasField() can only be called on non-repeated fields.");
    }

    private C62926bf(byte[] bArr) {
        mo58849f();
        mo58849f();
    }
}
