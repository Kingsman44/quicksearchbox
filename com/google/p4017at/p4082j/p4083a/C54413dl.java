package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.dl */
/* compiled from: PG */
public final class C54413dl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54413dl f142906d;

    /* renamed from: e */
    private static volatile C63010eb f142907e;

    /* renamed from: a */
    public C62971cq f142908a = emptyProtobufList();

    /* renamed from: b */
    public C62971cq f142909b = emptyProtobufList();

    /* renamed from: c */
    public C54388cn f142910c;

    static {
        C54413dl dlVar = new C54413dl();
        f142906d = dlVar;
        C62942bv.registerDefaultInstance(C54413dl.class, dlVar);
    }

    private C54413dl() {
        emptyProtobufList();
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
                return newMessageInfo(f142906d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u001b\u0003\t", new Object[]{"a", C54409dh.class, "b", C54412dk.class, C45240c.f118157a});
            case 3:
                return new C54413dl();
            case 4:
                return new C54410di();
            case 5:
                return f142906d;
            case 6:
                C63010eb ebVar = f142907e;
                if (ebVar == null) {
                    synchronized (C54413dl.class) {
                        ebVar = f142907e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142906d);
                            f142907e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
