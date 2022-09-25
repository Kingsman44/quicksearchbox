package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.ih */
/* compiled from: PG */
public final class C67026ih extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C67026ih f182188e;

    /* renamed from: f */
    private static volatile C63010eb f182189f;

    /* renamed from: a */
    public int f182190a;

    /* renamed from: b */
    public float f182191b;

    /* renamed from: c */
    public float f182192c;

    /* renamed from: d */
    public long f182193d;

    static {
        C67026ih ihVar = new C67026ih();
        f182188e = ihVar;
        C62942bv.registerDefaultInstance(C67026ih.class, ihVar);
    }

    private C67026ih() {
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
                return newMessageInfo(f182188e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ခ\u0000\u0002ခ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C67026ih();
            case 4:
                return new C67025ig();
            case 5:
                return f182188e;
            case 6:
                C63010eb ebVar = f182189f;
                if (ebVar == null) {
                    synchronized (C67026ih.class) {
                        ebVar = f182189f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182188e);
                            f182189f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
