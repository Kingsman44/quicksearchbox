package com.google.android.libraries.search.assistant.p2828y.p2862s.p2863a.p2865b;

import com.google.assistant.p3897e.p3921j.C52623yp;
import com.google.assistant.p3897e.p3921j.C52629yv;
import com.google.assistant.p3897e.p3921j.adm;
import java.util.LinkedHashSet;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.s.a.b.d */
/* compiled from: PG */
public final class C37100d {

    /* renamed from: a */
    public final adm f96634a;

    /* renamed from: b */
    public final boolean f96635b;

    /* renamed from: c */
    public final Set f96636c;

    public C37100d(adm adm, boolean z) {
        C69664n.m101061g(adm, "personalContactData");
        this.f96634a = adm;
        this.f96635b = z;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        C52623yp ypVar = adm.f134892b;
        for (C52629yv yvVar : (ypVar == null ? C52623yp.f138162g : ypVar).f138169f) {
            String str = yvVar.f138184c;
            C69664n.m101060f(str, "phone.value");
            linkedHashSet.add(str);
            String str2 = yvVar.f138186e;
            if (!(str2 == null || str2.length() == 0)) {
                String str3 = yvVar.f138186e;
                C69664n.m101060f(str3, "phone.canonicalizedForm");
                linkedHashSet.add(str3);
            }
        }
        this.f96636c = linkedHashSet;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37100d)) {
            return false;
        }
        C37100d dVar = (C37100d) obj;
        return C69664n.m101066l(this.f96634a, dVar.f96634a) && this.f96635b == dVar.f96635b;
    }

    public final int hashCode() {
        return (this.f96634a.hashCode() * 31) + (this.f96635b ? 1 : 0);
    }

    public final String toString() {
        adm adm = this.f96634a;
        boolean z = this.f96635b;
        return "Contact(personalContactData=" + adm + ", isStarred=" + z + ")";
    }
}
