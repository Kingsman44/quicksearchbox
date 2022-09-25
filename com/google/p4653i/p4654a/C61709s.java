package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.s */
/* compiled from: PG */
public final class C61709s extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C61709s f166701e;

    /* renamed from: g */
    private static volatile C63010eb f166702g;

    /* renamed from: a */
    public int f166703a;

    /* renamed from: b */
    public int f166704b;

    /* renamed from: c */
    public int f166705c;

    /* renamed from: d */
    public int f166706d;

    /* renamed from: f */
    private byte f166707f = 2;

    static {
        C61709s sVar = new C61709s();
        f166701e = sVar;
        C62942bv.registerDefaultInstance(C61709s.class, sVar);
    }

    private C61709s() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166707f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166707f = b;
                return null;
            case 2:
                return newMessageInfo(f166701e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔄ\u0000\u0002ᔄ\u0001\u0003ᔄ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C61709s();
            case 4:
                return new C61708r();
            case 5:
                return f166701e;
            case 6:
                C63010eb ebVar = f166702g;
                if (ebVar == null) {
                    synchronized (C61709s.class) {
                        ebVar = f166702g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166701e);
                            f166702g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
