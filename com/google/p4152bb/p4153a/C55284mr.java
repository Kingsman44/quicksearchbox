package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.mr */
/* compiled from: PG */
public final class C55284mr extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55284mr f145622c;

    /* renamed from: d */
    public static final C62940bt f145623d;

    /* renamed from: f */
    private static volatile C63010eb f145624f;

    /* renamed from: a */
    public int f145625a;

    /* renamed from: b */
    public int f145626b;

    /* renamed from: e */
    private int f145627e;

    static {
        C55284mr mrVar = new C55284mr();
        f145622c = mrVar;
        C62942bv.registerDefaultInstance(C55284mr.class, mrVar);
        f145623d = C62942bv.newSingularGeneratedExtension(C55240la.f145449k, mrVar, mrVar, (C62958ce) null, 76262310, C63066gd.MESSAGE, C55284mr.class);
    }

    private C55284mr() {
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
                return newMessageInfo(f145622c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"e", "a", "b"});
            case 3:
                return new C55284mr();
            case 4:
                return new C55283mq();
            case 5:
                return f145622c;
            case 6:
                C63010eb ebVar = f145624f;
                if (ebVar == null) {
                    synchronized (C55284mr.class) {
                        ebVar = f145624f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145622c);
                            f145624f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
