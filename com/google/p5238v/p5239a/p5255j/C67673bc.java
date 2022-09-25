package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.v.a.j.bc */
/* compiled from: PG */
public final class C67673bc extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67673bc f183643d;

    /* renamed from: e */
    private static volatile C63010eb f183644e;

    /* renamed from: a */
    public int f183645a;

    /* renamed from: b */
    public int f183646b;

    /* renamed from: c */
    public int f183647c;

    static {
        C67673bc bcVar = new C67673bc();
        f183643d = bcVar;
        C62942bv.registerDefaultInstance(C67673bc.class, bcVar);
    }

    private C67673bc() {
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
                return newMessageInfo(f183643d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003\f", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67673bc();
            case 4:
                return new C67672bb();
            case 5:
                return f183643d;
            case 6:
                C63010eb ebVar = f183644e;
                if (ebVar == null) {
                    synchronized (C67673bc.class) {
                        ebVar = f183644e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183643d);
                            f183644e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
