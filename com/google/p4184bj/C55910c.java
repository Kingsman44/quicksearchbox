package com.google.p4184bj;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.bj.c */
/* compiled from: PG */
public final class C55910c extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C55910c f148770a;

    /* renamed from: g */
    private static volatile C63010eb f148771g;

    /* renamed from: b */
    private int f148772b;

    /* renamed from: c */
    private C60220t f148773c;

    /* renamed from: d */
    private C60220t f148774d;

    /* renamed from: e */
    private C63771b f148775e;

    /* renamed from: f */
    private byte f148776f = 2;

    static {
        C55910c cVar = new C55910c();
        f148770a = cVar;
        C62942bv.registerDefaultInstance(C55910c.class, cVar);
    }

    private C55910c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f148776f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f148776f = b;
                return null;
            case 2:
                return newMessageInfo(f148770a, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0003\u0001ᐉ\u0005\u0002ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "e", C45240c.f118157a, "d"});
            case 3:
                return new C55910c();
            case 4:
                return new C55867b();
            case 5:
                return f148770a;
            case 6:
                C63010eb ebVar = f148771g;
                if (ebVar == null) {
                    synchronized (C55910c.class) {
                        ebVar = f148771g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148770a);
                            f148771g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
