package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.so */
/* compiled from: PG */
public final class C88192so extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88192so f238403d;

    /* renamed from: e */
    private static volatile C63010eb f238404e;

    /* renamed from: a */
    public int f238405a;

    /* renamed from: b */
    public C63088z f238406b = C63088z.f170246b;

    /* renamed from: c */
    public long f238407c;

    static {
        C88192so soVar = new C88192so();
        f238403d = soVar;
        C62942bv.registerDefaultInstance(C88192so.class, soVar);
    }

    private C88192so() {
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
                return newMessageInfo(f238403d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88192so();
            case 4:
                return new C88191sn();
            case 5:
                return f238403d;
            case 6:
                C63010eb ebVar = f238404e;
                if (ebVar == null) {
                    synchronized (C88192so.class) {
                        ebVar = f238404e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238403d);
                            f238404e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
