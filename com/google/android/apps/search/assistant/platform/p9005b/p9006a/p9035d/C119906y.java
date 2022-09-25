package com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.b.a.d.y */
/* compiled from: PG */
public final class C119906y extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C119906y f333913e;

    /* renamed from: f */
    private static volatile C63010eb f333914f;

    /* renamed from: a */
    public int f333915a;

    /* renamed from: b */
    public boolean f333916b;

    /* renamed from: c */
    public boolean f333917c;

    /* renamed from: d */
    public boolean f333918d;

    static {
        C119906y yVar = new C119906y();
        f333913e = yVar;
        C62942bv.registerDefaultInstance(C119906y.class, yVar);
    }

    private C119906y() {
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
                return newMessageInfo(f333913e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C119906y();
            case 4:
                return new C119905x();
            case 5:
                return f333913e;
            case 6:
                C63010eb ebVar = f333914f;
                if (ebVar == null) {
                    synchronized (C119906y.class) {
                        ebVar = f333914f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f333913e);
                            f333914f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
