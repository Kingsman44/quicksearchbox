package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ac */
/* compiled from: PG */
public final class C62739ac extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62739ac f169459a;

    /* renamed from: b */
    private static volatile C63010eb f169460b;

    static {
        C62739ac acVar = new C62739ac();
        f169459a = acVar;
        C62942bv.registerDefaultInstance(C62739ac.class, acVar);
    }

    private C62739ac() {
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
                return newMessageInfo(f169459a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62739ac();
            case 4:
                return new C62738ab();
            case 5:
                return f169459a;
            case 6:
                C63010eb ebVar = f169460b;
                if (ebVar == null) {
                    synchronized (C62739ac.class) {
                        ebVar = f169460b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169459a);
                            f169460b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
