package com.google.p4486ci.p4487a;

import com.google.common.base.C58826aq;
import com.google.common.base.C58827ar;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.ci.a.e */
/* compiled from: PG */
public final class C58100e {

    /* renamed from: a */
    private final Map f155301a = new HashMap();

    /* renamed from: a */
    public final String mo54650a(String str) {
        if (!this.f155301a.containsKey(str.toLowerCase(Locale.US))) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (String str2 : (List) this.f155301a.get(str.toLowerCase(Locale.US))) {
            if (str2 != null) {
                if (!z) {
                    sb.append(",");
                }
                sb.append(str2);
                z = false;
            }
        }
        return sb.toString();
    }

    /* renamed from: b */
    public final List mo54651b(String str) {
        List list = (List) this.f155301a.get(str.toLowerCase(Locale.US));
        return list == null ? C58485gu.m89845m() : list;
    }

    /* renamed from: c */
    public final Set mo54652c() {
        return Collections.unmodifiableSet(this.f155301a.keySet());
    }

    /* renamed from: d */
    public final void mo54653d(String str, String str2) {
        C58838bb.m90868c(!str.isEmpty());
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        if (!this.f155301a.containsKey(lowerCase)) {
            this.f155301a.put(lowerCase, new ArrayList());
        }
        ((List) this.f155301a.get(lowerCase)).add(str2);
    }

    /* renamed from: e */
    public final void mo54654e(String str, String str2) {
        boolean z = false;
        if (str != null && !str.isEmpty()) {
            z = true;
        }
        C58838bb.m90868c(z);
        str2.getClass();
        String lowerCase = str.toLowerCase(Locale.US);
        this.f155301a.put(lowerCase, new ArrayList());
        ((List) this.f155301a.get(lowerCase)).add(str2);
    }

    public final String toString() {
        ArrayList arrayList = new ArrayList(this.f155301a.entrySet());
        Collections.sort(arrayList, C58099d.f155300a);
        StringBuilder sb = new StringBuilder("{");
        new C58826aq(new C58827ar(", "), "=").mo56096b(sb, arrayList.iterator());
        sb.append('}');
        return sb.toString();
    }
}
