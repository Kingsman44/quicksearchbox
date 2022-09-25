package com.google.protos.p4895aw.p4896a.p4897a.p4898a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.a.a.a.o */
/* compiled from: PG */
public final class C63951o extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C63951o f172948b;

    /* renamed from: d */
    private static volatile C63010eb f172949d;

    /* renamed from: a */
    public C62971cq f172950a = emptyProtobufList();

    /* renamed from: c */
    private byte f172951c = 2;

    static {
        C63951o oVar = new C63951o();
        f172948b = oVar;
        C62942bv.registerDefaultInstance(C63951o.class, oVar);
    }

    private C63951o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172951c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172951c = b;
                return null;
            case 2:
                return newMessageInfo(f172948b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C63949m.class});
            case 3:
                return new C63951o();
            case 4:
                return new C63950n();
            case 5:
                return f172948b;
            case 6:
                C63010eb ebVar = f172949d;
                if (ebVar == null) {
                    synchronized (C63951o.class) {
                        ebVar = f172949d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172948b);
                            f172949d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
