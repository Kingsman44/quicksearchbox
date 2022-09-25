package com.google.android.apps.gsa.staticplugins.p7678cl.p7680b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.cl.b.bi */
/* compiled from: PG */
public final class C97910bi extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C97910bi f273370e;

    /* renamed from: f */
    private static volatile C63010eb f273371f;

    /* renamed from: a */
    public int f273372a;

    /* renamed from: b */
    public long f273373b;

    /* renamed from: c */
    public C62971cq f273374c = emptyProtobufList();

    /* renamed from: d */
    public boolean f273375d;

    static {
        C97910bi biVar = new C97910bi();
        f273370e = biVar;
        C62942bv.registerDefaultInstance(C97910bi.class, biVar);
    }

    private C97910bi() {
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
                return newMessageInfo(f273370e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C97920j.class, "d"});
            case 3:
                return new C97910bi();
            case 4:
                return new C97909bh();
            case 5:
                return f273370e;
            case 6:
                C63010eb ebVar = f273371f;
                if (ebVar == null) {
                    synchronized (C97910bi.class) {
                        ebVar = f273371f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f273370e);
                            f273371f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
