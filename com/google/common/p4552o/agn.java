package com.google.common.p4552o;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agn */
/* compiled from: PG */
public final class agn extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final agn f158655c;

    /* renamed from: d */
    private static volatile C63010eb f158656d;

    /* renamed from: a */
    public C62971cq f158657a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f158658b = emptyProtobufList();

    static {
        agn agn = new agn();
        f158655c = agn;
        C62942bv.registerDefaultInstance(agn.class, agn);
    }

    private agn() {
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
                return newMessageInfo(f158655c, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001b\u0002\u001b", new Object[]{"a", agj.class, "b", agm.class});
            case 3:
                return new agn();
            case 4:
                return new agk();
            case 5:
                return f158655c;
            case 6:
                C63010eb ebVar = f158656d;
                if (ebVar == null) {
                    synchronized (agn.class) {
                        ebVar = f158656d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158655c);
                            f158656d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
