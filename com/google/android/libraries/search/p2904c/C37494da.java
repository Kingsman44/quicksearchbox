package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.da */
/* compiled from: PG */
public final class C37494da extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37494da f99545c;

    /* renamed from: d */
    private static volatile C63010eb f99546d;

    /* renamed from: a */
    public int f99547a;

    /* renamed from: b */
    public int f99548b;

    static {
        C37494da daVar = new C37494da();
        f99545c = daVar;
        C62942bv.registerDefaultInstance(C37494da.class, daVar);
    }

    private C37494da() {
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
                return newMessageInfo(f99545c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဋ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C37494da();
            case 4:
                return new C37477cz();
            case 5:
                return f99545c;
            case 6:
                C63010eb ebVar = f99546d;
                if (ebVar == null) {
                    synchronized (C37494da.class) {
                        ebVar = f99546d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99545c);
                            f99546d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
