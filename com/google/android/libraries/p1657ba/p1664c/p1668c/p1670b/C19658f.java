package com.google.android.libraries.p1657ba.p1664c.p1668c.p1670b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.ba.c.c.b.f */
/* compiled from: PG */
public final class C19658f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C19658f f54678b;

    /* renamed from: c */
    private static volatile C63010eb f54679c;

    /* renamed from: a */
    public C62971cq f54680a = emptyProtobufList();

    static {
        C19658f fVar = new C19658f();
        f54678b = fVar;
        C62942bv.registerDefaultInstance(C19658f.class, fVar);
    }

    private C19658f() {
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
                return newMessageInfo(f54678b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C19656d.class});
            case 3:
                return new C19658f();
            case 4:
                return new C19657e();
            case 5:
                return f54678b;
            case 6:
                C63010eb ebVar = f54679c;
                if (ebVar == null) {
                    synchronized (C19658f.class) {
                        ebVar = f54679c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54678b);
                            f54679c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
