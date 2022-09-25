package com.google.assistant.p3825an.p3830c.p3831a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.an.c.a.bl */
/* compiled from: PG */
public final class C49293bl extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49293bl f127401b;

    /* renamed from: c */
    private static volatile C63010eb f127402c;

    /* renamed from: a */
    public C62971cq f127403a = emptyProtobufList();

    static {
        C49293bl blVar = new C49293bl();
        f127401b = blVar;
        C62942bv.registerDefaultInstance(C49293bl.class, blVar);
    }

    private C49293bl() {
    }

    /* renamed from: a */
    public final void mo53230a() {
        C62971cq cqVar = this.f127403a;
        if (!cqVar.mo58948c()) {
            this.f127403a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f127401b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C49267am.class});
            case 3:
                return new C49293bl();
            case 4:
                return new C49292bk();
            case 5:
                return f127401b;
            case 6:
                C63010eb ebVar = f127402c;
                if (ebVar == null) {
                    synchronized (C49293bl.class) {
                        ebVar = f127402c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127401b);
                            f127402c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
