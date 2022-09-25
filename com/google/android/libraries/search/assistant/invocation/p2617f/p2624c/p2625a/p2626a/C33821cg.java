package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.cg */
/* compiled from: PG */
public final class C33821cg extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C33821cg f90277b;

    /* renamed from: c */
    private static volatile C63010eb f90278c;

    /* renamed from: a */
    public int f90279a;

    static {
        C33821cg cgVar = new C33821cg();
        f90277b = cgVar;
        C62942bv.registerDefaultInstance(C33821cg.class, cgVar);
    }

    private C33821cg() {
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
                return newMessageInfo(f90277b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C33821cg();
            case 4:
                return new C33820cf();
            case 5:
                return f90277b;
            case 6:
                C63010eb ebVar = f90278c;
                if (ebVar == null) {
                    synchronized (C33821cg.class) {
                        ebVar = f90278c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90277b);
                            f90278c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
