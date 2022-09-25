package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.ac */
/* compiled from: PG */
public final class C140441ac extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140441ac f381485d;

    /* renamed from: e */
    private static volatile C63010eb f381486e;

    /* renamed from: a */
    public C62971cq f381487a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public long f381488b;

    /* renamed from: c */
    public boolean f381489c;

    static {
        C140441ac acVar = new C140441ac();
        f381485d = acVar;
        C62942bv.registerDefaultInstance(C140441ac.class, acVar);
    }

    private C140441ac() {
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
                return newMessageInfo(f381485d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ț\u0002\u0002\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140441ac();
            case 4:
                return new C140440ab();
            case 5:
                return f381485d;
            case 6:
                C63010eb ebVar = f381486e;
                if (ebVar == null) {
                    synchronized (C140441ac.class) {
                        ebVar = f381486e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381485d);
                            f381486e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
