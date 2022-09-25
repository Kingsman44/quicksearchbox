package com.google.android.p10712d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.dd */
/* compiled from: PG */
public final class C142379dd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142379dd f386345b;

    /* renamed from: d */
    private static volatile C63010eb f386346d;

    /* renamed from: a */
    public boolean f386347a;

    /* renamed from: c */
    private int f386348c;

    static {
        C142379dd ddVar = new C142379dd();
        f386345b = ddVar;
        C62942bv.registerDefaultInstance(C142379dd.class, ddVar);
    }

    private C142379dd() {
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
                return newMessageInfo(f386345b, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C142379dd();
            case 4:
                return new C142378dc();
            case 5:
                return f386345b;
            case 6:
                C63010eb ebVar = f386346d;
                if (ebVar == null) {
                    synchronized (C142379dd.class) {
                        ebVar = f386346d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386345b);
                            f386346d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
