package com.google.android.apps.gsa.staticplugins.bubble.p7582f.p7583a.p7584a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.f.a.a.d */
/* compiled from: PG */
public final class C96981d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C96981d f271030c;

    /* renamed from: d */
    private static volatile C63010eb f271031d;

    /* renamed from: a */
    public int f271032a;

    /* renamed from: b */
    public C63088z f271033b = C63088z.f170246b;

    static {
        C96981d dVar = new C96981d();
        f271030c = dVar;
        C62942bv.registerDefaultInstance(C96981d.class, dVar);
    }

    private C96981d() {
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
                return newMessageInfo(f271030c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C96981d();
            case 4:
                return new C96980c();
            case 5:
                return f271030c;
            case 6:
                C63010eb ebVar = f271031d;
                if (ebVar == null) {
                    synchronized (C96981d.class) {
                        ebVar = f271031d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f271030c);
                            f271031d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
