package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.assistant.p3897e.p3921j.C51785da;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.bm */
/* compiled from: PG */
public final class C119818bm extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C119818bm f333734b;

    /* renamed from: c */
    private static volatile C63010eb f333735c;

    /* renamed from: a */
    public C62971cq f333736a = emptyProtobufList();

    static {
        C119818bm bmVar = new C119818bm();
        f333734b = bmVar;
        C62942bv.registerDefaultInstance(C119818bm.class, bmVar);
    }

    private C119818bm() {
    }

    /* renamed from: a */
    public final void mo104530a() {
        C62971cq cqVar = this.f333736a;
        if (!cqVar.mo58948c()) {
            this.f333736a = C62942bv.mutableCopy(cqVar);
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
                return newMessageInfo(f333734b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C51785da.class});
            case 3:
                return new C119818bm();
            case 4:
                return new C119817bl();
            case 5:
                return f333734b;
            case 6:
                C63010eb ebVar = f333735c;
                if (ebVar == null) {
                    synchronized (C119818bm.class) {
                        ebVar = f333735c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333734b);
                            f333735c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
