package com.google.protos.p4892au;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.au.t */
/* compiled from: PG */
public final class C63842t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63842t f172638a;

    /* renamed from: e */
    private static volatile C63010eb f172639e;

    /* renamed from: b */
    private int f172640b;

    /* renamed from: c */
    private C60220t f172641c;

    /* renamed from: d */
    private byte f172642d = 2;

    static {
        C63842t tVar = new C63842t();
        f172638a = tVar;
        C62942bv.registerDefaultInstance(C63842t.class, tVar);
    }

    private C63842t() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172642d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172642d = b;
                return null;
            case 2:
                return newMessageInfo(f172638a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63842t();
            case 4:
                return new C63841s();
            case 5:
                return f172638a;
            case 6:
                C63010eb ebVar = f172639e;
                if (ebVar == null) {
                    synchronized (C63842t.class) {
                        ebVar = f172639e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172638a);
                            f172639e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
