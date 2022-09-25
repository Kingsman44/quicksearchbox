package com.p232a.p233a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.a.a.g */
/* compiled from: PG */
final class C4760g {

    /* renamed from: a */
    public final String f15075a;

    /* renamed from: b */
    public List f15076b = null;

    /* renamed from: c */
    public List f15077c = null;

    /* renamed from: d */
    public final int f15078d;

    public C4760g(int i, String str) {
        this.f15078d = i == 0 ? 1 : i;
        this.f15075a = str;
    }

    /* renamed from: a */
    public final void mo9674a(String str, int i, String str2) {
        if (this.f15076b == null) {
            this.f15076b = new ArrayList();
        }
        this.f15076b.add(new C4691a(str, i, str2));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.f15078d;
        if (i == 2) {
            sb.append("> ");
        } else if (i == 3) {
            sb.append("+ ");
        }
        String str = this.f15075a;
        if (str == null) {
            str = "*";
        }
        sb.append(str);
        List<C4691a> list = this.f15076b;
        if (list != null) {
            for (C4691a aVar : list) {
                sb.append('[');
                sb.append(aVar.f14732a);
                int i2 = aVar.f14734c - 1;
                if (i2 == 1) {
                    sb.append('=');
                    sb.append(aVar.f14733b);
                } else if (i2 == 2) {
                    sb.append("~=");
                    sb.append(aVar.f14733b);
                } else if (i2 == 3) {
                    sb.append("|=");
                    sb.append(aVar.f14733b);
                }
                sb.append(']');
            }
        }
        List<String> list2 = this.f15077c;
        if (list2 != null) {
            for (String append : list2) {
                sb.append(':');
                sb.append(append);
            }
        }
        return sb.toString();
    }
}
