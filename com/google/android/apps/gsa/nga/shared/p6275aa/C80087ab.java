package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5129p.p5131b.C65753ak;
import com.google.protos.p5129p.p5131b.C65768az;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ab */
/* compiled from: PG */
public final class C80087ab extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80087ab f219777e;

    /* renamed from: g */
    private static volatile C63010eb f219778g;

    /* renamed from: a */
    public int f219779a;

    /* renamed from: b */
    public int f219780b;

    /* renamed from: c */
    public C65768az f219781c;

    /* renamed from: d */
    public boolean f219782d;

    /* renamed from: f */
    private byte f219783f = 2;

    static {
        C80087ab abVar = new C80087ab();
        f219777e = abVar;
        C62942bv.registerDefaultInstance(C80087ab.class, abVar);
    }

    private C80087ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f219783f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f219783f = b;
                return null;
            case 2:
                return newMessageInfo(f219777e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C65753ak.m96798c(), C45240c.f118157a, "d"});
            case 3:
                return new C80087ab();
            case 4:
                return new C80086aa();
            case 5:
                return f219777e;
            case 6:
                C63010eb ebVar = f219778g;
                if (ebVar == null) {
                    synchronized (C80087ab.class) {
                        ebVar = f219778g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219777e);
                            f219778g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
