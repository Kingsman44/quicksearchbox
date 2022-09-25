package com.google.android.libraries.search.p3055n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.an */
/* compiled from: PG */
public final class C39264an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C39264an f103427d;

    /* renamed from: e */
    private static volatile C63010eb f103428e;

    /* renamed from: a */
    public int f103429a;

    /* renamed from: b */
    public C39262al f103430b;

    /* renamed from: c */
    public boolean f103431c;

    static {
        C39264an anVar = new C39264an();
        f103427d = anVar;
        C62942bv.registerDefaultInstance(C39264an.class, anVar);
    }

    private C39264an() {
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
                return newMessageInfo(f103427d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C39264an();
            case 4:
                return new C39263am();
            case 5:
                return f103427d;
            case 6:
                C63010eb ebVar = f103428e;
                if (ebVar == null) {
                    synchronized (C39264an.class) {
                        ebVar = f103428e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f103427d);
                            f103428e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
