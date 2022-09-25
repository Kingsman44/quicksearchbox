package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.ct */
/* compiled from: PG */
public final class C34084ct extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34084ct f90814b;

    /* renamed from: c */
    private static volatile C63010eb f90815c;

    /* renamed from: a */
    public boolean f90816a;

    static {
        C34084ct ctVar = new C34084ct();
        f90814b = ctVar;
        C62942bv.registerDefaultInstance(C34084ct.class, ctVar);
    }

    private C34084ct() {
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
                return newMessageInfo(f90814b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0007", new Object[]{"a"});
            case 3:
                return new C34084ct();
            case 4:
                return new C34083cs();
            case 5:
                return f90814b;
            case 6:
                C63010eb ebVar = f90815c;
                if (ebVar == null) {
                    synchronized (C34084ct.class) {
                        ebVar = f90815c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90814b);
                            f90815c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
