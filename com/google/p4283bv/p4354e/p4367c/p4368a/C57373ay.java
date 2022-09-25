package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ay */
/* compiled from: PG */
public final class C57373ay extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57373ay f153272b;

    /* renamed from: d */
    private static volatile C63010eb f153273d;

    /* renamed from: a */
    public C62971cq f153274a = emptyProtobufList();

    /* renamed from: c */
    private byte f153275c = 2;

    static {
        C57373ay ayVar = new C57373ay();
        f153272b = ayVar;
        C62942bv.registerDefaultInstance(C57373ay.class, ayVar);
    }

    private C57373ay() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153275c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153275c = b;
                return null;
            case 2:
                return newMessageInfo(f153272b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57362an.class});
            case 3:
                return new C57373ay();
            case 4:
                return new C57372ax();
            case 5:
                return f153272b;
            case 6:
                C63010eb ebVar = f153273d;
                if (ebVar == null) {
                    synchronized (C57373ay.class) {
                        ebVar = f153273d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153272b);
                            f153273d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
