package com.google.protos.p4887at.p4888a.p4889a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.at.a.a.b */
/* compiled from: PG */
public final class C63799b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63799b f172563c;

    /* renamed from: d */
    private static volatile C63010eb f172564d;

    /* renamed from: a */
    public C62971cq f172565a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f172566b = emptyProtobufList();

    static {
        C63799b bVar = new C63799b();
        f172563c = bVar;
        C62942bv.registerDefaultInstance(C63799b.class, bVar);
    }

    private C63799b() {
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
                return newMessageInfo(f172563c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", C63801d.class, "b", C63801d.class});
            case 3:
                return new C63799b();
            case 4:
                return new C63798a();
            case 5:
                return f172563c;
            case 6:
                C63010eb ebVar = f172564d;
                if (ebVar == null) {
                    synchronized (C63799b.class) {
                        ebVar = f172564d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172563c);
                            f172564d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
