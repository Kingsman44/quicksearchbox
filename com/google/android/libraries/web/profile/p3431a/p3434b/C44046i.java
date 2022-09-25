package com.google.android.libraries.web.profile.p3431a.p3434b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.web.profile.a.b.i */
/* compiled from: PG */
public final class C44046i extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C44046i f114685d;

    /* renamed from: e */
    private static volatile C63010eb f114686e;

    /* renamed from: a */
    public int f114687a;

    /* renamed from: b */
    public int f114688b;

    /* renamed from: c */
    public int f114689c;

    static {
        C44046i iVar = new C44046i();
        f114685d = iVar;
        C62942bv.registerDefaultInstance(C44046i.class, iVar);
    }

    private C44046i() {
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
                return newMessageInfo(f114685d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C44050m.m77774b(), C45240c.f118157a, C44044g.m77769b()});
            case 3:
                return new C44046i();
            case 4:
                return new C44045h();
            case 5:
                return f114685d;
            case 6:
                C63010eb ebVar = f114686e;
                if (ebVar == null) {
                    synchronized (C44046i.class) {
                        ebVar = f114686e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f114685d);
                            f114686e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
