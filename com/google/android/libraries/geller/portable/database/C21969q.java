package com.google.android.libraries.geller.portable.database;

import com.google.common.p4522b.C58528ij;
import com.google.protos.p5129p.p5131b.C65780bk;
import java.util.Comparator;

/* renamed from: com.google.android.libraries.geller.portable.database.q */
/* compiled from: PG */
public final /* synthetic */ class C21969q implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C21969q f60596a = new C21969q();

    private /* synthetic */ C21969q() {
    }

    public final int compare(Object obj, Object obj2) {
        C58528ij ijVar = C21977y.f60610a;
        long j = ((C65780bk) obj2).f178826f;
        long j2 = ((C65780bk) obj).f178826f;
        if (j == j2) {
            return 0;
        }
        return j - j2 <= 0 ? -1 : 1;
    }
}
