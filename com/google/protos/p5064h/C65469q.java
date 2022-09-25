package com.google.protos.p5064h;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4605f.p4607b.C61080b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.h.q */
/* compiled from: PG */
public final class C65469q extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C65469q f177957a;

    /* renamed from: e */
    private static volatile C63010eb f177958e;

    /* renamed from: b */
    private int f177959b;

    /* renamed from: c */
    private C61080b f177960c;

    /* renamed from: d */
    private byte f177961d = 2;

    static {
        C65469q qVar = new C65469q();
        f177957a = qVar;
        C62942bv.registerDefaultInstance(C65469q.class, qVar);
    }

    private C65469q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f177961d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f177961d = b;
                return null;
            case 2:
                return newMessageInfo(f177957a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C65469q();
            case 4:
                return new C65468p();
            case 5:
                return f177957a;
            case 6:
                C63010eb ebVar = f177958e;
                if (ebVar == null) {
                    synchronized (C65469q.class) {
                        ebVar = f177958e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f177957a);
                            f177958e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
