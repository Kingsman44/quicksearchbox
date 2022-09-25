package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.agv */
/* compiled from: PG */
public final class agv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final agv f129263d;

    /* renamed from: e */
    private static volatile C63010eb f129264e;

    /* renamed from: a */
    public int f129265a;

    /* renamed from: b */
    public C62971cq f129266b = emptyProtobufList();

    /* renamed from: c */
    public long f129267c;

    static {
        agv agv = new agv();
        f129263d = agv;
        C62942bv.registerDefaultInstance(agv.class, agv);
    }

    private agv() {
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f129263d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0001\u0000\u0001\u001b\u0003ဂ\u0000", new Object[]{"a", "b", agx.class, C45240c.f118157a});
            case 3:
                return new agv();
            case 4:
                return new agu();
            case 5:
                return f129263d;
            case 6:
                C63010eb ebVar = f129264e;
                if (ebVar == null) {
                    synchronized (agv.class) {
                        ebVar = f129264e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129263d);
                            f129264e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
