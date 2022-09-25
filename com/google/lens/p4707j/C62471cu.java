package com.google.lens.p4707j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.cu */
/* compiled from: PG */
public final class C62471cu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62471cu f168676c;

    /* renamed from: d */
    private static volatile C63010eb f168677d;

    /* renamed from: a */
    public int f168678a = 0;

    /* renamed from: b */
    public Object f168679b;

    static {
        C62471cu cuVar = new C62471cu();
        f168676c = cuVar;
        C62942bv.registerDefaultInstance(C62471cu.class, cuVar);
    }

    private C62471cu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f168676c, "\u0001\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000\u0006ြ\u0000\u0007ြ\u0000", new Object[]{"b", "a", C62459ci.class, C62470ct.class, C62468cr.class, C62457cg.class, C62466cp.class, C62464cn.class, C62461ck.class});
            case 3:
                return new C62471cu();
            case 4:
                return new C62455ce();
            case 5:
                return f168676c;
            case 6:
                C63010eb ebVar = f168677d;
                if (ebVar == null) {
                    synchronized (C62471cu.class) {
                        ebVar = f168677d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168676c);
                            f168677d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
