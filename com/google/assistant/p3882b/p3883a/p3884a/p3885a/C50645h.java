package com.google.assistant.p3882b.p3883a.p3884a.p3885a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.b.a.a.a.h */
/* compiled from: PG */
public final class C50645h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50645h f131745a;

    /* renamed from: b */
    private static volatile C63010eb f131746b;

    static {
        C50645h hVar = new C50645h();
        f131745a = hVar;
        C62942bv.registerDefaultInstance(C50645h.class, hVar);
    }

    private C50645h() {
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
                return newMessageInfo(f131745a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C50645h();
            case 4:
                return new C50644g();
            case 5:
                return f131745a;
            case 6:
                C63010eb ebVar = f131746b;
                if (ebVar == null) {
                    synchronized (C50645h.class) {
                        ebVar = f131746b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131745a);
                            f131746b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
