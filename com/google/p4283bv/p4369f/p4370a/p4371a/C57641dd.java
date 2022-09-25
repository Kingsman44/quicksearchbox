package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.dd */
/* compiled from: PG */
public final class C57641dd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57641dd f153943a;

    /* renamed from: b */
    private static volatile C63010eb f153944b;

    static {
        C57641dd ddVar = new C57641dd();
        f153943a = ddVar;
        C62942bv.registerDefaultInstance(C57641dd.class, ddVar);
    }

    private C57641dd() {
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
                return newMessageInfo(f153943a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57641dd();
            case 4:
                return new C57640dc();
            case 5:
                return f153943a;
            case 6:
                C63010eb ebVar = f153944b;
                if (ebVar == null) {
                    synchronized (C57641dd.class) {
                        ebVar = f153944b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153943a);
                            f153944b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
