package com.google.speech.p5208h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.ee */
/* compiled from: PG */
public final class C66665ee extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66665ee f181345d;

    /* renamed from: e */
    private static volatile C63010eb f181346e;

    /* renamed from: a */
    public int f181347a;

    /* renamed from: b */
    public float f181348b;

    /* renamed from: c */
    public float f181349c;

    static {
        C66665ee eeVar = new C66665ee();
        f181345d = eeVar;
        C62942bv.registerDefaultInstance(C66665ee.class, eeVar);
    }

    private C66665ee() {
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
                return newMessageInfo(f181345d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66665ee();
            case 4:
                return new C66664ed();
            case 5:
                return f181345d;
            case 6:
                C63010eb ebVar = f181346e;
                if (ebVar == null) {
                    synchronized (C66665ee.class) {
                        ebVar = f181346e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181345d);
                            f181346e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
