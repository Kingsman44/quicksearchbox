package com.google.android.apps.gsa.shared.p6995aq;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aq.d */
/* compiled from: PG */
public final class C89261d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89261d f242033c;

    /* renamed from: d */
    private static volatile C63010eb f242034d;

    /* renamed from: a */
    public int f242035a;

    /* renamed from: b */
    public long f242036b;

    static {
        C89261d dVar = new C89261d();
        f242033c = dVar;
        C62942bv.registerDefaultInstance(C89261d.class, dVar);
    }

    private C89261d() {
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
                return newMessageInfo(f242033c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C89261d();
            case 4:
                return new C89260c();
            case 5:
                return f242033c;
            case 6:
                C63010eb ebVar = f242034d;
                if (ebVar == null) {
                    synchronized (C89261d.class) {
                        ebVar = f242034d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242033c);
                            f242034d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
