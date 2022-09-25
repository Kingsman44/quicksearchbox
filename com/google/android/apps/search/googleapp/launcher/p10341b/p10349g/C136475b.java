package com.google.android.apps.search.googleapp.launcher.p10341b.p10349g;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.launcher.b.g.b */
/* compiled from: PG */
public final class C136475b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C136475b f371563c;

    /* renamed from: e */
    private static volatile C63010eb f371564e;

    /* renamed from: a */
    public int f371565a;

    /* renamed from: b */
    public int f371566b;

    /* renamed from: d */
    private int f371567d;

    static {
        C136475b bVar = new C136475b();
        f371563c = bVar;
        C62942bv.registerDefaultInstance(C136475b.class, bVar);
    }

    private C136475b() {
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
                return newMessageInfo(f371563c, "\u0001\u0002\u0000\u0001\u0002\u0004\u0002\u0000\u0000\u0000\u0002င\u0001\u0004င\u0003", new Object[]{"d", "a", "b"});
            case 3:
                return new C136475b();
            case 4:
                return new C136474a();
            case 5:
                return f371563c;
            case 6:
                C63010eb ebVar = f371564e;
                if (ebVar == null) {
                    synchronized (C136475b.class) {
                        ebVar = f371564e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f371563c);
                            f371564e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
