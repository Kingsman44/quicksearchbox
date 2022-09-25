package com.google.assistant.p3897e.p3929l.p3930a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.l.a.du */
/* compiled from: PG */
public final class C52769du extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52769du f138465a;

    /* renamed from: b */
    private static volatile C63010eb f138466b;

    static {
        C52769du duVar = new C52769du();
        f138465a = duVar;
        C62942bv.registerDefaultInstance(C52769du.class, duVar);
    }

    private C52769du() {
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
                return newMessageInfo(f138465a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C52769du();
            case 4:
                return new C52768dt();
            case 5:
                return f138465a;
            case 6:
                C63010eb ebVar = f138466b;
                if (ebVar == null) {
                    synchronized (C52769du.class) {
                        ebVar = f138466b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138465a);
                            f138466b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
