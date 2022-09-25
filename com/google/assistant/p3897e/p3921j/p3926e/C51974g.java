package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.g */
/* compiled from: PG */
public final class C51974g extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C51974g f136388a;

    /* renamed from: b */
    private static volatile C63010eb f136389b;

    static {
        C51974g gVar = new C51974g();
        f136388a = gVar;
        C62942bv.registerDefaultInstance(C51974g.class, gVar);
    }

    private C51974g() {
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
                return newMessageInfo(f136388a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C51974g();
            case 4:
                return new C51947f();
            case 5:
                return f136388a;
            case 6:
                C63010eb ebVar = f136389b;
                if (ebVar == null) {
                    synchronized (C51974g.class) {
                        ebVar = f136389b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136388a);
                            f136389b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
