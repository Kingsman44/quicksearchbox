package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.i */
/* compiled from: PG */
public final class C55158i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55158i f145207c;

    /* renamed from: f */
    private static volatile C63010eb f145208f;

    /* renamed from: a */
    public C55136he f145209a;

    /* renamed from: b */
    public C62971cq f145210b = emptyProtobufList();

    /* renamed from: d */
    private int f145211d;

    /* renamed from: e */
    private byte f145212e = 2;

    static {
        C55158i iVar = new C55158i();
        f145207c = iVar;
        C62942bv.registerDefaultInstance(C55158i.class, iVar);
    }

    private C55158i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f145212e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f145212e = b;
                return null;
            case 2:
                return newMessageInfo(f145207c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001ᐉ\u0000\u0002Л", new Object[]{"d", "a", "b", C55136he.class});
            case 3:
                return new C55158i();
            case 4:
                return new C55131h();
            case 5:
                return f145207c;
            case 6:
                C63010eb ebVar = f145208f;
                if (ebVar == null) {
                    synchronized (C55158i.class) {
                        ebVar = f145208f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145207c);
                            f145208f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
