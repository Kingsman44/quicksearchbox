package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.aa */
/* compiled from: PG */
public final class C123707aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C123707aa f341680d;

    /* renamed from: e */
    private static volatile C63010eb f341681e;

    /* renamed from: a */
    public int f341682a;

    /* renamed from: b */
    public C52395qd f341683b;

    /* renamed from: c */
    public C52395qd f341684c;

    static {
        C123707aa aaVar = new C123707aa();
        f341680d = aaVar;
        C62942bv.registerDefaultInstance(C123707aa.class, aaVar);
    }

    private C123707aa() {
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
                return newMessageInfo(f341680d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C123707aa();
            case 4:
                return new C123797z();
            case 5:
                return f341680d;
            case 6:
                C63010eb ebVar = f341681e;
                if (ebVar == null) {
                    synchronized (C123707aa.class) {
                        ebVar = f341681e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341680d);
                            f341681e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
