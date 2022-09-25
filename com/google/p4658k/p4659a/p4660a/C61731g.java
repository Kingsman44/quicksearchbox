package com.google.p4658k.p4659a.p4660a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.k.a.a.g */
/* compiled from: PG */
public final class C61731g extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C61731g f166772b;

    /* renamed from: c */
    private static volatile C63010eb f166773c;

    /* renamed from: a */
    public C62971cq f166774a = emptyProtobufList();

    static {
        C61731g gVar = new C61731g();
        f166772b = gVar;
        C62942bv.registerDefaultInstance(C61731g.class, gVar);
    }

    private C61731g() {
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
                return newMessageInfo(f166772b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C61730f.class});
            case 3:
                return new C61731g();
            case 4:
                return new C61727c();
            case 5:
                return f166772b;
            case 6:
                C63010eb ebVar = f166773c;
                if (ebVar == null) {
                    synchronized (C61731g.class) {
                        ebVar = f166773c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166772b);
                            f166773c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
