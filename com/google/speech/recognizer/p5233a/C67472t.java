package com.google.speech.recognizer.p5233a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.recognizer.a.t */
/* compiled from: PG */
public final class C67472t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67472t f183382a;

    /* renamed from: b */
    private static volatile C63010eb f183383b;

    static {
        C67472t tVar = new C67472t();
        f183382a = tVar;
        C62942bv.registerDefaultInstance(C67472t.class, tVar);
    }

    private C67472t() {
        emptyProtobufList();
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
                return newMessageInfo(f183382a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67472t();
            case 4:
                return new C67471s();
            case 5:
                return f183382a;
            case 6:
                C63010eb ebVar = f183383b;
                if (ebVar == null) {
                    synchronized (C67472t.class) {
                        ebVar = f183383b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183382a);
                            f183383b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
