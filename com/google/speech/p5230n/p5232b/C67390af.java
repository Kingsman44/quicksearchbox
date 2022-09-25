package com.google.speech.p5230n.p5232b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.af */
/* compiled from: PG */
public final class C67390af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C67390af f183171a;

    /* renamed from: b */
    private static volatile C63010eb f183172b;

    static {
        C67390af afVar = new C67390af();
        f183171a = afVar;
        C62942bv.registerDefaultInstance(C67390af.class, afVar);
    }

    private C67390af() {
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
                return newMessageInfo(f183171a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C67390af();
            case 4:
                return new C67389ae();
            case 5:
                return f183171a;
            case 6:
                C63010eb ebVar = f183172b;
                if (ebVar == null) {
                    synchronized (C67390af.class) {
                        ebVar = f183172b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183171a);
                            f183172b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
