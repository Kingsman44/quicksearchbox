package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.alh */
/* compiled from: PG */
public final class alh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final alh f135319e;

    /* renamed from: f */
    private static volatile C63010eb f135320f;

    /* renamed from: a */
    public int f135321a;

    /* renamed from: b */
    public int f135322b;

    /* renamed from: c */
    public int f135323c;

    /* renamed from: d */
    public alj f135324d;

    static {
        alh alh = new alh();
        f135319e = alh;
        C62942bv.registerDefaultInstance(alh.class, alh);
    }

    private alh() {
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
                return newMessageInfo(f135319e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new alh();
            case 4:
                return new alg();
            case 5:
                return f135319e;
            case 6:
                C63010eb ebVar = f135320f;
                if (ebVar == null) {
                    synchronized (alh.class) {
                        ebVar = f135320f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135319e);
                            f135320f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
