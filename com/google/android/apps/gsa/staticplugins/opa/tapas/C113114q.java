package com.google.android.apps.gsa.staticplugins.opa.tapas;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.q */
/* compiled from: PG */
public final class C113114q extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C113114q f313397b;

    /* renamed from: c */
    private static volatile C63010eb f313398c;

    /* renamed from: a */
    public C112988o f313399a;

    static {
        C113114q qVar = new C113114q();
        f313397b = qVar;
        C62942bv.registerDefaultInstance(C113114q.class, qVar);
    }

    private C113114q() {
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
                return newMessageInfo(f313397b, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", new Object[]{"a"});
            case 3:
                return new C113114q();
            case 4:
                return new C113024p();
            case 5:
                return f313397b;
            case 6:
                C63010eb ebVar = f313398c;
                if (ebVar == null) {
                    synchronized (C113114q.class) {
                        ebVar = f313398c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313397b);
                            f313398c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
