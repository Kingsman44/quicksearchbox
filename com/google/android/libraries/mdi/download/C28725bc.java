package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.bc */
/* compiled from: PG */
public final class C28725bc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C28725bc f78034d;

    /* renamed from: e */
    private static volatile C63010eb f78035e;

    /* renamed from: a */
    public int f78036a;

    /* renamed from: b */
    public C28724bb f78037b;

    /* renamed from: c */
    public C28708an f78038c;

    static {
        C28725bc bcVar = new C28725bc();
        f78034d = bcVar;
        C62942bv.registerDefaultInstance(C28725bc.class, bcVar);
    }

    private C28725bc() {
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
                return newMessageInfo(f78034d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C28725bc();
            case 4:
                return new C28718ax();
            case 5:
                return f78034d;
            case 6:
                C63010eb ebVar = f78035e;
                if (ebVar == null) {
                    synchronized (C28725bc.class) {
                        ebVar = f78035e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f78034d);
                            f78035e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
