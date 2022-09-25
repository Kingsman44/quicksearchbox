package com.google.android.apps.p489g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.b */
/* compiled from: PG */
public final class C9122b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9122b f31402e;

    /* renamed from: f */
    private static volatile C63010eb f31403f;

    /* renamed from: a */
    public int f31404a;

    /* renamed from: b */
    public boolean f31405b;

    /* renamed from: c */
    public boolean f31406c;

    /* renamed from: d */
    public boolean f31407d;

    static {
        C9122b bVar = new C9122b();
        f31402e = bVar;
        C62942bv.registerDefaultInstance(C9122b.class, bVar);
    }

    private C9122b() {
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
                return newMessageInfo(f31402e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9122b();
            case 4:
                return new C9115a();
            case 5:
                return f31402e;
            case 6:
                C63010eb ebVar = f31403f;
                if (ebVar == null) {
                    synchronized (C9122b.class) {
                        ebVar = f31403f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31402e);
                            f31403f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
