package com.google.android.apps.gsa.sidekick.shared.monet.p7251g;

import com.google.p375ai.p378b.C8074uo;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.monet.g.g */
/* compiled from: PG */
public final class C91839g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C91839g f256120c;

    /* renamed from: d */
    private static volatile C63010eb f256121d;

    /* renamed from: a */
    public int f256122a;

    /* renamed from: b */
    public int f256123b = 1;

    static {
        C91839g gVar = new C91839g();
        f256120c = gVar;
        C62942bv.registerDefaultInstance(C91839g.class, gVar);
    }

    private C91839g() {
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
                return newMessageInfo(f256120c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C8074uo.m22932b()});
            case 3:
                return new C91839g();
            case 4:
                return new C91838f();
            case 5:
                return f256120c;
            case 6:
                C63010eb ebVar = f256121d;
                if (ebVar == null) {
                    synchronized (C91839g.class) {
                        ebVar = f256121d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f256120c);
                            f256121d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
