package com.google.assistant.p3897e.p3921j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yj */
/* compiled from: PG */
public final class C52617yj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52617yj f138146b;

    /* renamed from: c */
    private static volatile C63010eb f138147c;

    /* renamed from: a */
    public C62971cq f138148a = emptyProtobufList();

    static {
        C52617yj yjVar = new C52617yj();
        f138146b = yjVar;
        C62942bv.registerDefaultInstance(C52617yj.class, yjVar);
    }

    private C52617yj() {
    }

    /* renamed from: a */
    public final void mo53887a() {
        C62971cq cqVar = this.f138148a;
        if (!cqVar.mo58948c()) {
            this.f138148a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f138146b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C52633yz.class});
            case 3:
                return new C52617yj();
            case 4:
                return new C52616yi();
            case 5:
                return f138146b;
            case 6:
                C63010eb ebVar = f138147c;
                if (ebVar == null) {
                    synchronized (C52617yj.class) {
                        ebVar = f138147c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138146b);
                            f138147c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
