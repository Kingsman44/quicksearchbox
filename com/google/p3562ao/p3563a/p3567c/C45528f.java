package com.google.p3562ao.p3563a.p3567c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.c.f */
/* compiled from: PG */
public final class C45528f extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C45528f f119003b;

    /* renamed from: c */
    private static volatile C63010eb f119004c;

    /* renamed from: a */
    public C62971cq f119005a = emptyProtobufList();

    static {
        C45528f fVar = new C45528f();
        f119003b = fVar;
        C62942bv.registerDefaultInstance(C45528f.class, fVar);
    }

    private C45528f() {
        emptyProtobufList();
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
                return newMessageInfo(f119003b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C45526d.class});
            case 3:
                return new C45528f();
            case 4:
                return new C45527e();
            case 5:
                return f119003b;
            case 6:
                C63010eb ebVar = f119004c;
                if (ebVar == null) {
                    synchronized (C45528f.class) {
                        ebVar = f119004c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119003b);
                            f119004c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
