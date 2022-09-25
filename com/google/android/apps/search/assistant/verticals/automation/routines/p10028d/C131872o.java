package com.google.android.apps.search.assistant.verticals.automation.routines.p10028d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3861at.afy;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.verticals.automation.routines.d.o */
/* compiled from: PG */
public final class C131872o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C131872o f360114d;

    /* renamed from: e */
    private static volatile C63010eb f360115e;

    /* renamed from: a */
    public int f360116a;

    /* renamed from: b */
    public afy f360117b;

    /* renamed from: c */
    public C131871n f360118c;

    static {
        C131872o oVar = new C131872o();
        f360114d = oVar;
        C62942bv.registerDefaultInstance(C131872o.class, oVar);
    }

    private C131872o() {
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
                return newMessageInfo(f360114d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C131872o();
            case 4:
                return new C131869l();
            case 5:
                return f360114d;
            case 6:
                C63010eb ebVar = f360115e;
                if (ebVar == null) {
                    synchronized (C131872o.class) {
                        ebVar = f360115e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f360114d);
                            f360115e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
