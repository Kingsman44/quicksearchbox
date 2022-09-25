package com.google.assistant.p3745ab.p3763o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.o.h */
/* compiled from: PG */
public final class C48371h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48371h f125044a;

    /* renamed from: b */
    private static volatile C63010eb f125045b;

    static {
        C48371h hVar = new C48371h();
        f125044a = hVar;
        C62942bv.registerDefaultInstance(C48371h.class, hVar);
    }

    private C48371h() {
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
                return newMessageInfo(f125044a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C48371h();
            case 4:
                return new C48370g();
            case 5:
                return f125044a;
            case 6:
                C63010eb ebVar = f125045b;
                if (ebVar == null) {
                    synchronized (C48371h.class) {
                        ebVar = f125045b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125044a);
                            f125045b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
