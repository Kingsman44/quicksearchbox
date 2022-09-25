package com.google.android.apps.search.assistant.platform.p9080f.p9123l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.f.l.d */
/* compiled from: PG */
public final class C120811d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C120811d f335965c;

    /* renamed from: d */
    private static volatile C63010eb f335966d;

    /* renamed from: a */
    public int f335967a = 0;

    /* renamed from: b */
    public Object f335968b;

    static {
        C120811d dVar = new C120811d();
        f335965c = dVar;
        C62942bv.registerDefaultInstance(C120811d.class, dVar);
    }

    private C120811d() {
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
                return newMessageInfo(f335965c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C120815h.class, C120813f.class});
            case 3:
                return new C120811d();
            case 4:
                return new C120809b();
            case 5:
                return f335965c;
            case 6:
                C63010eb ebVar = f335966d;
                if (ebVar == null) {
                    synchronized (C120811d.class) {
                        ebVar = f335966d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f335965c);
                            f335966d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
