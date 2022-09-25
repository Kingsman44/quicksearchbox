package com.google.android.libraries.p590as.p593b.p596b.p604g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.b.b.g.d */
/* compiled from: PG */
public final class C10876d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C10876d f35953b;

    /* renamed from: d */
    private static volatile C63010eb f35954d;

    /* renamed from: a */
    public int f35955a;

    /* renamed from: c */
    private int f35956c;

    static {
        C10876d dVar = new C10876d();
        f35953b = dVar;
        C62942bv.registerDefaultInstance(C10876d.class, dVar);
    }

    private C10876d() {
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
                return newMessageInfo(f35953b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C10874b.m25894b()});
            case 3:
                return new C10876d();
            case 4:
                return new C10875c();
            case 5:
                return f35953b;
            case 6:
                C63010eb ebVar = f35954d;
                if (ebVar == null) {
                    synchronized (C10876d.class) {
                        ebVar = f35954d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35953b);
                            f35954d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
