package com.google.android.libraries.search.assistant.invocation.p2655o.p2656a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.o.a.cx */
/* compiled from: PG */
public final class C34088cx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C34088cx f90818c;

    /* renamed from: e */
    private static volatile C63010eb f90819e;

    /* renamed from: a */
    public boolean f90820a;

    /* renamed from: b */
    public boolean f90821b;

    /* renamed from: d */
    private int f90822d;

    static {
        C34088cx cxVar = new C34088cx();
        f90818c = cxVar;
        C62942bv.registerDefaultInstance(C34088cx.class, cxVar);
    }

    private C34088cx() {
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
                return newMessageInfo(f90818c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C34088cx();
            case 4:
                return new C34087cw();
            case 5:
                return f90818c;
            case 6:
                C63010eb ebVar = f90819e;
                if (ebVar == null) {
                    synchronized (C34088cx.class) {
                        ebVar = f90819e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90818c);
                            f90819e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
