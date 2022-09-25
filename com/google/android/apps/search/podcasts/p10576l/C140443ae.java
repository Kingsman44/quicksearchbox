package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.ae */
/* compiled from: PG */
public final class C140443ae extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C140443ae f381490d;

    /* renamed from: e */
    private static volatile C63010eb f381491e;

    /* renamed from: a */
    public int f381492a;

    /* renamed from: b */
    public long f381493b;

    /* renamed from: c */
    public boolean f381494c;

    static {
        C140443ae aeVar = new C140443ae();
        f381490d = aeVar;
        C62942bv.registerDefaultInstance(C140443ae.class, aeVar);
    }

    private C140443ae() {
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
                return newMessageInfo(f381490d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\u0002\u0003\u0007", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C140443ae();
            case 4:
                return new C140442ad();
            case 5:
                return f381490d;
            case 6:
                C63010eb ebVar = f381491e;
                if (ebVar == null) {
                    synchronized (C140443ae.class) {
                        ebVar = f381491e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381490d);
                            f381491e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
