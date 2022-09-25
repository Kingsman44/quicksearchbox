package com.google.protos.youtube.elements;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.youtube.elements.bx */
/* compiled from: PG */
public final class C66145bx extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66145bx f179864d;

    /* renamed from: e */
    private static volatile C63010eb f179865e;

    /* renamed from: a */
    public int f179866a;

    /* renamed from: b */
    public float f179867b;

    /* renamed from: c */
    public int f179868c;

    static {
        C66145bx bxVar = new C66145bx();
        f179864d = bxVar;
        C62942bv.registerDefaultInstance(C66145bx.class, bxVar);
    }

    private C66145bx() {
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
                return newMessageInfo(f179864d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C66146by.f179869a});
            case 3:
                return new C66145bx();
            case 4:
                return new C66144bw();
            case 5:
                return f179864d;
            case 6:
                C63010eb ebVar = f179865e;
                if (ebVar == null) {
                    synchronized (C66145bx.class) {
                        ebVar = f179865e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179864d);
                            f179865e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
