package com.google.android.apps.search.googleapp.incognito.p10320b.p10321a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.incognito.b.a.b */
/* compiled from: PG */
public final class C136231b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C136231b f371010e;

    /* renamed from: f */
    private static volatile C63010eb f371011f;

    /* renamed from: a */
    public int f371012a;

    /* renamed from: b */
    public long f371013b;

    /* renamed from: c */
    public boolean f371014c;

    /* renamed from: d */
    public boolean f371015d;

    static {
        C136231b bVar = new C136231b();
        f371010e = bVar;
        C62942bv.registerDefaultInstance(C136231b.class, bVar);
    }

    private C136231b() {
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
                return newMessageInfo(f371010e, "\u0001\u0003\u0000\u0001\u0002\u0005\u0003\u0000\u0000\u0000\u0002ဂ\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C136231b();
            case 4:
                return new C136230a();
            case 5:
                return f371010e;
            case 6:
                C63010eb ebVar = f371011f;
                if (ebVar == null) {
                    synchronized (C136231b.class) {
                        ebVar = f371011f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371010e);
                            f371011f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
