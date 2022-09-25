package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.kc */
/* compiled from: PG */
public final class C14462kc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14462kc f43732b;

    /* renamed from: c */
    private static volatile C63010eb f43733c;

    /* renamed from: a */
    public int f43734a;

    static {
        C14462kc kcVar = new C14462kc();
        f43732b = kcVar;
        C62942bv.registerDefaultInstance(C14462kc.class, kcVar);
    }

    private C14462kc() {
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
                return newMessageInfo(f43732b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14462kc();
            case 4:
                return new C14461kb();
            case 5:
                return f43732b;
            case 6:
                C63010eb ebVar = f43733c;
                if (ebVar == null) {
                    synchronized (C14462kc.class) {
                        ebVar = f43733c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43732b);
                            f43733c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
