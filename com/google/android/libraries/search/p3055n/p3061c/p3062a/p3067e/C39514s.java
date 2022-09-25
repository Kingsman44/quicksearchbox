package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3067e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.e.s */
/* compiled from: PG */
public final class C39514s extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39514s f104043d;

    /* renamed from: e */
    private static volatile C63010eb f104044e;

    /* renamed from: a */
    public int f104045a;

    /* renamed from: b */
    public boolean f104046b;

    /* renamed from: c */
    public C39513r f104047c;

    static {
        C39514s sVar = new C39514s();
        f104043d = sVar;
        C62942bv.registerDefaultInstance(C39514s.class, sVar);
    }

    private C39514s() {
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
                return newMessageInfo(f104043d, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39514s();
            case 4:
                return new C39510o();
            case 5:
                return f104043d;
            case 6:
                C63010eb ebVar = f104044e;
                if (ebVar == null) {
                    synchronized (C39514s.class) {
                        ebVar = f104044e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104043d);
                            f104044e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
