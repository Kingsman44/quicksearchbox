package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.zm */
/* compiled from: PG */
public final class C88379zm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88379zm f238986c;

    /* renamed from: d */
    private static volatile C63010eb f238987d;

    /* renamed from: a */
    public int f238988a;

    /* renamed from: b */
    public double f238989b;

    static {
        C88379zm zmVar = new C88379zm();
        f238986c = zmVar;
        C62942bv.registerDefaultInstance(C88379zm.class, zmVar);
    }

    private C88379zm() {
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
                return newMessageInfo(f238986c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001က\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88379zm();
            case 4:
                return new C88378zl();
            case 5:
                return f238986c;
            case 6:
                C63010eb ebVar = f238987d;
                if (ebVar == null) {
                    synchronized (C88379zm.class) {
                        ebVar = f238987d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238986c);
                            f238987d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
