package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.az */
/* compiled from: PG */
public final class C123732az extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123732az f341771d;

    /* renamed from: e */
    private static volatile C63010eb f341772e;

    /* renamed from: a */
    public int f341773a;

    /* renamed from: b */
    public C63088z f341774b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f341775c = C63088z.f170246b;

    static {
        C123732az azVar = new C123732az();
        f341771d = azVar;
        C62942bv.registerDefaultInstance(C123732az.class, azVar);
    }

    private C123732az() {
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
                return newMessageInfo(f341771d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ည\u0000\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C123732az();
            case 4:
                return new C123731ay();
            case 5:
                return f341771d;
            case 6:
                C63010eb ebVar = f341772e;
                if (ebVar == null) {
                    synchronized (C123732az.class) {
                        ebVar = f341772e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341771d);
                            f341772e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
