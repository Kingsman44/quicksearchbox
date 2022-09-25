package com.google.android.libraries.assistant.pcp.p1578m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.pcp.m.ae */
/* compiled from: PG */
public final class C18964ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C18964ae f53288a;

    /* renamed from: b */
    private static volatile C63010eb f53289b;

    static {
        C18964ae aeVar = new C18964ae();
        f53288a = aeVar;
        C62942bv.registerDefaultInstance(C18964ae.class, aeVar);
    }

    private C18964ae() {
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
                return newMessageInfo(f53288a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C18964ae();
            case 4:
                return new C18963ad();
            case 5:
                return f53288a;
            case 6:
                C63010eb ebVar = f53289b;
                if (ebVar == null) {
                    synchronized (C18964ae.class) {
                        ebVar = f53289b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53288a);
                            f53289b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
