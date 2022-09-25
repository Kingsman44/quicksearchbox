package com.google.protos.p5129p.p5131b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.p.b.bn */
/* compiled from: PG */
public final class C65783bn extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C65783bn f178829b;

    /* renamed from: d */
    private static volatile C63010eb f178830d;

    /* renamed from: a */
    public C62971cq f178831a = emptyProtobufList();

    /* renamed from: c */
    private byte f178832c = 2;

    static {
        C65783bn bnVar = new C65783bn();
        f178829b = bnVar;
        C62942bv.registerDefaultInstance(C65783bn.class, bnVar);
    }

    private C65783bn() {
    }

    /* renamed from: a */
    public final void mo59426a() {
        C62971cq cqVar = this.f178831a;
        if (!cqVar.mo58948c()) {
            this.f178831a = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178832c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178832c = b;
                return null;
            case 2:
                return newMessageInfo(f178829b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C65780bk.class});
            case 3:
                return new C65783bn();
            case 4:
                return new C65782bm();
            case 5:
                return f178829b;
            case 6:
                C63010eb ebVar = f178830d;
                if (ebVar == null) {
                    synchronized (C65783bn.class) {
                        ebVar = f178830d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178829b);
                            f178830d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
