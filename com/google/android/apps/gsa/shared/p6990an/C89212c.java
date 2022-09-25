package com.google.android.apps.gsa.shared.p6990an;

import com.google.p395al.p417d.p418a.C8541au;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.an.c */
/* compiled from: PG */
public final class C89212c {

    /* renamed from: a */
    public static final Comparator f241840a = C89195a.f241818a;

    /* renamed from: a */
    public static boolean m145117a(List list, long j) {
        if (list.isEmpty()) {
            return true;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (m145118b((C8541au) it.next(), j)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m145118b(C8541au auVar, long j) {
        return auVar.f29633a <= j && j <= auVar.f29634b;
    }
}
