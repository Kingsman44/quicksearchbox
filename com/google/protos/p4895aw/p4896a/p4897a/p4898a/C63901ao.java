package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.ao */
/* compiled from: PG */
public final class C63901ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63901ao f172789b;

    /* renamed from: c */
    private static volatile C63010eb f172790c;

    /* renamed from: a */
    public C62971cq f172791a = emptyProtobufList();

    static {
        C63901ao aoVar = new C63901ao();
        f172789b = aoVar;
        C62942bv.registerDefaultInstance(C63901ao.class, aoVar);
    }

    private C63901ao() {
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
                return newMessageInfo(f172789b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C63909aw.class});
            case 3:
                return new C63901ao();
            case 4:
                return new C63900an();
            case 5:
                return f172789b;
            case 6:
                C63010eb ebVar = f172790c;
                if (ebVar == null) {
                    synchronized (C63901ao.class) {
                        ebVar = f172790c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172789b);
                            f172790c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
