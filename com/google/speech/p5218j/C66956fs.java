package com.google.speech.p5218j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.speech.j.fs */
/* compiled from: PG */
public final class C66956fs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66956fs f182003a;

    /* renamed from: e */
    private static volatile C63010eb f182004e;

    /* renamed from: b */
    private int f182005b;

    /* renamed from: c */
    private C66722az f182006c;

    /* renamed from: d */
    private byte f182007d = 2;

    static {
        C66956fs fsVar = new C66956fs();
        f182003a = fsVar;
        C62942bv.registerDefaultInstance(C66956fs.class, fsVar);
    }

    private C66956fs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182007d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182007d = b;
                return null;
            case 2:
                return newMessageInfo(f182003a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C66956fs();
            case 4:
                return new C66955fr();
            case 5:
                return f182003a;
            case 6:
                C63010eb ebVar = f182004e;
                if (ebVar == null) {
                    synchronized (C66956fs.class) {
                        ebVar = f182004e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182003a);
                            f182004e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
