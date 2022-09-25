package com.google.protos.p4850an.p4853b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.b.x */
/* compiled from: PG */
public final class C63380x extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63380x f171276d;

    /* renamed from: e */
    private static volatile C63010eb f171277e;

    /* renamed from: a */
    public int f171278a;

    /* renamed from: b */
    public double f171279b;

    /* renamed from: c */
    public int f171280c;

    static {
        C63380x xVar = new C63380x();
        f171276d = xVar;
        C62942bv.registerDefaultInstance(C63380x.class, xVar);
    }

    private C63380x() {
        emptyProtobufList();
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
                return newMessageInfo(f171276d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001က\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C63381y.f171281a});
            case 3:
                return new C63380x();
            case 4:
                return new C63379w();
            case 5:
                return f171276d;
            case 6:
                C63010eb ebVar = f171277e;
                if (ebVar == null) {
                    synchronized (C63380x.class) {
                        ebVar = f171277e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171276d);
                            f171277e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
