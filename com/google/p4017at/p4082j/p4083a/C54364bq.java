package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bq */
/* compiled from: PG */
public final class C54364bq extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54364bq f142808b;

    /* renamed from: c */
    private static volatile C63010eb f142809c;

    /* renamed from: a */
    public C62971cq f142810a = emptyProtobufList();

    static {
        C54364bq bqVar = new C54364bq();
        f142808b = bqVar;
        C62942bv.registerDefaultInstance(C54364bq.class, bqVar);
    }

    private C54364bq() {
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
                return newMessageInfo(f142808b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54455t.class});
            case 3:
                return new C54364bq();
            case 4:
                return new C54363bp();
            case 5:
                return f142808b;
            case 6:
                C63010eb ebVar = f142809c;
                if (ebVar == null) {
                    synchronized (C54364bq.class) {
                        ebVar = f142809c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142808b);
                            f142809c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
