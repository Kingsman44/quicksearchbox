package com.google.android.libraries.search.p2904c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.c.bs */
/* compiled from: PG */
public final class C37414bs extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C37414bs f99343c;

    /* renamed from: d */
    private static volatile C63010eb f99344d;

    /* renamed from: a */
    public int f99345a;

    /* renamed from: b */
    public int f99346b;

    static {
        C37414bs bsVar = new C37414bs();
        f99343c = bsVar;
        C62942bv.registerDefaultInstance(C37414bs.class, bsVar);
    }

    private C37414bs() {
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
                return newMessageInfo(f99343c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C37411bp.f99342a});
            case 3:
                return new C37414bs();
            case 4:
                return new C37413br();
            case 5:
                return f99343c;
            case 6:
                C63010eb ebVar = f99344d;
                if (ebVar == null) {
                    synchronized (C37414bs.class) {
                        ebVar = f99344d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f99343c);
                            f99344d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
