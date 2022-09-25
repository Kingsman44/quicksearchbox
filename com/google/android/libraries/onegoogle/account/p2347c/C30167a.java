package com.google.android.libraries.onegoogle.account.p2347c;

import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.common.base.C58837ba;

/* renamed from: com.google.android.libraries.onegoogle.account.c.a */
/* compiled from: PG */
public final class C30167a {
    /* renamed from: a */
    public static String m56043a(Object obj, C30158c cVar) {
        String g = C58837ba.m90858g(cVar.mo35555f(obj));
        String g2 = C58837ba.m90858g(cVar.mo35553d(obj));
        if (g.isEmpty() && g2.isEmpty()) {
            return cVar.mo35552c(obj);
        }
        if (g.isEmpty()) {
            return g2;
        }
        if (g2.isEmpty() || g.equals(g2)) {
            return g;
        }
        return g + " " + g2;
    }
}
