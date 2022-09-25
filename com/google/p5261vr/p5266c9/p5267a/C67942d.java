package com.google.p5261vr.p5266c9.p5267a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.c9.a.d */
/* compiled from: PG */
public final class C67942d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67942d f184139a;

    /* renamed from: b */
    private static volatile C63010eb f184140b;

    static {
        C67942d dVar = new C67942d();
        f184139a = dVar;
        C62942bv.registerDefaultInstance(C67942d.class, dVar);
    }

    private C67942d() {
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
                return newMessageInfo(f184139a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C67942d();
            case 4:
                return new C67941c();
            case 5:
                return f184139a;
            case 6:
                C63010eb ebVar = f184140b;
                if (ebVar == null) {
                    synchronized (C67942d.class) {
                        ebVar = f184140b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184139a);
                            f184140b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
