package com.google.android.apps.search.googleapp.launcher.p10341b.p10344c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.c.b */
/* compiled from: PG */
public final class C136449b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C136449b f371488d;

    /* renamed from: e */
    private static volatile C63010eb f371489e;

    /* renamed from: a */
    public int f371490a;

    /* renamed from: b */
    public C136455h f371491b;

    /* renamed from: c */
    public boolean f371492c;

    static {
        C136449b bVar = new C136449b();
        f371488d = bVar;
        C62942bv.registerDefaultInstance(C136449b.class, bVar);
    }

    private C136449b() {
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
                return newMessageInfo(f371488d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C136449b();
            case 4:
                return new C136448a();
            case 5:
                return f371488d;
            case 6:
                C63010eb ebVar = f371489e;
                if (ebVar == null) {
                    synchronized (C136449b.class) {
                        ebVar = f371489e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371488d);
                            f371489e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
