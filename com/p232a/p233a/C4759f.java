package com.p232a.p233a;

import java.util.List;

/* renamed from: com.a.a.f */
/* compiled from: PG */
public final class C4759f {

    /* renamed from: a */
    public List f15073a = null;

    /* renamed from: b */
    public int f15074b = 0;

    /* renamed from: a */
    public final int mo9669a() {
        List list = this.f15073a;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    /* renamed from: b */
    public final C4760g mo9670b(int i) {
        return (C4760g) this.f15073a.get(i);
    }

    /* renamed from: c */
    public final void mo9671c() {
        this.f15074b += 100;
    }

    /* renamed from: d */
    public final boolean mo9672d() {
        List list = this.f15073a;
        if (list == null) {
            return true;
        }
        return list.isEmpty();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (C4760g append : this.f15073a) {
            sb.append(append);
            sb.append(' ');
        }
        sb.append('(');
        sb.append(this.f15074b);
        sb.append(')');
        return sb.toString();
    }
}
