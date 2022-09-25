package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.yz */
/* compiled from: PG */
public final class C88365yz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88365yz f238961c;

    /* renamed from: d */
    private static volatile C63010eb f238962d;

    /* renamed from: a */
    public int f238963a;

    /* renamed from: b */
    public int f238964b;

    static {
        C88365yz yzVar = new C88365yz();
        f238961c = yzVar;
        C62942bv.registerDefaultInstance(C88365yz.class, yzVar);
    }

    private C88365yz() {
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
                return newMessageInfo(f238961c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88365yz();
            case 4:
                return new C88364yy();
            case 5:
                return f238961c;
            case 6:
                C63010eb ebVar = f238962d;
                if (ebVar == null) {
                    synchronized (C88365yz.class) {
                        ebVar = f238962d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238961c);
                            f238962d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
