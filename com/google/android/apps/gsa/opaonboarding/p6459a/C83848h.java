package com.google.android.apps.gsa.opaonboarding.p6459a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.opaonboarding.a.h */
/* compiled from: PG */
public final class C83848h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C83848h f228485e;

    /* renamed from: f */
    private static volatile C63010eb f228486f;

    /* renamed from: a */
    public int f228487a;

    /* renamed from: b */
    public C62971cq f228488b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public int f228489c;

    /* renamed from: d */
    public boolean f228490d;

    static {
        C83848h hVar = new C83848h();
        f228485e = hVar;
        C62942bv.registerDefaultInstance(C83848h.class, hVar);
    }

    private C83848h() {
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
                return newMessageInfo(f228485e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001a\u0002ဌ\u0000\u0003ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a, C83846f.f228484a, "d"});
            case 3:
                return new C83848h();
            case 4:
                return new C83845e();
            case 5:
                return f228485e;
            case 6:
                C63010eb ebVar = f228486f;
                if (ebVar == null) {
                    synchronized (C83848h.class) {
                        ebVar = f228486f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f228485e);
                            f228486f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
