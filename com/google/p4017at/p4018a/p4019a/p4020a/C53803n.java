package com.google.p4017at.p4018a.p4019a.p4020a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.at.a.a.a.n */
/* compiled from: PG */
public final class C53803n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53803n f141217c;

    /* renamed from: d */
    private static volatile C63010eb f141218d;

    /* renamed from: a */
    public int f141219a;

    /* renamed from: b */
    public C63088z f141220b = C63088z.f170246b;

    static {
        C53803n nVar = new C53803n();
        f141217c = nVar;
        C62942bv.registerDefaultInstance(C53803n.class, nVar);
    }

    private C53803n() {
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
                return newMessageInfo(f141217c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C53803n();
            case 4:
                return new C53802m();
            case 5:
                return f141217c;
            case 6:
                C63010eb ebVar = f141218d;
                if (ebVar == null) {
                    synchronized (C53803n.class) {
                        ebVar = f141218d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141217c);
                            f141218d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
