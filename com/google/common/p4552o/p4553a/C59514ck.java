package com.google.common.p4552o.p4553a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.ck */
/* compiled from: PG */
public final class C59514ck extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C59514ck f157909b;

    /* renamed from: d */
    private static volatile C63010eb f157910d;

    /* renamed from: a */
    public C62995dn f157911a = C62995dn.f170057a;

    /* renamed from: c */
    private byte f157912c = 2;

    static {
        C59514ck ckVar = new C59514ck();
        f157909b = ckVar;
        C62942bv.registerDefaultInstance(C59514ck.class, ckVar);
    }

    private C59514ck() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f157912c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f157912c = b;
                return null;
            case 2:
                return newMessageInfo(f157909b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"a", C59512ci.f157908a});
            case 3:
                return new C59514ck();
            case 4:
                return new C59513cj();
            case 5:
                return f157909b;
            case 6:
                C63010eb ebVar = f157910d;
                if (ebVar == null) {
                    synchronized (C59514ck.class) {
                        ebVar = f157910d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157909b);
                            f157910d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
