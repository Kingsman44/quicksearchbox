package com.google.android.apps.gsa.opa.smartspace.p6455d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opa.smartspace.d.n */
/* compiled from: PG */
public final class C83771n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C83771n f228324b;

    /* renamed from: c */
    private static volatile C63010eb f228325c;

    /* renamed from: a */
    public C62971cq f228326a = emptyProtobufList();

    static {
        C83771n nVar = new C83771n();
        f228324b = nVar;
        C62942bv.registerDefaultInstance(C83771n.class, nVar);
    }

    private C83771n() {
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
                return newMessageInfo(f228324b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C83769l.class});
            case 3:
                return new C83771n();
            case 4:
                return new C83770m();
            case 5:
                return f228324b;
            case 6:
                C63010eb ebVar = f228325c;
                if (ebVar == null) {
                    synchronized (C83771n.class) {
                        ebVar = f228325c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228324b);
                            f228325c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
