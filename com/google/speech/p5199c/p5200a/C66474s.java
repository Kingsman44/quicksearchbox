package com.google.speech.p5199c.p5200a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.c.a.s */
/* compiled from: PG */
public final class C66474s extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C66474s f180746a;

    /* renamed from: c */
    private static volatile C63010eb f180747c;

    /* renamed from: b */
    private C62995dn f180748b = C62995dn.f170057a;

    static {
        C66474s sVar = new C66474s();
        f180746a = sVar;
        C62942bv.registerDefaultInstance(C66474s.class, sVar);
    }

    private C66474s() {
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
                return newMessageInfo(f180746a, "\u0001\u0001\u0000\u0000\u0007\u0007\u0001\u0001\u0000\u0000\u00072", new Object[]{"b", C66471p.f180743a});
            case 3:
                return new C66474s();
            case 4:
                return new C66470o();
            case 5:
                return f180746a;
            case 6:
                C63010eb ebVar = f180747c;
                if (ebVar == null) {
                    synchronized (C66474s.class) {
                        ebVar = f180747c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180746a);
                            f180747c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
