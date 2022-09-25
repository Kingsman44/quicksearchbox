package com.google.p4500cm.p4501a.p4508c.p4509a.p4510a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.cm.a.c.a.a.l */
/* compiled from: PG */
public final class C58160l extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C58160l f155495b;

    /* renamed from: c */
    private static volatile C63010eb f155496c;

    /* renamed from: a */
    public C62971cq f155497a = emptyProtobufList();

    static {
        C58160l lVar = new C58160l();
        f155495b = lVar;
        C62942bv.registerDefaultInstance(C58160l.class, lVar);
    }

    private C58160l() {
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
                return newMessageInfo(f155495b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C58159k.class});
            case 3:
                return new C58160l();
            case 4:
                return new C58157i();
            case 5:
                return f155495b;
            case 6:
                C63010eb ebVar = f155496c;
                if (ebVar == null) {
                    synchronized (C58160l.class) {
                        ebVar = f155496c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f155495b);
                            f155496c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
