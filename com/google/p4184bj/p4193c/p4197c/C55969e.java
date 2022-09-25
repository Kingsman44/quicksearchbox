package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4184bj.p4193c.p4194a.C55912b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.e */
/* compiled from: PG */
public final class C55969e extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55969e f149044e;

    /* renamed from: f */
    private static volatile C63010eb f149045f;

    /* renamed from: a */
    public int f149046a;

    /* renamed from: b */
    public int f149047b;

    /* renamed from: c */
    public int f149048c;

    /* renamed from: d */
    public int f149049d;

    static {
        C55969e eVar = new C55969e();
        f149044e = eVar;
        C62942bv.registerDefaultInstance(C55969e.class, eVar);
    }

    private C55969e() {
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
                return newMessageInfo(f149044e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003င\u0002", new Object[]{"a", "b", C55960bg.m87869b(), C45240c.f118157a, C55912b.m87802b(), "d"});
            case 3:
                return new C55969e();
            case 4:
                return new C55968d();
            case 5:
                return f149044e;
            case 6:
                C63010eb ebVar = f149045f;
                if (ebVar == null) {
                    synchronized (C55969e.class) {
                        ebVar = f149045f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149044e);
                            f149045f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
