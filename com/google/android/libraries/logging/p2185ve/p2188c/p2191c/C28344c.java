package com.google.android.libraries.logging.p2185ve.p2188c.p2191c;

import com.google.common.p4552o.p4566l.C60200dk;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.logging.ve.c.c.c */
/* compiled from: PG */
public final class C28344c extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C28344c f77054c;

    /* renamed from: d */
    private static volatile C63010eb f77055d;

    /* renamed from: a */
    public int f77056a;

    /* renamed from: b */
    public int f77057b;

    static {
        C28344c cVar = new C28344c();
        f77054c = cVar;
        C62942bv.registerDefaultInstance(C28344c.class, cVar);
    }

    private C28344c() {
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
                return newMessageInfo(f77054c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C60200dk.m92543b()});
            case 3:
                return new C28344c();
            case 4:
                return new C28343b();
            case 5:
                return f77054c;
            case 6:
                C63010eb ebVar = f77055d;
                if (ebVar == null) {
                    synchronized (C28344c.class) {
                        ebVar = f77055d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f77054c);
                            f77055d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
