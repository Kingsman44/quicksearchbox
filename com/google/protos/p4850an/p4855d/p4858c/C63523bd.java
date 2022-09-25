package com.google.protos.p4850an.p4855d.p4858c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4850an.C63389bg;

/* renamed from: com.google.protos.an.d.c.bd */
/* compiled from: PG */
public final class C63523bd extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63523bd f171817a;

    /* renamed from: e */
    private static volatile C63010eb f171818e;

    /* renamed from: b */
    private int f171819b;

    /* renamed from: c */
    private C63389bg f171820c;

    /* renamed from: d */
    private byte f171821d = 2;

    static {
        C63523bd bdVar = new C63523bd();
        f171817a = bdVar;
        C62942bv.registerDefaultInstance(C63523bd.class, bdVar);
    }

    private C63523bd() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171821d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171821d = b;
                return null;
            case 2:
                return newMessageInfo(f171817a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63523bd();
            case 4:
                return new C63522bc();
            case 5:
                return f171817a;
            case 6:
                C63010eb ebVar = f171818e;
                if (ebVar == null) {
                    synchronized (C63523bd.class) {
                        ebVar = f171818e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171817a);
                            f171818e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
