package com.google.p4222bl.p4223a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.l */
/* compiled from: PG */
public final class C56098l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56098l f149445b;

    /* renamed from: c */
    private static volatile C63010eb f149446c;

    /* renamed from: a */
    public C62971cq f149447a = emptyProtobufList();

    static {
        C56098l lVar = new C56098l();
        f149445b = lVar;
        C62942bv.registerDefaultInstance(C56098l.class, lVar);
    }

    private C56098l() {
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
                return newMessageInfo(f149445b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C56093g.class});
            case 3:
                return new C56098l();
            case 4:
                return new C56097k();
            case 5:
                return f149445b;
            case 6:
                C63010eb ebVar = f149446c;
                if (ebVar == null) {
                    synchronized (C56098l.class) {
                        ebVar = f149446c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149445b);
                            f149446c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
