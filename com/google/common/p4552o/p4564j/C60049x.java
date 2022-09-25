package com.google.common.p4552o.p4564j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.j.x */
/* compiled from: PG */
public final class C60049x extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C60049x f162303a;

    /* renamed from: e */
    private static volatile C63010eb f162304e;

    /* renamed from: b */
    private int f162305b;

    /* renamed from: c */
    private C60031f f162306c;

    /* renamed from: d */
    private byte f162307d = 2;

    static {
        C60049x xVar = new C60049x();
        f162303a = xVar;
        C62942bv.registerDefaultInstance(C60049x.class, xVar);
    }

    private C60049x() {
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162307d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f162307d = b;
                return null;
            case 2:
                return newMessageInfo(f162303a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C60049x();
            case 4:
                return new C60048w();
            case 5:
                return f162303a;
            case 6:
                C63010eb ebVar = f162304e;
                if (ebVar == null) {
                    synchronized (C60049x.class) {
                        ebVar = f162304e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162303a);
                            f162304e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
