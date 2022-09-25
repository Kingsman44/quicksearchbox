package com.google.p374ah;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ah.d */
/* compiled from: PG */
public final class C7502d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7502d f24717d;

    /* renamed from: f */
    private static volatile C63010eb f24718f;

    /* renamed from: a */
    public int f24719a;

    /* renamed from: b */
    public C7500b f24720b;

    /* renamed from: c */
    public C62971cq f24721c = emptyProtobufList();

    /* renamed from: e */
    private byte f24722e = 2;

    static {
        C7502d dVar = new C7502d();
        f24717d = dVar;
        C62942bv.registerDefaultInstance(C7502d.class, dVar);
    }

    private C7502d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f24722e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f24722e = b;
                return null;
            case 2:
                return newMessageInfo(f24717d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"a", "b", C45240c.f118157a, C7507i.class});
            case 3:
                return new C7502d();
            case 4:
                return new C7501c();
            case 5:
                return f24717d;
            case 6:
                C63010eb ebVar = f24718f;
                if (ebVar == null) {
                    synchronized (C7502d.class) {
                        ebVar = f24718f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f24717d);
                            f24718f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
