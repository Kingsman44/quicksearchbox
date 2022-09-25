package com.google.p4283bv.p4345d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p375ai.p378b.C7832lp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.d.j */
/* compiled from: PG */
public final class C57031j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57031j f152256d;

    /* renamed from: e */
    private static volatile C63010eb f152257e;

    /* renamed from: a */
    public int f152258a;

    /* renamed from: b */
    public int f152259b;

    /* renamed from: c */
    public C7832lp f152260c;

    static {
        C57031j jVar = new C57031j();
        f152256d = jVar;
        C62942bv.registerDefaultInstance(C57031j.class, jVar);
    }

    private C57031j() {
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
                return newMessageInfo(f152256d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C62722b.m94932b(), C45240c.f118157a});
            case 3:
                return new C57031j();
            case 4:
                return new C57030i();
            case 5:
                return f152256d;
            case 6:
                C63010eb ebVar = f152257e;
                if (ebVar == null) {
                    synchronized (C57031j.class) {
                        ebVar = f152257e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152256d);
                            f152257e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
