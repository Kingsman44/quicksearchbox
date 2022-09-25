package com.google.protos.p4752a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.a.g */
/* compiled from: PG */
public final class C63095g extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63095g f170257d;

    /* renamed from: e */
    private static volatile C63010eb f170258e;

    /* renamed from: a */
    public int f170259a;

    /* renamed from: b */
    public int f170260b;

    /* renamed from: c */
    public C63093e f170261c;

    static {
        C63095g gVar = new C63095g();
        f170257d = gVar;
        C62942bv.registerDefaultInstance(C63095g.class, gVar);
    }

    private C63095g() {
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
                return newMessageInfo(f170257d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C63091c.f170252a, C45240c.f118157a});
            case 3:
                return new C63095g();
            case 4:
                return new C63094f();
            case 5:
                return f170257d;
            case 6:
                C63010eb ebVar = f170258e;
                if (ebVar == null) {
                    synchronized (C63095g.class) {
                        ebVar = f170258e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170257d);
                            f170258e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
