package com.google.p5234t;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.t.e */
/* compiled from: PG */
public final class C67483e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67483e f183415b;

    /* renamed from: c */
    private static volatile C63010eb f183416c;

    /* renamed from: a */
    public C62971cq f183417a = emptyProtobufList();

    static {
        C67483e eVar = new C67483e();
        f183415b = eVar;
        C62942bv.registerDefaultInstance(C67483e.class, eVar);
    }

    private C67483e() {
    }

    /* renamed from: a */
    public final void mo59876a() {
        C62971cq cqVar = this.f183417a;
        if (!cqVar.mo58948c()) {
            this.f183417a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f183415b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C67481c.class});
            case 3:
                return new C67483e();
            case 4:
                return new C67482d();
            case 5:
                return f183415b;
            case 6:
                C63010eb ebVar = f183416c;
                if (ebVar == null) {
                    synchronized (C67483e.class) {
                        ebVar = f183416c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183415b);
                            f183416c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
