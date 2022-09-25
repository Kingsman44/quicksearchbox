package com.google.android.libraries.lens.view.infopanel;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.view.infopanel.aw */
/* compiled from: PG */
public final class C27005aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C27005aw f73633b;

    /* renamed from: c */
    private static volatile C63010eb f73634c;

    /* renamed from: a */
    public C27004av f73635a;

    static {
        C27005aw awVar = new C27005aw();
        f73633b = awVar;
        C62942bv.registerDefaultInstance(C27005aw.class, awVar);
    }

    private C27005aw() {
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
                return newMessageInfo(f73633b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C27005aw();
            case 4:
                return new C27002at();
            case 5:
                return f73633b;
            case 6:
                C63010eb ebVar = f73634c;
                if (ebVar == null) {
                    synchronized (C27005aw.class) {
                        ebVar = f73634c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f73633b);
                            f73634c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
