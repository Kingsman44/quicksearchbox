package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.d */
/* compiled from: PG */
public final class C17902d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C17902d f51290d;

    /* renamed from: e */
    private static volatile C63010eb f51291e;

    /* renamed from: a */
    public int f51292a;

    /* renamed from: b */
    public int f51293b;

    /* renamed from: c */
    public long f51294c;

    static {
        C17902d dVar = new C17902d();
        f51290d = dVar;
        C62942bv.registerDefaultInstance(C17902d.class, dVar);
    }

    private C17902d() {
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
                return newMessageInfo(f51290d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C89849ae.m146282b(), C45240c.f118157a});
            case 3:
                return new C17902d();
            case 4:
                return new C17901c();
            case 5:
                return f51290d;
            case 6:
                C63010eb ebVar = f51291e;
                if (ebVar == null) {
                    synchronized (C17902d.class) {
                        ebVar = f51291e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51290d);
                            f51291e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
