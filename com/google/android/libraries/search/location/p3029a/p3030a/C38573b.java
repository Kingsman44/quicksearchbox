package com.google.android.libraries.search.location.p3029a.p3030a;

import com.google.android.libraries.search.location.p3029a.C38630bv;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.location.a.a.b */
/* compiled from: PG */
public final class C38573b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38573b f101961d;

    /* renamed from: e */
    private static volatile C63010eb f101962e;

    /* renamed from: a */
    public int f101963a;

    /* renamed from: b */
    public long f101964b;

    /* renamed from: c */
    public C38630bv f101965c;

    static {
        C38573b bVar = new C38573b();
        f101961d = bVar;
        C62942bv.registerDefaultInstance(C38573b.class, bVar);
    }

    private C38573b() {
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
                return newMessageInfo(f101961d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0000\u0003ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38573b();
            case 4:
                return new C38572a();
            case 5:
                return f101961d;
            case 6:
                C63010eb ebVar = f101962e;
                if (ebVar == null) {
                    synchronized (C38573b.class) {
                        ebVar = f101962e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101961d);
                            f101962e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
