package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.speech.j.hy */
/* compiled from: PG */
public final class C67016hy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67016hy f182169c;

    /* renamed from: e */
    private static volatile C63010eb f182170e;

    /* renamed from: a */
    public int f182171a;

    /* renamed from: b */
    public C66722az f182172b;

    /* renamed from: d */
    private byte f182173d = 2;

    static {
        C67016hy hyVar = new C67016hy();
        f182169c = hyVar;
        C62942bv.registerDefaultInstance(C67016hy.class, hyVar);
    }

    private C67016hy() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182173d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182173d = b;
                return null;
            case 2:
                return newMessageInfo(f182169c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67016hy();
            case 4:
                return new C67015hx();
            case 5:
                return f182169c;
            case 6:
                C63010eb ebVar = f182170e;
                if (ebVar == null) {
                    synchronized (C67016hy.class) {
                        ebVar = f182170e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182169c);
                            f182170e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
