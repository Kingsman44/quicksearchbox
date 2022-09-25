package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.co */
/* compiled from: PG */
public final class C56558co extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56558co f151018b;

    /* renamed from: c */
    private static volatile C63010eb f151019c;

    /* renamed from: a */
    public C62971cq f151020a = emptyProtobufList();

    static {
        C56558co coVar = new C56558co();
        f151018b = coVar;
        C62942bv.registerDefaultInstance(C56558co.class, coVar);
    }

    private C56558co() {
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
                return newMessageInfo(f151018b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56557cn.class});
            case 3:
                return new C56558co();
            case 4:
                return new C56555cl();
            case 5:
                return f151018b;
            case 6:
                C63010eb ebVar = f151019c;
                if (ebVar == null) {
                    synchronized (C56558co.class) {
                        ebVar = f151019c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151018b);
                            f151019c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
