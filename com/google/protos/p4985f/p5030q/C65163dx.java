package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.dx */
/* compiled from: PG */
public final class C65163dx extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65163dx f176352b;

    /* renamed from: d */
    private static volatile C63010eb f176353d;

    /* renamed from: a */
    public C62971cq f176354a = emptyProtobufList();

    /* renamed from: c */
    private byte f176355c = 2;

    static {
        C65163dx dxVar = new C65163dx();
        f176352b = dxVar;
        C62942bv.registerDefaultInstance(C65163dx.class, dxVar);
    }

    private C65163dx() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f176355c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f176355c = b;
                return null;
            case 2:
                return newMessageInfo(f176352b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65165dz.class});
            case 3:
                return new C65163dx();
            case 4:
                return new C65162dw();
            case 5:
                return f176352b;
            case 6:
                C63010eb ebVar = f176353d;
                if (ebVar == null) {
                    synchronized (C65163dx.class) {
                        ebVar = f176353d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176352b);
                            f176353d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
