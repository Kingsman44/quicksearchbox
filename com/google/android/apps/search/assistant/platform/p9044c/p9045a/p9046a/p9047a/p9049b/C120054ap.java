package com.google.android.apps.search.assistant.platform.p9044c.p9045a.p9046a.p9047a.p9049b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.c.a.a.a.b.ap */
/* compiled from: PG */
public final class C120054ap extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C120054ap f334221c;

    /* renamed from: d */
    private static volatile C63010eb f334222d;

    /* renamed from: a */
    public int f334223a = 0;

    /* renamed from: b */
    public Object f334224b;

    static {
        C120054ap apVar = new C120054ap();
        f334221c = apVar;
        C62942bv.registerDefaultInstance(C120054ap.class, apVar);
    }

    private C120054ap() {
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
                return newMessageInfo(f334221c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C120051am.class, C120053ao.class});
            case 3:
                return new C120054ap();
            case 4:
                return new C120048aj();
            case 5:
                return f334221c;
            case 6:
                C63010eb ebVar = f334222d;
                if (ebVar == null) {
                    synchronized (C120054ap.class) {
                        ebVar = f334222d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f334221c);
                            f334222d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
