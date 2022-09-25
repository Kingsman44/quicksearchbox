package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.hz */
/* compiled from: PG */
public final class C67017hz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67017hz f182174c;

    /* renamed from: e */
    private static volatile C63010eb f182175e;

    /* renamed from: a */
    public int f182176a = 0;

    /* renamed from: b */
    public Object f182177b;

    /* renamed from: d */
    private byte f182178d = 2;

    static {
        C67017hz hzVar = new C67017hz();
        f182174c = hzVar;
        C62942bv.registerDefaultInstance(C67017hz.class, hzVar);
    }

    private C67017hz() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f182178d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f182178d = b;
                return null;
            case 2:
                return newMessageInfo(f182174c, "\u0001\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ᐼ\u0000\u0004ြ\u0000", new Object[]{"b", "a", C67014hw.class, C67009hr.class, C67016hy.class, C67012hu.class});
            case 3:
                return new C67017hz();
            case 4:
                return new C67010hs();
            case 5:
                return f182174c;
            case 6:
                C63010eb ebVar = f182175e;
                if (ebVar == null) {
                    synchronized (C67017hz.class) {
                        ebVar = f182175e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182174c);
                            f182175e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
