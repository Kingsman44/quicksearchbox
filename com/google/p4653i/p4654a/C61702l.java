package com.google.p4653i.p4654a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.l */
/* compiled from: PG */
public final class C61702l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61702l f166694a;

    /* renamed from: e */
    private static volatile C63010eb f166695e;

    /* renamed from: b */
    private int f166696b;

    /* renamed from: c */
    private C61710t f166697c;

    /* renamed from: d */
    private byte f166698d = 2;

    static {
        C61702l lVar = new C61702l();
        f166694a = lVar;
        C62942bv.registerDefaultInstance(C61702l.class, lVar);
    }

    private C61702l() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166698d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166698d = b;
                return null;
            case 2:
                return newMessageInfo(f166694a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C61702l();
            case 4:
                return new C61701k();
            case 5:
                return f166694a;
            case 6:
                C63010eb ebVar = f166695e;
                if (ebVar == null) {
                    synchronized (C61702l.class) {
                        ebVar = f166695e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166694a);
                            f166695e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
