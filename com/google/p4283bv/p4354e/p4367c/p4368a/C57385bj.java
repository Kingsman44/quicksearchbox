package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.bj */
/* compiled from: PG */
public final class C57385bj extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C57385bj f153294a;

    /* renamed from: c */
    private static volatile C63010eb f153295c;

    /* renamed from: b */
    private byte f153296b = 2;

    static {
        C57385bj bjVar = new C57385bj();
        f153294a = bjVar;
        C62942bv.registerDefaultInstance(C57385bj.class, bjVar);
    }

    private C57385bj() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153296b);
            case 1:
                this.f153296b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f153294a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C57385bj();
            case 4:
                return new C57384bi();
            case 5:
                return f153294a;
            case 6:
                C63010eb ebVar = f153295c;
                if (ebVar == null) {
                    synchronized (C57385bj.class) {
                        ebVar = f153295c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153294a);
                            f153295c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
