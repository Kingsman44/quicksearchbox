package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.as */
/* compiled from: PG */
public final class C34029as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34029as f90684c;

    /* renamed from: d */
    private static volatile C63010eb f90685d;

    /* renamed from: a */
    public int f90686a = 0;

    /* renamed from: b */
    public Object f90687b;

    static {
        C34029as asVar = new C34029as();
        f90684c = asVar;
        C62942bv.registerDefaultInstance(C34029as.class, asVar);
    }

    private C34029as() {
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
                return newMessageInfo(f90684c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000", new Object[]{"b", "a", C34028ar.class, C34026ap.class});
            case 3:
                return new C34029as();
            case 4:
                return new C34024an();
            case 5:
                return f90684c;
            case 6:
                C63010eb ebVar = f90685d;
                if (ebVar == null) {
                    synchronized (C34029as.class) {
                        ebVar = f90685d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90684c);
                            f90685d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
