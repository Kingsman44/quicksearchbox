package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.bs */
/* compiled from: PG */
public final class C33806bs extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33806bs f90258a;

    /* renamed from: b */
    private static volatile C63010eb f90259b;

    static {
        C33806bs bsVar = new C33806bs();
        f90258a = bsVar;
        C62942bv.registerDefaultInstance(C33806bs.class, bsVar);
    }

    private C33806bs() {
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
                return newMessageInfo(f90258a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33806bs();
            case 4:
                return new C33805br();
            case 5:
                return f90258a;
            case 6:
                C63010eb ebVar = f90259b;
                if (ebVar == null) {
                    synchronized (C33806bs.class) {
                        ebVar = f90259b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90258a);
                            f90259b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
