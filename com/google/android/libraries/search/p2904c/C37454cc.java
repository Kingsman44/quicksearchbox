package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.cc */
/* compiled from: PG */
public final class C37454cc extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37454cc f99428c;

    /* renamed from: d */
    private static volatile C63010eb f99429d;

    /* renamed from: a */
    public int f99430a;

    /* renamed from: b */
    public int f99431b = -1;

    static {
        C37454cc ccVar = new C37454cc();
        f99428c = ccVar;
        C62942bv.registerDefaultInstance(C37454cc.class, ccVar);
    }

    private C37454cc() {
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
                return newMessageInfo(f99428c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37454cc();
            case 4:
                return new C37453cb();
            case 5:
                return f99428c;
            case 6:
                C63010eb ebVar = f99429d;
                if (ebVar == null) {
                    synchronized (C37454cc.class) {
                        ebVar = f99429d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99428c);
                            f99429d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
