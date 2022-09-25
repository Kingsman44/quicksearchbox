package com.google.android.p10712d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.d.n */
/* compiled from: PG */
public final class C142522n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C142522n f386743b;

    /* renamed from: c */
    private static volatile C63010eb f386744c;

    /* renamed from: a */
    public C62971cq f386745a = emptyProtobufList();

    static {
        C142522n nVar = new C142522n();
        f386743b = nVar;
        C62942bv.registerDefaultInstance(C142522n.class, nVar);
    }

    private C142522n() {
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
                return newMessageInfo(f386743b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C142520l.class});
            case 3:
                return new C142522n();
            case 4:
                return new C142521m();
            case 5:
                return f386743b;
            case 6:
                C63010eb ebVar = f386744c;
                if (ebVar == null) {
                    synchronized (C142522n.class) {
                        ebVar = f386744c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f386743b);
                            f386744c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
