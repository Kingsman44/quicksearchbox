package com.google.android.libraries.search.assistant.invocation.p2617f.p2624c.p2625a.p2626a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.invocation.f.c.a.a.aw */
/* compiled from: PG */
public final class C33783aw extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C33783aw f90233a;

    /* renamed from: b */
    private static volatile C63010eb f90234b;

    static {
        C33783aw awVar = new C33783aw();
        f90233a = awVar;
        C62942bv.registerDefaultInstance(C33783aw.class, awVar);
    }

    private C33783aw() {
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
                return newMessageInfo(f90233a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C33783aw();
            case 4:
                return new C33782av();
            case 5:
                return f90233a;
            case 6:
                C63010eb ebVar = f90234b;
                if (ebVar == null) {
                    synchronized (C33783aw.class) {
                        ebVar = f90234b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f90233a);
                            f90234b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
