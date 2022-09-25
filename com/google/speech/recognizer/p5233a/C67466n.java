package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.n */
/* compiled from: PG */
public final class C67466n extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67466n f183362a;

    /* renamed from: b */
    private static volatile C63010eb f183363b;

    static {
        C67466n nVar = new C67466n();
        f183362a = nVar;
        C62942bv.registerDefaultInstance(C67466n.class, nVar);
    }

    private C67466n() {
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
                return newMessageInfo(f183362a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67466n();
            case 4:
                return new C67465m();
            case 5:
                return f183362a;
            case 6:
                C63010eb ebVar = f183363b;
                if (ebVar == null) {
                    synchronized (C67466n.class) {
                        ebVar = f183363b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183362a);
                            f183363b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
