package org.p5633c.p5634a;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import org.p5633c.p5634a.p5635a.C72141i;

/* renamed from: org.c.a.ad */
/* compiled from: PG */
public final class C72146ad implements Serializable {

    /* renamed from: a */
    static final int f191968a = 1;

    /* renamed from: b */
    static final int f191969b = 2;

    /* renamed from: c */
    static final int f191970c = 3;

    /* renamed from: d */
    static final int f191971d = 4;

    /* renamed from: e */
    static final int f191972e = 5;

    /* renamed from: f */
    static final int f191973f = 6;

    /* renamed from: g */
    static final int f191974g = 7;

    /* renamed from: i */
    private static C72146ad f191975i = null;

    /* renamed from: j */
    private static C72146ad f191976j = null;

    /* renamed from: k */
    private static C72146ad f191977k = null;
    private static final long serialVersionUID = 2274324892792009998L;

    /* renamed from: h */
    public final C72293q[] f191978h;

    /* renamed from: l */
    private final String f191979l;

    /* renamed from: m */
    private final int[] f191980m;

    static {
        new HashMap(32);
    }

    public C72146ad(String str, C72293q[] qVarArr, int[] iArr) {
        this.f191979l = str;
        this.f191978h = qVarArr;
        this.f191980m = iArr;
    }

    /* renamed from: c */
    public static C72146ad m105761c() {
        C72146ad adVar = f191976j;
        if (adVar != null) {
            return adVar;
        }
        C72146ad adVar2 = new C72146ad("Days", new C72293q[]{C72293q.f192442g}, new int[]{-1, -1, -1, 0, -1, -1, -1, -1});
        f191976j = adVar2;
        return adVar2;
    }

    /* renamed from: d */
    public static C72146ad m105762d() {
        C72146ad adVar = f191977k;
        if (adVar != null) {
            return adVar;
        }
        C72146ad adVar2 = new C72146ad("Minutes", new C72293q[]{C72293q.f192445j}, new int[]{-1, -1, -1, -1, -1, 0, -1, -1});
        f191977k = adVar2;
        return adVar2;
    }

    /* renamed from: e */
    public static C72146ad m105763e() {
        C72146ad adVar = f191975i;
        if (adVar != null) {
            return adVar;
        }
        C72146ad adVar2 = new C72146ad("Standard", new C72293q[]{C72293q.f192439d, C72293q.f192440e, C72293q.f192441f, C72293q.f192442g, C72293q.f192444i, C72293q.f192445j, C72293q.f192446k, C72293q.f192447l}, new int[]{0, 1, 2, 3, 4, 5, 6, 7});
        f191975i = adVar2;
        return adVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo63429a(C72152aj ajVar, int i) {
        int i2 = this.f191980m[i];
        if (i2 == -1) {
            return 0;
        }
        return ((C72141i) ajVar).f191966b[i2];
    }

    /* renamed from: b */
    public final int mo63430b(C72293q qVar) {
        int length = this.f191978h.length;
        for (int i = 0; i < length; i++) {
            if (this.f191978h[i] == qVar) {
                return i;
            }
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72146ad)) {
            return false;
        }
        return Arrays.equals(this.f191978h, ((C72146ad) obj).f191978h);
    }

    /* renamed from: f */
    public final boolean mo63432f(C72293q qVar) {
        return mo63430b(qVar) >= 0;
    }

    public final int hashCode() {
        int i = 0;
        int i2 = 0;
        while (true) {
            C72293q[] qVarArr = this.f191978h;
            if (i >= qVarArr.length) {
                return i2;
            }
            i2 += qVarArr[i].hashCode();
            i++;
        }
    }

    public final String toString() {
        String str = this.f191979l;
        return "PeriodType[" + str + "]";
    }
}
