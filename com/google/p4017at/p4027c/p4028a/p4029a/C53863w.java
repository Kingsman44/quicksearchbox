package com.google.p4017at.p4027c.p4028a.p4029a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.c.a.a.w */
/* compiled from: PG */
public final class C53863w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53863w f141353a;

    /* renamed from: b */
    private static volatile C63010eb f141354b;

    static {
        C53863w wVar = new C53863w();
        f141353a = wVar;
        C62942bv.registerDefaultInstance(C53863w.class, wVar);
    }

    private C53863w() {
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
                return newMessageInfo(f141353a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C53863w();
            case 4:
                return new C53862v();
            case 5:
                return f141353a;
            case 6:
                C63010eb ebVar = f141354b;
                if (ebVar == null) {
                    synchronized (C53863w.class) {
                        ebVar = f141354b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141353a);
                            f141354b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
