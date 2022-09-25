package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.e.u */
/* compiled from: PG */
public final class C39516u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39516u f104048d;

    /* renamed from: e */
    private static volatile C63010eb f104049e;

    /* renamed from: a */
    public int f104050a;

    /* renamed from: b */
    public boolean f104051b;

    /* renamed from: c */
    public boolean f104052c;

    static {
        C39516u uVar = new C39516u();
        f104048d = uVar;
        C62942bv.registerDefaultInstance(C39516u.class, uVar);
    }

    private C39516u() {
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
                return newMessageInfo(f104048d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39516u();
            case 4:
                return new C39515t();
            case 5:
                return f104048d;
            case 6:
                C63010eb ebVar = f104049e;
                if (ebVar == null) {
                    synchronized (C39516u.class) {
                        ebVar = f104049e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104048d);
                            f104049e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
