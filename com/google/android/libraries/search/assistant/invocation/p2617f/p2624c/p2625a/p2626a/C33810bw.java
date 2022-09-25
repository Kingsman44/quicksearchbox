package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.bw */
/* compiled from: PG */
public final class C33810bw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33810bw f90262a;

    /* renamed from: b */
    private static volatile C63010eb f90263b;

    static {
        C33810bw bwVar = new C33810bw();
        f90262a = bwVar;
        C62942bv.registerDefaultInstance(C33810bw.class, bwVar);
    }

    private C33810bw() {
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
                return newMessageInfo(f90262a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33810bw();
            case 4:
                return new C33809bv();
            case 5:
                return f90262a;
            case 6:
                C63010eb ebVar = f90263b;
                if (ebVar == null) {
                    synchronized (C33810bw.class) {
                        ebVar = f90263b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90262a);
                            f90263b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
