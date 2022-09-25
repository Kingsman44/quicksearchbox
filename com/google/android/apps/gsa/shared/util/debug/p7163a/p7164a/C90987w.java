package com.google.android.apps.gsa.shared.util.debug.p7163a.p7164a;

import com.google.common.p4552o.C59991io;
import java.util.Comparator;

/* renamed from: com.google.android.apps.gsa.shared.util.debug.a.a.w */
/* compiled from: PG */
public final /* synthetic */ class C90987w implements Comparator {

    /* renamed from: a */
    public static final /* synthetic */ C90987w f254189a = new C90987w();

    private /* synthetic */ C90987w() {
    }

    public final int compare(Object obj, Object obj2) {
        C59991io ioVar = (C59991io) obj;
        C59991io ioVar2 = (C59991io) obj2;
        long j = Long.MAX_VALUE;
        Long valueOf = Long.valueOf((ioVar.f162129a & 4) != 0 ? ioVar.f162132d : Long.MAX_VALUE);
        if ((ioVar2.f162129a & 4) != 0) {
            j = ioVar2.f162132d;
        }
        return valueOf.compareTo(Long.valueOf(j));
    }
}
