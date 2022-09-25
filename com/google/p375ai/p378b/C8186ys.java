package com.google.p375ai.p378b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ys */
/* compiled from: PG */
public final class C8186ys extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C8186ys f28759e;

    /* renamed from: f */
    private static volatile C63010eb f28760f;

    /* renamed from: a */
    public int f28761a;

    /* renamed from: b */
    public C7805kp f28762b;

    /* renamed from: c */
    public C8185yr f28763c;

    /* renamed from: d */
    public C62971cq f28764d = emptyProtobufList();

    static {
        C8186ys ysVar = new C8186ys();
        f28759e = ysVar;
        C62942bv.registerDefaultInstance(C8186ys.class, ysVar);
    }

    private C8186ys() {
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
                return newMessageInfo(f28759e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0007ဉ\u0002", new Object[]{"a", "b", "d", C8185yr.class, C45240c.f118157a});
            case 3:
                return new C8186ys();
            case 4:
                return new C8179yl();
            case 5:
                return f28759e;
            case 6:
                C63010eb ebVar = f28760f;
                if (ebVar == null) {
                    synchronized (C8186ys.class) {
                        ebVar = f28760f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28759e);
                            f28760f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
