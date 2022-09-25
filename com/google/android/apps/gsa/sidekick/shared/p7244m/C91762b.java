package com.google.android.apps.gsa.sidekick.shared.p7244m;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.m.b */
/* compiled from: PG */
public final class C91762b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C91762b f255898e;

    /* renamed from: f */
    private static volatile C63010eb f255899f;

    /* renamed from: a */
    public int f255900a;

    /* renamed from: b */
    public boolean f255901b;

    /* renamed from: c */
    public boolean f255902c;

    /* renamed from: d */
    public boolean f255903d;

    static {
        C91762b bVar = new C91762b();
        f255898e = bVar;
        C62942bv.registerDefaultInstance(C91762b.class, bVar);
    }

    private C91762b() {
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
                return newMessageInfo(f255898e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C91762b();
            case 4:
                return new C91761a();
            case 5:
                return f255898e;
            case 6:
                C63010eb ebVar = f255899f;
                if (ebVar == null) {
                    synchronized (C91762b.class) {
                        ebVar = f255899f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f255898e);
                            f255899f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
