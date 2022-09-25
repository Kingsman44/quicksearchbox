package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.ao */
/* compiled from: PG */
public final class C120053ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C120053ao f334218b;

    /* renamed from: c */
    private static volatile C63010eb f334219c;

    /* renamed from: a */
    public int f334220a;

    static {
        C120053ao aoVar = new C120053ao();
        f334218b = aoVar;
        C62942bv.registerDefaultInstance(C120053ao.class, aoVar);
    }

    private C120053ao() {
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
                return newMessageInfo(f334218b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C120053ao();
            case 4:
                return new C120052an();
            case 5:
                return f334218b;
            case 6:
                C63010eb ebVar = f334219c;
                if (ebVar == null) {
                    synchronized (C120053ao.class) {
                        ebVar = f334219c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334218b);
                            f334219c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
