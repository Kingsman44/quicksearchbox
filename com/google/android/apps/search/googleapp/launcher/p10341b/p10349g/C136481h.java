package com.google.android.apps.search.googleapp.launcher.p10341b.p10349g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.g.h */
/* compiled from: PG */
public final class C136481h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C136481h f371584b;

    /* renamed from: d */
    private static volatile C63010eb f371585d;

    /* renamed from: a */
    public C136479f f371586a;

    /* renamed from: c */
    private int f371587c;

    static {
        C136481h hVar = new C136481h();
        f371584b = hVar;
        C62942bv.registerDefaultInstance(C136481h.class, hVar);
    }

    private C136481h() {
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
                return newMessageInfo(f371584b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C136481h();
            case 4:
                return new C136480g();
            case 5:
                return f371584b;
            case 6:
                C63010eb ebVar = f371585d;
                if (ebVar == null) {
                    synchronized (C136481h.class) {
                        ebVar = f371585d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371584b);
                            f371585d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
