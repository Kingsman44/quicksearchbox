package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3072i;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.n.c.a.i.l */
/* compiled from: PG */
public final class C39620l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C39620l f104294a;

    /* renamed from: b */
    private static volatile C63010eb f104295b;

    static {
        C39620l lVar = new C39620l();
        f104294a = lVar;
        C62942bv.registerDefaultInstance(C39620l.class, lVar);
    }

    private C39620l() {
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
                return newMessageInfo(f104294a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C39620l();
            case 4:
                return new C39619k();
            case 5:
                return f104294a;
            case 6:
                C63010eb ebVar = f104295b;
                if (ebVar == null) {
                    synchronized (C39620l.class) {
                        ebVar = f104295b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f104294a);
                            f104295b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
