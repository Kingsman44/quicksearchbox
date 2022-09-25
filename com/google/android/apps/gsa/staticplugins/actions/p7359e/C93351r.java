package com.google.android.apps.gsa.staticplugins.actions.p7359e;

import com.google.android.apps.gsa.search.shared.actions.util.C87480b;
import com.google.p4152bb.p4153a.C55364pq;
import com.google.p4152bb.p4153a.C55365pr;

/* renamed from: com.google.android.apps.gsa.staticplugins.actions.e.r */
/* compiled from: PG */
public final class C93351r {
    /* renamed from: a */
    public static boolean m153572a(C55365pr prVar, boolean z, C87480b bVar) {
        int a = C55364pq.m87677a(prVar.f145882e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            if (z) {
                bVar.mo81465g();
            }
            return true;
        } else if (i != 2) {
            return false;
        } else {
            bVar.mo81463e();
            return true;
        }
    }
}
