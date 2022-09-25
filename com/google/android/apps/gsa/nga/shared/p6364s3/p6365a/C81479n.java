package com.google.android.apps.gsa.nga.shared.p6364s3.p6365a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.nga.shared.s3.a.n */
/* compiled from: PG */
public final class C81479n extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C81479n f222904e;

    /* renamed from: f */
    private static volatile C63010eb f222905f;

    /* renamed from: a */
    public C63088z f222906a = C63088z.f170246b;

    /* renamed from: b */
    public int f222907b;

    /* renamed from: c */
    public int f222908c;

    /* renamed from: d */
    public int f222909d;

    static {
        C81479n nVar = new C81479n();
        f222904e = nVar;
        C62942bv.registerDefaultInstance(C81479n.class, nVar);
    }

    private C81479n() {
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
                return newMessageInfo(f222904e, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0002\u0004\u0003\u0004\u0004\u0004", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C81479n();
            case 4:
                return new C81478m();
            case 5:
                return f222904e;
            case 6:
                C63010eb ebVar = f222905f;
                if (ebVar == null) {
                    synchronized (C81479n.class) {
                        ebVar = f222905f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222904e);
                            f222905f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
