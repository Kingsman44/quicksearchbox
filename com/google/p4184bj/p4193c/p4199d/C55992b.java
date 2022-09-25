package com.google.p4184bj.p4193c.p4199d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.d.b */
/* compiled from: PG */
public final class C55992b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55992b f149102b;

    /* renamed from: d */
    private static volatile C63010eb f149103d;

    /* renamed from: a */
    public boolean f149104a;

    /* renamed from: c */
    private int f149105c;

    static {
        C55992b bVar = new C55992b();
        f149102b = bVar;
        C62942bv.registerDefaultInstance(C55992b.class, bVar);
    }

    private C55992b() {
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
                return newMessageInfo(f149102b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C55992b();
            case 4:
                return new C55991a();
            case 5:
                return f149102b;
            case 6:
                C63010eb ebVar = f149103d;
                if (ebVar == null) {
                    synchronized (C55992b.class) {
                        ebVar = f149103d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149102b);
                            f149103d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
