package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.wv */
/* compiled from: PG */
public final class C8135wv extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8135wv f28607a;

    /* renamed from: b */
    private static volatile C63010eb f28608b;

    static {
        C8135wv wvVar = new C8135wv();
        f28607a = wvVar;
        C62942bv.registerDefaultInstance(C8135wv.class, wvVar);
    }

    private C8135wv() {
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
                return newMessageInfo(f28607a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8135wv();
            case 4:
                return new C8134wu();
            case 5:
                return f28607a;
            case 6:
                C63010eb ebVar = f28608b;
                if (ebVar == null) {
                    synchronized (C8135wv.class) {
                        ebVar = f28608b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28607a);
                            f28608b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
