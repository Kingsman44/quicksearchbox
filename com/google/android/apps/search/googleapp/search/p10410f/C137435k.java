package com.google.android.apps.search.googleapp.search.p10410f;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p5462h.C69685i;
import p5462h.p5463a.C69502as;
import p5462h.p5463a.C69540x;
import p5462h.p5466c.C69577g;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5480j.C69695c;
import p5462h.p5482l.C69734n;
import p5462h.p5482l.C69735o;

/* renamed from: com.google.android.apps.search.googleapp.search.f.k */
/* compiled from: PG */
public final class C137435k {

    /* renamed from: a */
    public final List f373805a;

    /* renamed from: b */
    public final List f373806b;

    public C137435k(List list, List list2) {
        C69664n.m101061g(list, "header");
        this.f373805a = list;
        this.f373806b = list2;
    }

    /* renamed from: a */
    public final void mo113724a(StringBuilder sb) {
        CharSequence charSequence;
        C69664n.m101061g(sb, "stringBuilder");
        List<List> list = this.f373806b;
        List<String> list2 = this.f373805a;
        ArrayList arrayList = new ArrayList(C69540x.m100804k(list2, 10));
        for (String length : list2) {
            arrayList.add(Integer.valueOf(length.length()));
        }
        for (List Y : list) {
            List<C69685i> Y2 = C69540x.m100843Y(arrayList, Y);
            arrayList = new ArrayList(C69540x.m100804k(Y2, 10));
            for (C69685i iVar : Y2) {
                arrayList.add(Integer.valueOf(Math.max(((Number) iVar.f186052a).intValue(), ((String) iVar.f186053b).length())));
            }
        }
        sb.append("  ");
        C69664n.m101060f(sb, "stringBuilder.append(prefix)");
        int size = this.f373806b.size();
        sb.append(size + " items");
        C69664n.m101060f(sb, "append(value)");
        sb.append(10);
        C69664n.m101060f(sb, "append('\\n')");
        Iterator a = C69734n.m101171a(new C69735o(new C137434j(this, (C69577g) null)).f186113a);
        while (a.hasNext()) {
            sb.append("  ");
            for (C69685i iVar2 : C69540x.m100843Y((List) a.next(), arrayList)) {
                String str = (String) iVar2.f186052a;
                int intValue = ((Number) iVar2.f186053b).intValue();
                C69664n.m101061g(str, "<this>");
                C69664n.m101061g(str, "<this>");
                if (intValue >= 0) {
                    if (intValue <= str.length()) {
                        charSequence = str.subSequence(0, str.length());
                    } else {
                        StringBuilder sb2 = new StringBuilder(intValue);
                        sb2.append(str);
                        C69502as a2 = new C69695c(1, intValue - str.length()).iterator();
                        while (a2.hasNext()) {
                            a2.mo5128a();
                            sb2.append(' ');
                        }
                        charSequence = sb2;
                    }
                    sb.append(charSequence.toString());
                    sb.append("  ");
                } else {
                    throw new IllegalArgumentException("Desired length " + intValue + " is less than zero.");
                }
            }
            sb.append(10);
            C69664n.m101060f(sb, "append('\\n')");
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C137435k)) {
            return false;
        }
        C137435k kVar = (C137435k) obj;
        return C69664n.m101066l(this.f373805a, kVar.f373805a) && C69664n.m101066l(this.f373806b, kVar.f373806b);
    }

    public final int hashCode() {
        return (this.f373805a.hashCode() * 31) + this.f373806b.hashCode();
    }

    public final String toString() {
        List list = this.f373805a;
        List list2 = this.f373806b;
        return "DumpTable(header=" + list + ", rows=" + list2 + ")";
    }
}
