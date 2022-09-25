package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.l */
/* compiled from: PG */
public final class C81477l extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81477l f222898e;

    /* renamed from: f */
    private static volatile C63010eb f222899f;

    /* renamed from: a */
    public int f222900a;

    /* renamed from: b */
    public C81479n f222901b;

    /* renamed from: c */
    public int f222902c;

    /* renamed from: d */
    public int f222903d;

    static {
        C81477l lVar = new C81477l();
        f222898e = lVar;
        C62942bv.registerDefaultInstance(C81477l.class, lVar);
    }

    private C81477l() {
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
                return newMessageInfo(f222898e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002\t\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C81477l();
            case 4:
                return new C81476k();
            case 5:
                return f222898e;
            case 6:
                C63010eb ebVar = f222899f;
                if (ebVar == null) {
                    synchronized (C81477l.class) {
                        ebVar = f222899f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222898e);
                            f222899f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
