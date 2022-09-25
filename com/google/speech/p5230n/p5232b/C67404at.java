package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.at */
/* compiled from: PG */
public final class C67404at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67404at f183198a;

    /* renamed from: b */
    private static volatile C63010eb f183199b;

    static {
        C67404at atVar = new C67404at();
        f183198a = atVar;
        C62942bv.registerDefaultInstance(C67404at.class, atVar);
    }

    private C67404at() {
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
                return newMessageInfo(f183198a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67404at();
            case 4:
                return new C67403as();
            case 5:
                return f183198a;
            case 6:
                C63010eb ebVar = f183199b;
                if (ebVar == null) {
                    synchronized (C67404at.class) {
                        ebVar = f183199b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183198a);
                            f183199b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
