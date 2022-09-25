package com.google.android.gms.search.queries.p10874b;

import com.google.common.base.C58832aw;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.gms.search.queries.b.e */
/* compiled from: PG */
public final class C145933e {

    /* renamed from: a */
    private final String f394533a;

    /* renamed from: b */
    private final List f394534b;

    public C145933e(String str, List list) {
        this.f394533a = str;
        this.f394534b = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C145933e)) {
            return false;
        }
        return C58832aw.m90831a(((C145933e) obj).toString(), toString());
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{toString()});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("(");
        sb.append(this.f394533a);
        for (C145930b append : this.f394534b) {
            sb.append(" ");
            sb.append(append);
        }
        sb.append(")");
        return sb.toString();
    }
}
