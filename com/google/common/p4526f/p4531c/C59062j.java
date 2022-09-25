package com.google.common.p4526f.p4531c;

import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.f.c.j */
/* compiled from: PG */
public final class C59062j extends AbstractMap {

    /* renamed from: a */
    public static final Comparator f156983a = new C59059g();

    /* renamed from: b */
    public final Object[] f156984b;

    /* renamed from: c */
    public final int[] f156985c;

    /* renamed from: d */
    public final Set f156986d = new C59061i(this, -1);

    /* renamed from: e */
    private Integer f156987e = null;

    /* renamed from: f */
    private String f156988f = null;

    public C59062j(C59062j jVar, C59062j jVar2) {
        int i;
        Object obj;
        int i2;
        Object[] objArr;
        C59062j jVar3 = jVar;
        C59062j jVar4 = jVar2;
        int size = jVar.size() + jVar2.size();
        int i3 = jVar3.f156985c[jVar.size()] + jVar4.f156985c[jVar2.size()];
        Object[] objArr2 = new Object[i3];
        int i4 = size + 1;
        int[] iArr = new int[i4];
        int i5 = 0;
        iArr[0] = size;
        int i6 = size;
        Map.Entry b = jVar3.m91321b(0);
        Map.Entry b2 = jVar4.m91321b(0);
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (b == null && b2 == null) {
                break;
            }
            int i10 = b == null ? 1 : b2 == null ? -1 : 0;
            if (i10 == 0 && (i10 = ((String) b.getKey()).compareTo((String) b2.getKey())) == 0) {
                objArr2[i7] = m91322c((String) b.getKey(), i7);
                int i11 = i7 + 1;
                C59061i iVar = (C59061i) b.getValue();
                C59061i iVar2 = (C59061i) b2.getValue();
                int i12 = 0;
                int i13 = 0;
                while (true) {
                    if (i12 >= iVar.mo56324a() - iVar.mo56325b() && i13 >= iVar2.mo56324a() - iVar2.mo56325b()) {
                        break;
                    }
                    int i14 = i12 == iVar.mo56324a() - iVar.mo56325b() ? 1 : i13 == iVar2.mo56324a() - iVar2.mo56325b() ? -1 : 0;
                    i14 = i14 == 0 ? C59064l.f156994a.compare(iVar.mo56326c(i12), iVar2.mo56326c(i13)) : i14;
                    if (i14 < 0) {
                        i2 = i12 + 1;
                        obj = iVar.mo56326c(i12);
                    } else {
                        int i15 = i13 + 1;
                        Object c = iVar2.mo56326c(i13);
                        i2 = i14 == 0 ? i12 + 1 : i12;
                        i13 = i15;
                        obj = c;
                    }
                    objArr2[i6] = obj;
                    i12 = i2;
                    i6++;
                    i5 = 0;
                }
                iArr[i11] = i6;
                int i16 = i8 + 1;
                b = jVar3.m91321b(i16);
                int i17 = i9 + 1;
                b2 = jVar4.m91321b(i17);
                i8 = i16;
                i9 = i17;
                i7 = i11;
            } else {
                if (i10 < 0) {
                    i = i7 + 1;
                    int a = m91320a(b, i7, i6, objArr2, iArr);
                    int i18 = i8 + 1;
                    b = jVar3.m91321b(i18);
                    i6 = a;
                    i8 = i18;
                } else {
                    i = i7 + 1;
                    int a2 = m91320a(b2, i7, i6, objArr2, iArr);
                    int i19 = i9 + 1;
                    b2 = jVar4.m91321b(i19);
                    i6 = a2;
                    i9 = i19;
                }
                i7 = i;
                i5 = 0;
            }
        }
        int i20 = iArr[i5];
        int i21 = i20 - i7;
        if (i21 != 0) {
            for (int i22 = 0; i22 <= i7; i22++) {
                iArr[i22] = iArr[i22] - i21;
            }
            int i23 = iArr[i7];
            int i24 = i23 - i7;
            if (m91323d(i3, i23)) {
                objArr = new Object[i23];
                System.arraycopy(objArr2, i5, objArr, i5, i7);
            } else {
                objArr = objArr2;
            }
            System.arraycopy(objArr2, i20, objArr, i7, i24);
            objArr2 = objArr;
        }
        this.f156984b = objArr2;
        int i25 = iArr[i5] + 1;
        this.f156985c = m91323d(i4, i25) ? Arrays.copyOf(iArr, i25) : iArr;
    }

    /* renamed from: a */
    private final int m91320a(Map.Entry entry, int i, int i2, Object[] objArr, int[] iArr) {
        C59061i iVar = (C59061i) entry.getValue();
        int a = iVar.mo56324a() - iVar.mo56325b();
        System.arraycopy(iVar.f156982b.f156984b, iVar.mo56325b(), objArr, i2, a);
        objArr[i] = m91322c((String) entry.getKey(), i);
        int i3 = i2 + a;
        iArr[i + 1] = i3;
        return i3;
    }

    /* renamed from: b */
    private final Map.Entry m91321b(int i) {
        if (i < this.f156985c[0]) {
            return (Map.Entry) this.f156984b[i];
        }
        return null;
    }

    /* renamed from: c */
    private final Map.Entry m91322c(String str, int i) {
        return new AbstractMap.SimpleImmutableEntry(str, new C59061i(this, i));
    }

    /* renamed from: d */
    private static boolean m91323d(int i, int i2) {
        return i > 16 && i * 9 > i2 * 10;
    }

    public final Set entrySet() {
        return this.f156986d;
    }

    public final int hashCode() {
        if (this.f156987e == null) {
            this.f156987e = Integer.valueOf(super.hashCode());
        }
        return this.f156987e.intValue();
    }

    public final String toString() {
        if (this.f156988f == null) {
            this.f156988f = super.toString();
        }
        return this.f156988f;
    }

    public C59062j(List list) {
        Iterator it = list.iterator();
        if (!it.hasNext()) {
            int size = list.size();
            Object[] objArr = new Object[size];
            int[] iArr = new int[1];
            Iterator it2 = list.iterator();
            if (!it2.hasNext()) {
                iArr[0] = 0;
                this.f156984b = m91323d(size, 0) ? Arrays.copyOf(objArr, 0) : objArr;
                this.f156985c = iArr;
                return;
            }
            String str = ((C59058f) it2.next()).f156978a;
            throw null;
        }
        String str2 = ((C59058f) it.next()).f156978a;
        throw null;
    }
}
