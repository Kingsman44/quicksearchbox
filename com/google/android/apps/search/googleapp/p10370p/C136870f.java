package com.google.android.apps.search.googleapp.p10370p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.p.f */
/* compiled from: PG */
public final class C136870f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C136870f f372528b;

    /* renamed from: c */
    private static volatile C63010eb f372529c;

    /* renamed from: a */
    public C62995dn f372530a = C62995dn.f170057a;

    static {
        C136870f fVar = new C136870f();
        f372528b = fVar;
        C62942bv.registerDefaultInstance(C136870f.class, fVar);
    }

    private C136870f() {
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
                return newMessageInfo(f372528b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C136869e.f372527a});
            case 3:
                return new C136870f();
            case 4:
                return new C136868d();
            case 5:
                return f372528b;
            case 6:
                C63010eb ebVar = f372529c;
                if (ebVar == null) {
                    synchronized (C136870f.class) {
                        ebVar = f372529c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372528b);
                            f372529c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
