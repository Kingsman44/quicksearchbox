package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fw */
/* compiled from: PG */
public final class C82934fw extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C82934fw f226257e;

    /* renamed from: f */
    private static volatile C63010eb f226258f;

    /* renamed from: a */
    public int f226259a;

    /* renamed from: b */
    public boolean f226260b;

    /* renamed from: c */
    public boolean f226261c;

    /* renamed from: d */
    public boolean f226262d;

    static {
        C82934fw fwVar = new C82934fw();
        f226257e = fwVar;
        C62942bv.registerDefaultInstance(C82934fw.class, fwVar);
    }

    private C82934fw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f226257e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C82934fw();
            case 4:
                return new C82933fv();
            case 5:
                return f226257e;
            case 6:
                C63010eb ebVar = f226258f;
                if (ebVar == null) {
                    synchronized (C82934fw.class) {
                        ebVar = f226258f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226257e);
                            f226258f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
