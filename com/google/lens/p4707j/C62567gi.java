package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62960cg;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.gi */
/* compiled from: PG */
public final class C62567gi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62567gi f168918c;

    /* renamed from: d */
    private static volatile C63010eb f168919d;

    /* renamed from: a */
    public C62960cg f168920a = emptyFloatList();

    /* renamed from: b */
    public C62960cg f168921b = emptyFloatList();

    static {
        C62567gi giVar = new C62567gi();
        f168918c = giVar;
        C62942bv.registerDefaultInstance(C62567gi.class, giVar);
    }

    private C62567gi() {
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
                return newMessageInfo(f168918c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u0013\u0002\u0013", new Object[]{"a", "b"});
            case 3:
                return new C62567gi();
            case 4:
                return new C62566gh();
            case 5:
                return f168918c;
            case 6:
                C63010eb ebVar = f168919d;
                if (ebVar == null) {
                    synchronized (C62567gi.class) {
                        ebVar = f168919d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168918c);
                            f168919d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
