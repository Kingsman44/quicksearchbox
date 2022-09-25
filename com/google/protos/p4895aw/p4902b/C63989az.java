package com.google.protos.p4895aw.p4902b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.protos.aw.b.az */
/* compiled from: PG */
public final class C63989az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63989az f173052d;

    /* renamed from: e */
    private static volatile C63010eb f173053e;

    /* renamed from: a */
    public int f173054a;

    /* renamed from: b */
    public long f173055b = -1;

    /* renamed from: c */
    public C63088z f173056c = C63088z.f170246b;

    static {
        C63989az azVar = new C63989az();
        f173052d = azVar;
        C62942bv.registerDefaultInstance(C63989az.class, azVar);
    }

    private C63989az() {
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
                return newMessageInfo(f173052d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ည\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C63989az();
            case 4:
                return new C63988ay();
            case 5:
                return f173052d;
            case 6:
                C63010eb ebVar = f173053e;
                if (ebVar == null) {
                    synchronized (C63989az.class) {
                        ebVar = f173053e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173052d);
                            f173053e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
