package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.aw */
/* compiled from: PG */
public final class C54319aw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54319aw f142692b;

    /* renamed from: c */
    private static volatile C63010eb f142693c;

    /* renamed from: a */
    public C62971cq f142694a = emptyProtobufList();

    static {
        C54319aw awVar = new C54319aw();
        f142692b = awVar;
        C62942bv.registerDefaultInstance(C54319aw.class, awVar);
    }

    private C54319aw() {
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
                return newMessageInfo(f142692b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54318av.class});
            case 3:
                return new C54319aw();
            case 4:
                return new C54316at();
            case 5:
                return f142692b;
            case 6:
                C63010eb ebVar = f142693c;
                if (ebVar == null) {
                    synchronized (C54319aw.class) {
                        ebVar = f142693c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142692b);
                            f142693c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
