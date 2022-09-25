package com.google.p427am.p438d.p439a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.d.a.dj */
/* compiled from: PG */
public final class C8790dj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8790dj f30166b;

    /* renamed from: c */
    private static volatile C63010eb f30167c;

    /* renamed from: a */
    public C62995dn f30168a = C62995dn.f170057a;

    static {
        C8790dj djVar = new C8790dj();
        f30166b = djVar;
        C62942bv.registerDefaultInstance(C8790dj.class, djVar);
    }

    private C8790dj() {
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
                return newMessageInfo(f30166b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C8789di.f30165a});
            case 3:
                return new C8790dj();
            case 4:
                return new C8786df();
            case 5:
                return f30166b;
            case 6:
                C63010eb ebVar = f30167c;
                if (ebVar == null) {
                    synchronized (C8790dj.class) {
                        ebVar = f30167c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30166b);
                            f30167c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
