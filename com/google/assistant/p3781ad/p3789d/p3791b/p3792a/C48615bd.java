package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.bd */
/* compiled from: PG */
public final class C48615bd extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48615bd f125633b;

    /* renamed from: c */
    private static volatile C63010eb f125634c;

    /* renamed from: a */
    public C62971cq f125635a = emptyProtobufList();

    static {
        C48615bd bdVar = new C48615bd();
        f125633b = bdVar;
        C62942bv.registerDefaultInstance(C48615bd.class, bdVar);
    }

    private C48615bd() {
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
                return newMessageInfo(f125633b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C48613bb.class});
            case 3:
                return new C48615bd();
            case 4:
                return new C48614bc();
            case 5:
                return f125633b;
            case 6:
                C63010eb ebVar = f125634c;
                if (ebVar == null) {
                    synchronized (C48615bd.class) {
                        ebVar = f125634c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125633b);
                            f125634c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
