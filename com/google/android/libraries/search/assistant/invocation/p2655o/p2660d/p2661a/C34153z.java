package com.google.android.libraries.search.assistant.invocation.p2655o.p2660d.p2661a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.d.a.z */
/* compiled from: PG */
public final class C34153z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C34153z f90924b;

    /* renamed from: c */
    private static volatile C63010eb f90925c;

    /* renamed from: a */
    public int f90926a;

    static {
        C34153z zVar = new C34153z();
        f90924b = zVar;
        C62942bv.registerDefaultInstance(C34153z.class, zVar);
    }

    private C34153z() {
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
                return newMessageInfo(f90924b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C34153z();
            case 4:
                return new C34151x();
            case 5:
                return f90924b;
            case 6:
                C63010eb ebVar = f90925c;
                if (ebVar == null) {
                    synchronized (C34153z.class) {
                        ebVar = f90925c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90924b);
                            f90925c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
