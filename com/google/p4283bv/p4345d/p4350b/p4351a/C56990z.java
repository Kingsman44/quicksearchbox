package com.google.p4283bv.p4345d.p4350b.p4351a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.b.a.z */
/* compiled from: PG */
public final class C56990z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56990z f152131b;

    /* renamed from: c */
    private static volatile C63010eb f152132c;

    /* renamed from: a */
    public C62971cq f152133a = emptyProtobufList();

    static {
        C56990z zVar = new C56990z();
        f152131b = zVar;
        C62942bv.registerDefaultInstance(C56990z.class, zVar);
    }

    private C56990z() {
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
                return newMessageInfo(f152131b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56989y.class});
            case 3:
                return new C56990z();
            case 4:
                return new C56987w();
            case 5:
                return f152131b;
            case 6:
                C63010eb ebVar = f152132c;
                if (ebVar == null) {
                    synchronized (C56990z.class) {
                        ebVar = f152132c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152131b);
                            f152132c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
