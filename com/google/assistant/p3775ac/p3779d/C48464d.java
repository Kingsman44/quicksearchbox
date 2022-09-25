package com.google.assistant.p3775ac.p3779d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ac.d.d */
/* compiled from: PG */
public final class C48464d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48464d f125201a;

    /* renamed from: b */
    private static volatile C63010eb f125202b;

    static {
        C48464d dVar = new C48464d();
        f125201a = dVar;
        C62942bv.registerDefaultInstance(C48464d.class, dVar);
    }

    private C48464d() {
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
                return newMessageInfo(f125201a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C48464d();
            case 4:
                return new C48463c();
            case 5:
                return f125201a;
            case 6:
                C63010eb ebVar = f125202b;
                if (ebVar == null) {
                    synchronized (C48464d.class) {
                        ebVar = f125202b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125201a);
                            f125202b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
