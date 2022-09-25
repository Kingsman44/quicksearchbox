package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.n */
/* compiled from: PG */
public final class C51581n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C51581n f134439b;

    /* renamed from: c */
    private static volatile C63010eb f134440c;

    /* renamed from: a */
    public C62971cq f134441a = emptyProtobufList();

    static {
        C51581n nVar = new C51581n();
        f134439b = nVar;
        C62942bv.registerDefaultInstance(C51581n.class, nVar);
    }

    private C51581n() {
    }

    /* renamed from: a */
    public final void mo53645a() {
        C62971cq cqVar = this.f134441a;
        if (!cqVar.mo58948c()) {
            this.f134441a = C62942bv.mutableCopy(cqVar);
        }
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
                return newMessageInfo(f134439b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51626p.class});
            case 3:
                return new C51581n();
            case 4:
                return new C51554m();
            case 5:
                return f134439b;
            case 6:
                C63010eb ebVar = f134440c;
                if (ebVar == null) {
                    synchronized (C51581n.class) {
                        ebVar = f134440c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134439b);
                            f134440c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
