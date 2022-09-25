package com.google.protos.p4985f.p5030q.p5032b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.b.av */
/* compiled from: PG */
public final class C65037av extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65037av f176123b;

    /* renamed from: c */
    private static volatile C63010eb f176124c;

    /* renamed from: a */
    public C62971cq f176125a = emptyProtobufList();

    static {
        C65037av avVar = new C65037av();
        f176123b = avVar;
        C62942bv.registerDefaultInstance(C65037av.class, avVar);
    }

    private C65037av() {
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
                return newMessageInfo(f176123b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C65036au.class});
            case 3:
                return new C65037av();
            case 4:
                return new C65034as();
            case 5:
                return f176123b;
            case 6:
                C63010eb ebVar = f176124c;
                if (ebVar == null) {
                    synchronized (C65037av.class) {
                        ebVar = f176124c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176123b);
                            f176124c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
