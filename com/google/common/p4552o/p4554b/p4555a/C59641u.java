package com.google.common.p4552o.p4554b.p4555a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.b.a.u */
/* compiled from: PG */
public final class C59641u extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C59641u f159905c;

    /* renamed from: d */
    private static volatile C63010eb f159906d;

    /* renamed from: a */
    public int f159907a;

    /* renamed from: b */
    public long f159908b;

    static {
        C59641u uVar = new C59641u();
        f159905c = uVar;
        C62942bv.registerDefaultInstance(C59641u.class, uVar);
    }

    private C59641u() {
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
                return newMessageInfo(f159905c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဃ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C59641u();
            case 4:
                return new C59640t();
            case 5:
                return f159905c;
            case 6:
                C63010eb ebVar = f159906d;
                if (ebVar == null) {
                    synchronized (C59641u.class) {
                        ebVar = f159906d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159905c);
                            f159906d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
