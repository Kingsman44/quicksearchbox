package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.cj */
/* compiled from: PG */
public final class C123770cj extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123770cj f341899b;

    /* renamed from: c */
    private static volatile C63010eb f341900c;

    /* renamed from: a */
    public C62971cq f341901a = emptyProtobufList();

    static {
        C123770cj cjVar = new C123770cj();
        f341899b = cjVar;
        C62942bv.registerDefaultInstance(C123770cj.class, cjVar);
    }

    private C123770cj() {
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
                return newMessageInfo(f341899b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C123768ch.class});
            case 3:
                return new C123770cj();
            case 4:
                return new C123769ci();
            case 5:
                return f341899b;
            case 6:
                C63010eb ebVar = f341900c;
                if (ebVar == null) {
                    synchronized (C123770cj.class) {
                        ebVar = f341900c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341899b);
                            f341900c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
