package com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a;

import com.google.p4271bq.C56423b;
import com.google.p4271bq.C56425d;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.ce.a.b.b.a.a.a */
/* compiled from: PG */
public final class C58055a {

    /* renamed from: a */
    public final LinkedHashSet f155195a = new LinkedHashSet();

    /* renamed from: a */
    public final boolean mo54637a(String str) {
        Iterator it = this.f155195a.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C56425d) it.next()).f150543e.iterator();
            while (true) {
                if (it2.hasNext()) {
                    if (((C56423b) it2.next()).f150534a.equals(str)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
