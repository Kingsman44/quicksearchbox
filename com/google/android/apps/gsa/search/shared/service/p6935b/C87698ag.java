package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ag */
/* compiled from: PG */
public final class C87698ag extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87698ag f237151b;

    /* renamed from: d */
    private static volatile C63010eb f237152d;

    /* renamed from: a */
    public boolean f237153a;

    /* renamed from: c */
    private int f237154c;

    static {
        C87698ag agVar = new C87698ag();
        f237151b = agVar;
        C62942bv.registerDefaultInstance(C87698ag.class, agVar);
    }

    private C87698ag() {
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
                return newMessageInfo(f237151b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C87698ag();
            case 4:
                return new C87697af();
            case 5:
                return f237151b;
            case 6:
                C63010eb ebVar = f237152d;
                if (ebVar == null) {
                    synchronized (C87698ag.class) {
                        ebVar = f237152d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237151b);
                            f237152d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
