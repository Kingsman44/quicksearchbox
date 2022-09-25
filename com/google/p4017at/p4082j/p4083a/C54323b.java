package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.b */
/* compiled from: PG */
public final class C54323b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54323b f142699b;

    /* renamed from: d */
    private static volatile C63010eb f142700d;

    /* renamed from: a */
    public boolean f142701a;

    /* renamed from: c */
    private int f142702c;

    static {
        C54323b bVar = new C54323b();
        f142699b = bVar;
        C62942bv.registerDefaultInstance(C54323b.class, bVar);
    }

    private C54323b() {
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
                return newMessageInfo(f142699b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54323b();
            case 4:
                return new C54293a();
            case 5:
                return f142699b;
            case 6:
                C63010eb ebVar = f142700d;
                if (ebVar == null) {
                    synchronized (C54323b.class) {
                        ebVar = f142700d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142699b);
                            f142700d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
