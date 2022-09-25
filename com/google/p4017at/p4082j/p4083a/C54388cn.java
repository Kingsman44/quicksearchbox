package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.cn */
/* compiled from: PG */
public final class C54388cn extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54388cn f142853d;

    /* renamed from: e */
    private static volatile C63010eb f142854e;

    /* renamed from: a */
    public int f142855a = 0;

    /* renamed from: b */
    public Object f142856b;

    /* renamed from: c */
    public boolean f142857c;

    static {
        C54388cn cnVar = new C54388cn();
        f142853d = cnVar;
        C62942bv.registerDefaultInstance(C54388cn.class, cnVar);
    }

    private C54388cn() {
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
                return newMessageInfo(f142853d, "\u0000\u0003\u0001\u0000\u0002\u0005\u0003\u0000\u0000\u0000\u0002<\u0000\u0003<\u0000\u0005\u0007", new Object[]{"b", "a", C54385ck.class, C54387cm.class, C45240c.f118157a});
            case 3:
                return new C54388cn();
            case 4:
                return new C54383ci();
            case 5:
                return f142853d;
            case 6:
                C63010eb ebVar = f142854e;
                if (ebVar == null) {
                    synchronized (C54388cn.class) {
                        ebVar = f142854e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142853d);
                            f142854e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
