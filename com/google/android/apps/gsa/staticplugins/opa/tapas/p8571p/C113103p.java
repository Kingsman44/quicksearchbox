package com.google.android.apps.gsa.staticplugins.opa.tapas.p8571p;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.p.p */
/* compiled from: PG */
public final class C113103p extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C113103p f313378b;

    /* renamed from: c */
    private static volatile C63010eb f313379c;

    /* renamed from: a */
    public C62971cq f313380a = emptyProtobufList();

    static {
        C113103p pVar = new C113103p();
        f313378b = pVar;
        C62942bv.registerDefaultInstance(C113103p.class, pVar);
    }

    private C113103p() {
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
                return newMessageInfo(f313378b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C113091d.class});
            case 3:
                return new C113103p();
            case 4:
                return new C113102o();
            case 5:
                return f313378b;
            case 6:
                C63010eb ebVar = f313379c;
                if (ebVar == null) {
                    synchronized (C113103p.class) {
                        ebVar = f313379c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f313378b);
                            f313379c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
