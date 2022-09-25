package com.google.p427am.p432b.p433a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.o */
/* compiled from: PG */
public final class C8685o extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8685o f30009c;

    /* renamed from: d */
    private static volatile C63010eb f30010d;

    /* renamed from: a */
    public C62971cq f30011a = emptyProtobufList();

    /* renamed from: b */
    public boolean f30012b;

    static {
        C8685o oVar = new C8685o();
        f30009c = oVar;
        C62942bv.registerDefaultInstance(C8685o.class, oVar);
    }

    private C8685o() {
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
                return newMessageInfo(f30009c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002\u0007", new Object[]{"a", C8664bp.class, "b"});
            case 3:
                return new C8685o();
            case 4:
                return new C8684n();
            case 5:
                return f30009c;
            case 6:
                C63010eb ebVar = f30010d;
                if (ebVar == null) {
                    synchronized (C8685o.class) {
                        ebVar = f30010d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f30009c);
                            f30010d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
