package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a.C64311bc;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.ad */
/* compiled from: PG */
public final class C123710ad extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123710ad f341700b;

    /* renamed from: d */
    private static volatile C63010eb f341701d;

    /* renamed from: a */
    public C62971cq f341702a = emptyProtobufList();

    /* renamed from: c */
    private byte f341703c = 2;

    static {
        C123710ad adVar = new C123710ad();
        f341700b = adVar;
        C62942bv.registerDefaultInstance(C123710ad.class, adVar);
    }

    private C123710ad() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341703c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341703c = b;
                return null;
            case 2:
                return newMessageInfo(f341700b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C64311bc.class});
            case 3:
                return new C123710ad();
            case 4:
                return new C123709ac();
            case 5:
                return f341700b;
            case 6:
                C63010eb ebVar = f341701d;
                if (ebVar == null) {
                    synchronized (C123710ad.class) {
                        ebVar = f341701d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341700b);
                            f341701d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
