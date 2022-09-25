package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.l */
/* compiled from: PG */
public final class C67415l extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67415l f183225a;

    /* renamed from: b */
    private static volatile C63010eb f183226b;

    static {
        C67415l lVar = new C67415l();
        f183225a = lVar;
        C62942bv.registerDefaultInstance(C67415l.class, lVar);
    }

    private C67415l() {
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
                return newMessageInfo(f183225a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67415l();
            case 4:
                return new C67414k();
            case 5:
                return f183225a;
            case 6:
                C63010eb ebVar = f183226b;
                if (ebVar == null) {
                    synchronized (C67415l.class) {
                        ebVar = f183226b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183225a);
                            f183226b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
