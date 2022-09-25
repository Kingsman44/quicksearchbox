package com.google.p4744p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.p.j */
/* compiled from: PG */
public final class C62880j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62880j f169777d;

    /* renamed from: e */
    private static volatile C63010eb f169778e;

    /* renamed from: a */
    public int f169779a;

    /* renamed from: b */
    public int f169780b;

    /* renamed from: c */
    public int f169781c;

    static {
        C62880j jVar = new C62880j();
        f169777d = jVar;
        C62942bv.registerDefaultInstance(C62880j.class, jVar);
    }

    private C62880j() {
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
                return newMessageInfo(f169777d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\u000b\u0003\u000b", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C62880j();
            case 4:
                return new C62879i();
            case 5:
                return f169777d;
            case 6:
                C63010eb ebVar = f169778e;
                if (ebVar == null) {
                    synchronized (C62880j.class) {
                        ebVar = f169778e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169777d);
                            f169778e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
