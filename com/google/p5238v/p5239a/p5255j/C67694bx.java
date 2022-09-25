package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.bx */
/* compiled from: PG */
public final class C67694bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67694bx f183688d;

    /* renamed from: e */
    private static volatile C63010eb f183689e;

    /* renamed from: a */
    public int f183690a;

    /* renamed from: b */
    public C63088z f183691b = C63088z.f170246b;

    /* renamed from: c */
    public C67696bz f183692c;

    static {
        C67694bx bxVar = new C67694bx();
        f183688d = bxVar;
        C62942bv.registerDefaultInstance(C67694bx.class, bxVar);
    }

    private C67694bx() {
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
                return newMessageInfo(f183688d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\n\u0003\t", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67694bx();
            case 4:
                return new C67693bw();
            case 5:
                return f183688d;
            case 6:
                C63010eb ebVar = f183689e;
                if (ebVar == null) {
                    synchronized (C67694bx.class) {
                        ebVar = f183689e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183688d);
                            f183689e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
