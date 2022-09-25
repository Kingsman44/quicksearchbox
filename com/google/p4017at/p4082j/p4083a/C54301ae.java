package com.google.p4017at.p4082j.p4083a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.ae */
/* compiled from: PG */
public final class C54301ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54301ae f142657d;

    /* renamed from: e */
    private static volatile C63010eb f142658e;

    /* renamed from: a */
    public C62971cq f142659a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public boolean f142660b;

    /* renamed from: c */
    public C62971cq f142661c = C62942bv.emptyProtobufList();

    static {
        C54301ae aeVar = new C54301ae();
        f142657d = aeVar;
        C62942bv.registerDefaultInstance(C54301ae.class, aeVar);
    }

    private C54301ae() {
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
                return newMessageInfo(f142657d, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0002\u0000\u0001Ț\u0002\u0007\u0004Ț", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54301ae();
            case 4:
                return new C54300ad();
            case 5:
                return f142657d;
            case 6:
                C63010eb ebVar = f142658e;
                if (ebVar == null) {
                    synchronized (C54301ae.class) {
                        ebVar = f142658e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142657d);
                            f142658e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
