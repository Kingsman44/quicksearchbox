package com.google.android.apps.search.googleapp.customtabs.p10152d.p10153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.customtabs.d.a.af */
/* compiled from: PG */
public final class C133714af extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C133714af f364207d;

    /* renamed from: e */
    private static volatile C63010eb f364208e;

    /* renamed from: a */
    public int f364209a;

    /* renamed from: b */
    public int f364210b;

    /* renamed from: c */
    public C133712ad f364211c;

    static {
        C133714af afVar = new C133714af();
        f364207d = afVar;
        C62942bv.registerDefaultInstance(C133714af.class, afVar);
    }

    private C133714af() {
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
                return newMessageInfo(f364207d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C133714af();
            case 4:
                return new C133713ae();
            case 5:
                return f364207d;
            case 6:
                C63010eb ebVar = f364208e;
                if (ebVar == null) {
                    synchronized (C133714af.class) {
                        ebVar = f364208e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f364207d);
                            f364208e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
