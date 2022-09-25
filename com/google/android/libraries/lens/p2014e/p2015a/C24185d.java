package com.google.android.libraries.lens.p2014e.p2015a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.e.a.d */
/* compiled from: PG */
public final class C24185d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C24185d f66110b;

    /* renamed from: c */
    private static volatile C63010eb f66111c;

    /* renamed from: a */
    public C24195n f66112a;

    static {
        C24185d dVar = new C24185d();
        f66110b = dVar;
        C62942bv.registerDefaultInstance(C24185d.class, dVar);
    }

    private C24185d() {
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
                return newMessageInfo(f66110b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C24185d();
            case 4:
                return new C24184c();
            case 5:
                return f66110b;
            case 6:
                C63010eb ebVar = f66111c;
                if (ebVar == null) {
                    synchronized (C24185d.class) {
                        ebVar = f66111c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f66110b);
                            f66111c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
