package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.h */
/* compiled from: PG */
public final class C53252h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53252h f139591a;

    /* renamed from: b */
    private static volatile C63010eb f139592b;

    static {
        C53252h hVar = new C53252h();
        f139591a = hVar;
        C62942bv.registerDefaultInstance(C53252h.class, hVar);
    }

    private C53252h() {
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
                return newMessageInfo(f139591a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53252h();
            case 4:
                return new C53225g();
            case 5:
                return f139591a;
            case 6:
                C63010eb ebVar = f139592b;
                if (ebVar == null) {
                    synchronized (C53252h.class) {
                        ebVar = f139592b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139591a);
                            f139592b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
