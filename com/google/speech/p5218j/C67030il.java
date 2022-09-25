package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.il */
/* compiled from: PG */
public final class C67030il extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67030il f182195e;

    /* renamed from: f */
    private static volatile C63010eb f182196f;

    /* renamed from: a */
    public int f182197a;

    /* renamed from: b */
    public float f182198b;

    /* renamed from: c */
    public float f182199c;

    /* renamed from: d */
    public int f182200d;

    static {
        C67030il ilVar = new C67030il();
        f182195e = ilVar;
        C62942bv.registerDefaultInstance(C67030il.class, ilVar);
    }

    private C67030il() {
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
                return newMessageInfo(f182195e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C67028ij.f182194a});
            case 3:
                return new C67030il();
            case 4:
                return new C67027ii();
            case 5:
                return f182195e;
            case 6:
                C63010eb ebVar = f182196f;
                if (ebVar == null) {
                    synchronized (C67030il.class) {
                        ebVar = f182196f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182195e);
                            f182196f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
