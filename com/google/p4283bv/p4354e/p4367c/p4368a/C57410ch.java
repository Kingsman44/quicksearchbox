package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ch */
/* compiled from: PG */
public final class C57410ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57410ch f153373d;

    /* renamed from: f */
    private static volatile C63010eb f153374f;

    /* renamed from: a */
    public C62971cq f153375a = emptyProtobufList();

    /* renamed from: b */
    public int f153376b;

    /* renamed from: c */
    public boolean f153377c;

    /* renamed from: e */
    private int f153378e;

    static {
        C57410ch chVar = new C57410ch();
        f153373d = chVar;
        C62942bv.registerDefaultInstance(C57410ch.class, chVar);
    }

    private C57410ch() {
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
                return newMessageInfo(f153373d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဋ\u0000\u0003ဇ\u0001", new Object[]{"e", "a", C57406cd.class, "b", C45240c.f118157a});
            case 3:
                return new C57410ch();
            case 4:
                return new C57409cg();
            case 5:
                return f153373d;
            case 6:
                C63010eb ebVar = f153374f;
                if (ebVar == null) {
                    synchronized (C57410ch.class) {
                        ebVar = f153374f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153373d);
                            f153374f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
