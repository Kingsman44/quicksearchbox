package com.google.android.apps.search.assistant.platform.p9141h.p9148c.p9151c;

import com.google.android.libraries.search.assistant.p2704m.C34807b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.h.c.c.b */
/* compiled from: PG */
public final class C121032b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C121032b f336408d;

    /* renamed from: e */
    private static volatile C63010eb f336409e;

    /* renamed from: a */
    public int f336410a;

    /* renamed from: b */
    public boolean f336411b;

    /* renamed from: c */
    public int f336412c;

    static {
        C121032b bVar = new C121032b();
        f336408d = bVar;
        C62942bv.registerDefaultInstance(C121032b.class, bVar);
    }

    private C121032b() {
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
                return newMessageInfo(f336408d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C34807b.m63567b()});
            case 3:
                return new C121032b();
            case 4:
                return new C121031a();
            case 5:
                return f336408d;
            case 6:
                C63010eb ebVar = f336409e;
                if (ebVar == null) {
                    synchronized (C121032b.class) {
                        ebVar = f336409e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f336408d);
                            f336409e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
