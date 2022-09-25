package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.w */
/* compiled from: PG */
public final class C34150w extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C34150w f90916a;

    /* renamed from: b */
    private static volatile C63010eb f90917b;

    static {
        C34150w wVar = new C34150w();
        f90916a = wVar;
        C62942bv.registerDefaultInstance(C34150w.class, wVar);
    }

    private C34150w() {
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
                return newMessageInfo(f90916a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C34150w();
            case 4:
                return new C34149v();
            case 5:
                return f90916a;
            case 6:
                C63010eb ebVar = f90917b;
                if (ebVar == null) {
                    synchronized (C34150w.class) {
                        ebVar = f90917b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90916a);
                            f90917b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
