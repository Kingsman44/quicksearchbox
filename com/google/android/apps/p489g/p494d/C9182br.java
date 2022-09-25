package com.google.android.apps.p489g.p494d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.br */
/* compiled from: PG */
public final class C9182br extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9182br f31705e;

    /* renamed from: g */
    private static volatile C63010eb f31706g;

    /* renamed from: a */
    public int f31707a;

    /* renamed from: b */
    public C62971cq f31708b = emptyProtobufList();

    /* renamed from: c */
    public int f31709c;

    /* renamed from: d */
    public int f31710d;

    /* renamed from: f */
    private byte f31711f = 2;

    static {
        C9182br brVar = new C9182br();
        f31705e = brVar;
        C62942bv.registerDefaultInstance(C9182br.class, brVar);
    }

    private C9182br() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31711f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31711f = b;
                return null;
            case 2:
                return newMessageInfo(f31705e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003င\u0001", new Object[]{"a", "b", C9218d.class, C45240c.f118157a, "d"});
            case 3:
                return new C9182br();
            case 4:
                return new C9181bq();
            case 5:
                return f31705e;
            case 6:
                C63010eb ebVar = f31706g;
                if (ebVar == null) {
                    synchronized (C9182br.class) {
                        ebVar = f31706g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31705e);
                            f31706g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
