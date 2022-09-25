package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.df */
/* compiled from: PG */
public final class C62483df extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62483df f168690b;

    /* renamed from: c */
    private static volatile C63010eb f168691c;

    /* renamed from: a */
    public C62995dn f168692a = C62995dn.f170057a;

    static {
        C62483df dfVar = new C62483df();
        f168690b = dfVar;
        C62942bv.registerDefaultInstance(C62483df.class, dfVar);
    }

    private C62483df() {
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
                return newMessageInfo(f168690b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C62482de.f168689a});
            case 3:
                return new C62483df();
            case 4:
                return new C62481dd();
            case 5:
                return f168690b;
            case 6:
                C63010eb ebVar = f168691c;
                if (ebVar == null) {
                    synchronized (C62483df.class) {
                        ebVar = f168691c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168690b);
                            f168691c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
