package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.r */
/* compiled from: PG */
public final class C49341r extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49341r f127536b;

    /* renamed from: c */
    private static volatile C63010eb f127537c;

    /* renamed from: a */
    public C62971cq f127538a = emptyProtobufList();

    static {
        C49341r rVar = new C49341r();
        f127536b = rVar;
        C62942bv.registerDefaultInstance(C49341r.class, rVar);
    }

    private C49341r() {
    }

    /* renamed from: a */
    public final void mo53235a() {
        C62971cq cqVar = this.f127538a;
        if (!cqVar.mo58948c()) {
            this.f127538a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f127536b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49339p.class});
            case 3:
                return new C49341r();
            case 4:
                return new C49340q();
            case 5:
                return f127536b;
            case 6:
                C63010eb ebVar = f127537c;
                if (ebVar == null) {
                    synchronized (C49341r.class) {
                        ebVar = f127537c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127536b);
                            f127537c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
