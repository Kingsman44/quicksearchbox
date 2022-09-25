package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.hn */
/* compiled from: PG */
public final class C142497hn extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C142497hn f386690a;

    /* renamed from: b */
    private static volatile C63010eb f386691b;

    static {
        C142497hn hnVar = new C142497hn();
        f386690a = hnVar;
        C62942bv.registerDefaultInstance(C142497hn.class, hnVar);
    }

    private C142497hn() {
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
                return newMessageInfo(f386690a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C142497hn();
            case 4:
                return new C142496hm();
            case 5:
                return f386690a;
            case 6:
                C63010eb ebVar = f386691b;
                if (ebVar == null) {
                    synchronized (C142497hn.class) {
                        ebVar = f386691b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386690a);
                            f386691b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
