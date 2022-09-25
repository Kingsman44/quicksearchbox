package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.as */
/* compiled from: PG */
public final class C54315as extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54315as f142684c;

    /* renamed from: d */
    private static volatile C63010eb f142685d;

    /* renamed from: a */
    public C62971cq f142686a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f142687b = C62942bv.emptyProtobufList();

    static {
        C54315as asVar = new C54315as();
        f142684c = asVar;
        C62942bv.registerDefaultInstance(C54315as.class, asVar);
    }

    private C54315as() {
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
                return newMessageInfo(f142684c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002Ț", new Object[]{"a", C54359bl.class, "b"});
            case 3:
                return new C54315as();
            case 4:
                return new C54314ar();
            case 5:
                return f142684c;
            case 6:
                C63010eb ebVar = f142685d;
                if (ebVar == null) {
                    synchronized (C54315as.class) {
                        ebVar = f142685d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142684c);
                            f142685d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
