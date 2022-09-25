package com.google.android.libraries.p10923ac.p10925b.p10944k;

import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4552o.p4566l.C60192dc;
import java.util.EnumSet;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.ac.b.k.af */
/* compiled from: PG */
public abstract class C147131af {
    /* renamed from: f */
    public static C147130ae m239909f() {
        C58490gz gzVar = new C58490gz(4);
        Iterator it = EnumSet.complementOf(EnumSet.of(C60192dc.UNRECOGNIZED)).iterator();
        while (it.hasNext()) {
            gzVar.mo55429h((C60192dc) it.next(), 0L);
        }
        C147125a aVar = new C147125a();
        aVar.mo123948c(0);
        aVar.mo123950e(0);
        aVar.f397236a = gzVar.mo55427f(true);
        return aVar;
    }

    /* renamed from: g */
    public static boolean m239910g(C147131af afVar, C147131af afVar2) {
        return m239911h(afVar, afVar2) || m239912i(afVar, afVar2);
    }

    /* renamed from: h */
    public static boolean m239911h(C147131af afVar, C147131af afVar2) {
        return afVar.mo123951a() != afVar2.mo123951a();
    }

    /* renamed from: i */
    public static boolean m239912i(C147131af afVar, C147131af afVar2) {
        return afVar.mo123952b() != afVar2.mo123952b();
    }

    /* renamed from: a */
    public abstract long mo123951a();

    /* renamed from: b */
    public abstract long mo123952b();

    /* renamed from: c */
    public abstract C147130ae mo123953c();

    /* renamed from: d */
    public abstract C58495hd mo123954d();

    /* renamed from: e */
    public final long mo123955e(C60192dc dcVar) {
        return ((Long) mo123954d().get(dcVar)).longValue();
    }
}
