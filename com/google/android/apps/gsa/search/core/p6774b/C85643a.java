package com.google.android.apps.gsa.search.core.p6774b;

import com.google.p4500cm.p4518d.C58177a;
import com.google.p4500cm.p4518d.C58186c;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.search.core.b.a */
/* compiled from: PG */
public final /* synthetic */ class C85643a implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C85643a f231482a = new C85643a();

    private /* synthetic */ C85643a() {
    }

    public final int compare(Object obj, Object obj2) {
        long j = ((C58186c) ((C58177a) obj).instance).f155570d;
        long j2 = ((C58186c) ((C58177a) obj2).instance).f155570d;
        if (j < j2) {
            return -1;
        }
        return j != j2 ? 1 : 0;
    }
}
