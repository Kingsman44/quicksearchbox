package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.aw */
/* compiled from: PG */
public final class C57371aw extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57371aw f153268b;

    /* renamed from: d */
    private static volatile C63010eb f153269d;

    /* renamed from: a */
    public C62971cq f153270a = emptyProtobufList();

    /* renamed from: c */
    private byte f153271c = 2;

    static {
        C57371aw awVar = new C57371aw();
        f153268b = awVar;
        C62942bv.registerDefaultInstance(C57371aw.class, awVar);
    }

    private C57371aw() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153271c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153271c = b;
                return null;
            case 2:
                return newMessageInfo(f153268b, "\u0001\u0001\u0000\u0000\u0006\u0006\u0001\u0000\u0001\u0001\u0006Л", new Object[]{"a", C57362an.class});
            case 3:
                return new C57371aw();
            case 4:
                return new C57370av();
            case 5:
                return f153268b;
            case 6:
                C63010eb ebVar = f153269d;
                if (ebVar == null) {
                    synchronized (C57371aw.class) {
                        ebVar = f153269d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153268b);
                            f153269d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
