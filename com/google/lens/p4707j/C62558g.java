package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.g */
/* compiled from: PG */
public final class C62558g extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62558g f168894e;

    /* renamed from: f */
    private static volatile C63010eb f168895f;

    /* renamed from: a */
    public int f168896a;

    /* renamed from: b */
    public C62531f f168897b;

    /* renamed from: c */
    public double f168898c;

    /* renamed from: d */
    public double f168899d;

    static {
        C62558g gVar = new C62558g();
        f168894e = gVar;
        C62942bv.registerDefaultInstance(C62558g.class, gVar);
    }

    private C62558g() {
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
                return newMessageInfo(f168894e, "\u0001\u0003\u0000\u0001\u0007\t\u0003\u0000\u0000\u0000\u0007ဉ\u0000\bက\u0001\tက\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C62558g();
            case 4:
                return new C62477d();
            case 5:
                return f168894e;
            case 6:
                C63010eb ebVar = f168895f;
                if (ebVar == null) {
                    synchronized (C62558g.class) {
                        ebVar = f168895f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168894e);
                            f168895f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
