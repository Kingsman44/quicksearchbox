package com.google.android.apps.gsa.search.core.p6884y.p6889e.p6894e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.y.e.e.aa */
/* compiled from: PG */
public final class C87302aa extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C87302aa f235768c;

    /* renamed from: d */
    private static volatile C63010eb f235769d;

    /* renamed from: a */
    public int f235770a = 0;

    /* renamed from: b */
    public Object f235771b;

    static {
        C87302aa aaVar = new C87302aa();
        f235768c = aaVar;
        C62942bv.registerDefaultInstance(C87302aa.class, aaVar);
    }

    private C87302aa() {
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
                return newMessageInfo(f235768c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ဿ\u0000", new Object[]{"b", "a", C87304ac.class, C87343z.m141304b()});
            case 3:
                return new C87302aa();
            case 4:
                return new C87341x();
            case 5:
                return f235768c;
            case 6:
                C63010eb ebVar = f235769d;
                if (ebVar == null) {
                    synchronized (C87302aa.class) {
                        ebVar = f235769d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f235768c);
                            f235769d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
