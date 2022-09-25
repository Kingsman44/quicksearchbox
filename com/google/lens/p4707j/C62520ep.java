package com.google.lens.p4707j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.ep */
/* compiled from: PG */
public final class C62520ep extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62520ep f168804d;

    /* renamed from: f */
    private static volatile C63010eb f168805f;

    /* renamed from: a */
    public int f168806a;

    /* renamed from: b */
    public C62971cq f168807b = emptyProtobufList();

    /* renamed from: c */
    public int f168808c;

    /* renamed from: e */
    private byte f168809e = 2;

    static {
        C62520ep epVar = new C62520ep();
        f168804d = epVar;
        C62942bv.registerDefaultInstance(C62520ep.class, epVar);
    }

    private C62520ep() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168809e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168809e = b;
                return null;
            case 2:
                return newMessageInfo(f168804d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"a", "b", C62561gc.class, C45240c.f118157a, C62519eo.f168803a});
            case 3:
                return new C62520ep();
            case 4:
                return new C62518en();
            case 5:
                return f168804d;
            case 6:
                C63010eb ebVar = f168805f;
                if (ebVar == null) {
                    synchronized (C62520ep.class) {
                        ebVar = f168805f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168804d);
                            f168805f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
