package com.google.common.p4522b;

import com.google.common.base.C58832aw;
import com.google.common.base.C58838bb;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* renamed from: com.google.common.b.fj */
/* compiled from: PG */
final class C58447fj implements Serializable {

    /* renamed from: a */
    public final Comparator f156047a;

    /* renamed from: b */
    public final boolean f156048b;

    /* renamed from: c */
    public final Object f156049c;

    /* renamed from: d */
    public final boolean f156050d;

    /* renamed from: e */
    public final Object f156051e;

    /* renamed from: f */
    public final int f156052f;

    /* renamed from: g */
    public final int f156053g;

    public C58447fj(Comparator comparator, boolean z, Object obj, int i, boolean z2, Object obj2, int i2) {
        comparator.getClass();
        this.f156047a = comparator;
        this.f156048b = z;
        this.f156050d = z2;
        this.f156049c = obj;
        this.f156052f = i;
        this.f156051e = obj2;
        this.f156053g = i2;
        if (z) {
            comparator.compare(obj, obj);
        }
        if (z2) {
            comparator.compare(obj2, obj2);
        }
        if (z && z2) {
            int compare = comparator.compare(obj, obj2);
            boolean z3 = false;
            C58838bb.m90879n(compare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", obj, obj2);
            if (compare == 0) {
                C58838bb.m90868c((i == 1 && i2 == 1) ? z3 : true);
            }
        }
    }

    /* renamed from: a */
    static C58447fj m89717a(Comparator comparator) {
        return new C58447fj(comparator, false, (Object) null, 1, false, (Object) null, 1);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C58447fj mo55302b(C58447fj fjVar) {
        int compare;
        int i;
        int i2;
        Object obj;
        int compare2;
        C58838bb.m90868c(this.f156047a.equals(fjVar.f156047a));
        boolean z = this.f156048b;
        Object obj2 = this.f156049c;
        int i3 = this.f156052f;
        if (!z) {
            z = fjVar.f156048b;
            obj2 = fjVar.f156049c;
            i3 = fjVar.f156052f;
        } else if (fjVar.f156048b && ((compare2 = this.f156047a.compare(obj2, fjVar.f156049c)) < 0 || (compare2 == 0 && fjVar.f156052f == 1))) {
            obj2 = fjVar.f156049c;
            i3 = fjVar.f156052f;
        }
        boolean z2 = z;
        boolean z3 = this.f156050d;
        Object obj3 = this.f156051e;
        int i4 = this.f156053g;
        if (!z3) {
            z3 = fjVar.f156050d;
            obj3 = fjVar.f156051e;
            i4 = fjVar.f156053g;
        } else if (fjVar.f156050d && ((compare = this.f156047a.compare(obj3, fjVar.f156051e)) > 0 || (compare == 0 && fjVar.f156053g == 1))) {
            obj3 = fjVar.f156051e;
            i4 = fjVar.f156053g;
        }
        boolean z4 = z3;
        Object obj4 = obj3;
        if (z2 && z4) {
            int compare3 = this.f156047a.compare(obj2, obj4);
            if (compare3 <= 0) {
                if (compare3 == 0 && i3 == 1) {
                    if (i4 != 1) {
                        obj = obj2;
                        i2 = i3;
                        i = 2;
                        return new C58447fj(this.f156047a, z2, obj, i2, z4, obj4, i);
                    }
                }
            }
            obj = obj4;
            i2 = 1;
            i = 2;
            return new C58447fj(this.f156047a, z2, obj, i2, z4, obj4, i);
        }
        obj = obj2;
        i2 = i3;
        i = i4;
        return new C58447fj(this.f156047a, z2, obj, i2, z4, obj4, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final boolean mo55303c(Object obj) {
        return !mo55305e(obj) && !mo55304d(obj);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final boolean mo55304d(Object obj) {
        boolean z = false;
        if (!this.f156050d) {
            return false;
        }
        int compare = this.f156047a.compare(obj, this.f156051e);
        boolean z2 = compare > 0;
        boolean z3 = compare == 0;
        if (this.f156053g == 1) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final boolean mo55305e(Object obj) {
        boolean z = false;
        if (!this.f156048b) {
            return false;
        }
        int compare = this.f156047a.compare(obj, this.f156049c);
        boolean z2 = compare < 0;
        boolean z3 = compare == 0;
        if (this.f156052f == 1) {
            z = true;
        }
        return (z3 & z) | z2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C58447fj) {
            C58447fj fjVar = (C58447fj) obj;
            if (this.f156047a.equals(fjVar.f156047a) && this.f156048b == fjVar.f156048b && this.f156050d == fjVar.f156050d && this.f156052f == fjVar.f156052f && this.f156053g == fjVar.f156053g && C58832aw.m90831a(this.f156049c, fjVar.f156049c) && C58832aw.m90831a(this.f156051e, fjVar.f156051e)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f156047a, this.f156049c, Integer.valueOf(this.f156052f), this.f156051e, Integer.valueOf(this.f156053g)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f156047a);
        sb.append(":");
        sb.append(this.f156052f == 2 ? '[' : '(');
        sb.append(this.f156048b ? this.f156049c : "-∞");
        sb.append(',');
        sb.append(this.f156050d ? this.f156051e : "∞");
        sb.append(this.f156053g == 2 ? ']' : ')');
        return sb.toString();
    }
}
