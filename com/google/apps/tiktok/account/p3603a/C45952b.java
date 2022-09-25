package com.google.apps.tiktok.account.p3603a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.apps.tiktok.account.a.b */
/* compiled from: PG */
public final class C45952b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C45952b f120740d;

    /* renamed from: e */
    private static volatile C63010eb f120741e;

    /* renamed from: a */
    public int f120742a;

    /* renamed from: b */
    public int f120743b;

    /* renamed from: c */
    public boolean f120744c;

    static {
        C45952b bVar = new C45952b();
        f120740d = bVar;
        C62942bv.registerDefaultInstance(C45952b.class, bVar);
    }

    private C45952b() {
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
                return newMessageInfo(f120740d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C45952b();
            case 4:
                return new C45951a();
            case 5:
                return f120740d;
            case 6:
                C63010eb ebVar = f120741e;
                if (ebVar == null) {
                    synchronized (C45952b.class) {
                        ebVar = f120741e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f120740d);
                            f120741e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
