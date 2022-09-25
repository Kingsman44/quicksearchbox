package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.nf */
/* compiled from: PG */
public final class C52316nf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C52316nf f137318a;

    /* renamed from: b */
    private static volatile C63010eb f137319b;

    static {
        C52316nf nfVar = new C52316nf();
        f137318a = nfVar;
        C62942bv.registerDefaultInstance(C52316nf.class, nfVar);
    }

    private C52316nf() {
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
                return newMessageInfo(f137318a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C52316nf();
            case 4:
                return new C52315ne();
            case 5:
                return f137318a;
            case 6:
                C63010eb ebVar = f137319b;
                if (ebVar == null) {
                    synchronized (C52316nf.class) {
                        ebVar = f137319b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137318a);
                            f137319b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
