package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qa */
/* compiled from: PG */
public final class C88124qa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88124qa f238228d;

    /* renamed from: e */
    private static volatile C63010eb f238229e;

    /* renamed from: a */
    public int f238230a;

    /* renamed from: b */
    public C63088z f238231b = C63088z.f170246b;

    /* renamed from: c */
    public boolean f238232c;

    static {
        C88124qa qaVar = new C88124qa();
        f238228d = qaVar;
        C62942bv.registerDefaultInstance(C88124qa.class, qaVar);
    }

    private C88124qa() {
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
                return newMessageInfo(f238228d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ည\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88124qa();
            case 4:
                return new C88122pz();
            case 5:
                return f238228d;
            case 6:
                C63010eb ebVar = f238229e;
                if (ebVar == null) {
                    synchronized (C88124qa.class) {
                        ebVar = f238229e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238228d);
                            f238229e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
