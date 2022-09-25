package com.google.android.apps.gsa.assistant.settings.p526e;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assistant.settings.e.q */
/* compiled from: PG */
public final class C9765q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9765q f33712d;

    /* renamed from: e */
    private static volatile C63010eb f33713e;

    /* renamed from: a */
    public int f33714a;

    /* renamed from: b */
    public int f33715b;

    /* renamed from: c */
    public int f33716c;

    static {
        C9765q qVar = new C9765q();
        f33712d = qVar;
        C62942bv.registerDefaultInstance(C9765q.class, qVar);
    }

    private C9765q() {
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
                return newMessageInfo(f33712d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C89849ae.m146282b()});
            case 3:
                return new C9765q();
            case 4:
                return new C9764p();
            case 5:
                return f33712d;
            case 6:
                C63010eb ebVar = f33713e;
                if (ebVar == null) {
                    synchronized (C9765q.class) {
                        ebVar = f33713e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f33712d);
                            f33713e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
