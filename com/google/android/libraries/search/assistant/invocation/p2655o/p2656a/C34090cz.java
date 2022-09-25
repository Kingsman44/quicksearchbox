package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.cz */
/* compiled from: PG */
public final class C34090cz extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34090cz f90823c;

    /* renamed from: e */
    private static volatile C63010eb f90824e;

    /* renamed from: a */
    public C34088cx f90825a;

    /* renamed from: b */
    public C34057bt f90826b;

    /* renamed from: d */
    private int f90827d;

    static {
        C34090cz czVar = new C34090cz();
        f90823c = czVar;
        C62942bv.registerDefaultInstance(C34090cz.class, czVar);
    }

    private C34090cz() {
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
                return newMessageInfo(f90823c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C34090cz();
            case 4:
                return new C34089cy();
            case 5:
                return f90823c;
            case 6:
                C63010eb ebVar = f90824e;
                if (ebVar == null) {
                    synchronized (C34090cz.class) {
                        ebVar = f90824e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90823c);
                            f90824e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
