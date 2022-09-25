package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.h */
/* compiled from: PG */
public final class C67460h extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67460h f183347a;

    /* renamed from: b */
    private static volatile C63010eb f183348b;

    static {
        C67460h hVar = new C67460h();
        f183347a = hVar;
        C62942bv.registerDefaultInstance(C67460h.class, hVar);
    }

    private C67460h() {
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
                return newMessageInfo(f183347a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67460h();
            case 4:
                return new C67459g();
            case 5:
                return f183347a;
            case 6:
                C63010eb ebVar = f183348b;
                if (ebVar == null) {
                    synchronized (C67460h.class) {
                        ebVar = f183348b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183347a);
                            f183348b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
