package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.g */
/* compiled from: PG */
public final class C24188g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C24188g f66113c;

    /* renamed from: d */
    private static volatile C63010eb f66114d;

    /* renamed from: a */
    public float f66115a;

    /* renamed from: b */
    public float f66116b;

    static {
        C24188g gVar = new C24188g();
        f66113c = gVar;
        C62942bv.registerDefaultInstance(C24188g.class, gVar);
    }

    private C24188g() {
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
                return newMessageInfo(f66113c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0001\u0002\u0001", new Object[]{"a", "b"});
            case 3:
                return new C24188g();
            case 4:
                return new C24187f();
            case 5:
                return f66113c;
            case 6:
                C63010eb ebVar = f66114d;
                if (ebVar == null) {
                    synchronized (C24188g.class) {
                        ebVar = f66114d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66113c);
                            f66114d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
