package com.google.speech.p5228m;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.m.ar */
/* compiled from: PG */
public final class C67287ar extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67287ar f182903b;

    /* renamed from: c */
    private static volatile C63010eb f182904c;

    /* renamed from: a */
    public C62995dn f182905a = C62995dn.f170057a;

    static {
        C67287ar arVar = new C67287ar();
        f182903b = arVar;
        C62942bv.registerDefaultInstance(C67287ar.class, arVar);
    }

    private C67287ar() {
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
                return newMessageInfo(f182903b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C67285ap.f182902a});
            case 3:
                return new C67287ar();
            case 4:
                return new C67286aq();
            case 5:
                return f182903b;
            case 6:
                C63010eb ebVar = f182904c;
                if (ebVar == null) {
                    synchronized (C67287ar.class) {
                        ebVar = f182904c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f182903b);
                            f182904c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
