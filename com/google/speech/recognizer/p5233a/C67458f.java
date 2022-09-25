package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.f */
/* compiled from: PG */
public final class C67458f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67458f f183345a;

    /* renamed from: b */
    private static volatile C63010eb f183346b;

    static {
        C67458f fVar = new C67458f();
        f183345a = fVar;
        C62942bv.registerDefaultInstance(C67458f.class, fVar);
    }

    private C67458f() {
        emptyFloatList();
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
                return newMessageInfo(f183345a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67458f();
            case 4:
                return new C67457e();
            case 5:
                return f183345a;
            case 6:
                C63010eb ebVar = f183346b;
                if (ebVar == null) {
                    synchronized (C67458f.class) {
                        ebVar = f183346b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183345a);
                            f183346b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
