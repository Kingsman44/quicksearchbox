package com.google.android.libraries.assistant.p1619u.p1620a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.u.a.d */
/* compiled from: PG */
public final class C19450d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C19450d f54382a;

    /* renamed from: b */
    private static volatile C63010eb f54383b;

    static {
        C19450d dVar = new C19450d();
        f54382a = dVar;
        C62942bv.registerDefaultInstance(C19450d.class, dVar);
    }

    private C19450d() {
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
                return newMessageInfo(f54382a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C19450d();
            case 4:
                return new C19449c();
            case 5:
                return f54382a;
            case 6:
                C63010eb ebVar = f54383b;
                if (ebVar == null) {
                    synchronized (C19450d.class) {
                        ebVar = f54383b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f54382a);
                            f54383b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
