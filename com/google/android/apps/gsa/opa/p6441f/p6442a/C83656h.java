package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.h */
/* compiled from: PG */
public final class C83656h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C83656h f228036a;

    /* renamed from: b */
    private static volatile C63010eb f228037b;

    static {
        C83656h hVar = new C83656h();
        f228036a = hVar;
        C62942bv.registerDefaultInstance(C83656h.class, hVar);
    }

    private C83656h() {
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
                return newMessageInfo(f228036a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C83656h();
            case 4:
                return new C83655g();
            case 5:
                return f228036a;
            case 6:
                C63010eb ebVar = f228037b;
                if (ebVar == null) {
                    synchronized (C83656h.class) {
                        ebVar = f228037b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228036a);
                            f228037b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
