package com.google.common.p4552o.p4563i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.f */
/* compiled from: PG */
public final class C59956f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59956f f162040c;

    /* renamed from: d */
    private static volatile C63010eb f162041d;

    /* renamed from: a */
    public int f162042a;

    /* renamed from: b */
    public boolean f162043b;

    static {
        C59956f fVar = new C59956f();
        f162040c = fVar;
        C62942bv.registerDefaultInstance(C59956f.class, fVar);
    }

    private C59956f() {
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
                return newMessageInfo(f162040c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59956f();
            case 4:
                return new C59955e();
            case 5:
                return f162040c;
            case 6:
                C63010eb ebVar = f162041d;
                if (ebVar == null) {
                    synchronized (C59956f.class) {
                        ebVar = f162041d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162040c);
                            f162041d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
