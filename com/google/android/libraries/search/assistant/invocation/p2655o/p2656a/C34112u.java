package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.android.libraries.search.p2904c.C37407bl;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.u */
/* compiled from: PG */
public final class C34112u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C34112u f90852e;

    /* renamed from: g */
    private static volatile C63010eb f90853g;

    /* renamed from: a */
    public int f90854a;

    /* renamed from: b */
    public C37407bl f90855b;

    /* renamed from: c */
    public C37462ck f90856c;

    /* renamed from: d */
    public C37410bo f90857d;

    /* renamed from: f */
    private byte f90858f = 2;

    static {
        C34112u uVar = new C34112u();
        f90852e = uVar;
        C62942bv.registerDefaultInstance(C34112u.class, uVar);
    }

    private C34112u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f90858f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f90858f = b;
                return null;
            case 2:
                return newMessageInfo(f90852e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C34112u();
            case 4:
                return new C34111t();
            case 5:
                return f90852e;
            case 6:
                C63010eb ebVar = f90853g;
                if (ebVar == null) {
                    synchronized (C34112u.class) {
                        ebVar = f90853g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90852e);
                            f90853g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
