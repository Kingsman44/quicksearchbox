package com.google.android.apps.gsa.opa.p6441f.p6442a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.f.a.bj */
/* compiled from: PG */
public final class C83648bj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C83648bj f228014c;

    /* renamed from: d */
    private static volatile C63010eb f228015d;

    /* renamed from: a */
    public int f228016a;

    /* renamed from: b */
    public int f228017b;

    static {
        C83648bj bjVar = new C83648bj();
        f228014c = bjVar;
        C62942bv.registerDefaultInstance(C83648bj.class, bjVar);
    }

    private C83648bj() {
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
                return newMessageInfo(f228014c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C83646bh.f228013a});
            case 3:
                return new C83648bj();
            case 4:
                return new C83645bg();
            case 5:
                return f228014c;
            case 6:
                C63010eb ebVar = f228015d;
                if (ebVar == null) {
                    synchronized (C83648bj.class) {
                        ebVar = f228015d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228014c);
                            f228015d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
