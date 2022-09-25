package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.amt */
/* compiled from: PG */
public final class amt extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final amt f135394e;

    /* renamed from: f */
    private static volatile C63010eb f135395f;

    /* renamed from: a */
    public int f135396a;

    /* renamed from: b */
    public C62971cq f135397b = emptyProtobufList();

    /* renamed from: c */
    public int f135398c;

    /* renamed from: d */
    public boolean f135399d;

    static {
        amt amt = new amt();
        f135394e = amt;
        C62942bv.registerDefaultInstance(amt.class, amt);
    }

    private amt() {
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
                return newMessageInfo(f135394e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002င\u0000\u0003ဇ\u0001", new Object[]{"a", "b", ams.class, C45240c.f118157a, "d"});
            case 3:
                return new amt();
            case 4:
                return new amq();
            case 5:
                return f135394e;
            case 6:
                C63010eb ebVar = f135395f;
                if (ebVar == null) {
                    synchronized (amt.class) {
                        ebVar = f135395f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135394e);
                            f135395f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
