package com.google.p4283bv.p4354e.p4356b.p4365c.p4366a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bv.e.b.c.a.cn */
/* compiled from: PG */
public final class C57286cn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57286cn f152926b;

    /* renamed from: c */
    public static final C62940bt f152927c;

    /* renamed from: d */
    private static volatile C63010eb f152928d;

    /* renamed from: a */
    public C62971cq f152929a = emptyProtobufList();

    static {
        C57286cn cnVar = new C57286cn();
        f152926b = cnVar;
        C62942bv.registerDefaultInstance(C57286cn.class, cnVar);
        f152927c = C62942bv.newSingularGeneratedExtension(C57262bq.f152860f, cnVar, cnVar, (C62958ce) null, 451141338, C63066gd.MESSAGE, C57286cn.class);
    }

    private C57286cn() {
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
                return newMessageInfo(f152926b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57285cm.class});
            case 3:
                return new C57286cn();
            case 4:
                return new C57283ck();
            case 5:
                return f152926b;
            case 6:
                C63010eb ebVar = f152928d;
                if (ebVar == null) {
                    synchronized (C57286cn.class) {
                        ebVar = f152928d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152926b);
                            f152928d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
