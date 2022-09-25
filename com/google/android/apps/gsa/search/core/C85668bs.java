package com.google.android.apps.gsa.search.core;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.bs */
/* compiled from: PG */
public final class C85668bs extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C85668bs f231592b;

    /* renamed from: c */
    private static volatile C63010eb f231593c;

    /* renamed from: a */
    public C62971cq f231594a = emptyProtobufList();

    static {
        C85668bs bsVar = new C85668bs();
        f231592b = bsVar;
        C62942bv.registerDefaultInstance(C85668bs.class, bsVar);
    }

    private C85668bs() {
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
                return newMessageInfo(f231592b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C85667br.class});
            case 3:
                return new C85668bs();
            case 4:
                return new C85665bp();
            case 5:
                return f231592b;
            case 6:
                C63010eb ebVar = f231593c;
                if (ebVar == null) {
                    synchronized (C85668bs.class) {
                        ebVar = f231593c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f231592b);
                            f231593c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
