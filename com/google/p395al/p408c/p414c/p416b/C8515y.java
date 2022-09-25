package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.y */
/* compiled from: PG */
public final class C8515y extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8515y f29547b;

    /* renamed from: c */
    private static volatile C63010eb f29548c;

    /* renamed from: a */
    public C62971cq f29549a = emptyProtobufList();

    static {
        C8515y yVar = new C8515y();
        f29547b = yVar;
        C62942bv.registerDefaultInstance(C8515y.class, yVar);
    }

    private C8515y() {
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
                return newMessageInfo(f29547b, "\u0001\u0001\u0000\u0000\b\b\u0001\u0000\u0001\u0000\b\u001b", new Object[]{"a", C8458aa.class});
            case 3:
                return new C8515y();
            case 4:
                return new C8514x();
            case 5:
                return f29547b;
            case 6:
                C63010eb ebVar = f29548c;
                if (ebVar == null) {
                    synchronized (C8515y.class) {
                        ebVar = f29548c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29547b);
                            f29548c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
