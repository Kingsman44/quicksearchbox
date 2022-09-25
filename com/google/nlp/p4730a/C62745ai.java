package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ai */
/* compiled from: PG */
public final class C62745ai extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62745ai f169467a;

    /* renamed from: b */
    private static volatile C63010eb f169468b;

    static {
        C62745ai aiVar = new C62745ai();
        f169467a = aiVar;
        C62942bv.registerDefaultInstance(C62745ai.class, aiVar);
    }

    private C62745ai() {
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
                return newMessageInfo(f169467a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62745ai();
            case 4:
                return new C62744ah();
            case 5:
                return f169467a;
            case 6:
                C63010eb ebVar = f169468b;
                if (ebVar == null) {
                    synchronized (C62745ai.class) {
                        ebVar = f169468b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169467a);
                            f169468b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
