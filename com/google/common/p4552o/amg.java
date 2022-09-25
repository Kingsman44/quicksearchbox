package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.amg */
/* compiled from: PG */
public final class amg extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final amg f159140f;

    /* renamed from: h */
    private static volatile C63010eb f159141h;

    /* renamed from: a */
    public int f159142a;

    /* renamed from: b */
    public int f159143b;

    /* renamed from: c */
    public ame f159144c;

    /* renamed from: d */
    public int f159145d;

    /* renamed from: e */
    public int f159146e;

    /* renamed from: g */
    private byte f159147g = 2;

    static {
        amg amg = new amg();
        f159140f = amg;
        C62942bv.registerDefaultInstance(amg.class, amg);
    }

    private amg() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f159147g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f159147g = b;
                return null;
            case 2:
                return newMessageInfo(f159140f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001င\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new amg();
            case 4:
                return new amf();
            case 5:
                return f159140f;
            case 6:
                C63010eb ebVar = f159141h;
                if (ebVar == null) {
                    synchronized (amg.class) {
                        ebVar = f159141h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f159140f);
                            f159141h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
