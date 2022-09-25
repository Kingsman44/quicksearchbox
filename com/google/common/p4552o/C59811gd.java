package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.gd */
/* compiled from: PG */
public final class C59811gd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59811gd f161636e;

    /* renamed from: g */
    private static volatile C63010eb f161637g;

    /* renamed from: a */
    public int f161638a;

    /* renamed from: b */
    public C59694ci f161639b;

    /* renamed from: c */
    public C62971cq f161640c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f161641d = emptyProtobufList();

    /* renamed from: f */
    private byte f161642f = 2;

    static {
        C59811gd gdVar = new C59811gd();
        f161636e = gdVar;
        C62942bv.registerDefaultInstance(C59811gd.class, gdVar);
    }

    private C59811gd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f161642f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f161642f = b;
                return null;
            case 2:
                return newMessageInfo(f161636e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0001\u0001ᐉ\u0000\u0002\u001b\u0003\u001b", new Object[]{"a", "b", C45240c.f118157a, C59810gc.class, "d", C59770f.class});
            case 3:
                return new C59811gd();
            case 4:
                return new C59808ga();
            case 5:
                return f161636e;
            case 6:
                C63010eb ebVar = f161637g;
                if (ebVar == null) {
                    synchronized (C59811gd.class) {
                        ebVar = f161637g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161636e);
                            f161637g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
