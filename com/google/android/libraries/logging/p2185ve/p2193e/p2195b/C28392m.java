package com.google.android.libraries.logging.p2185ve.p2193e.p2195b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.e.b.m */
/* compiled from: PG */
public final class C28392m extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28392m f77141c;

    /* renamed from: d */
    private static volatile C63010eb f77142d;

    /* renamed from: a */
    public int f77143a;

    /* renamed from: b */
    public int f77144b;

    static {
        C28392m mVar = new C28392m();
        f77141c = mVar;
        C62942bv.registerDefaultInstance(C28392m.class, mVar);
    }

    private C28392m() {
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
                return newMessageInfo(f77141c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C28392m();
            case 4:
                return new C28391l();
            case 5:
                return f77141c;
            case 6:
                C63010eb ebVar = f77142d;
                if (ebVar == null) {
                    synchronized (C28392m.class) {
                        ebVar = f77142d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77141c);
                            f77142d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
