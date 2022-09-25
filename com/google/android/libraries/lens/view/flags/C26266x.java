package com.google.android.libraries.lens.view.flags;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.flags.x */
/* compiled from: PG */
public final class C26266x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C26266x f71397a;

    /* renamed from: c */
    private static volatile C63010eb f71398c;

    /* renamed from: b */
    private C62995dn f71399b = C62995dn.f170057a;

    static {
        C26266x xVar = new C26266x();
        f71397a = xVar;
        C62942bv.registerDefaultInstance(C26266x.class, xVar);
    }

    private C26266x() {
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
                return newMessageInfo(f71397a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"b", C26265w.f71396a});
            case 3:
                return new C26266x();
            case 4:
                return new C26264v();
            case 5:
                return f71397a;
            case 6:
                C63010eb ebVar = f71398c;
                if (ebVar == null) {
                    synchronized (C26266x.class) {
                        ebVar = f71398c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f71397a);
                            f71398c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
