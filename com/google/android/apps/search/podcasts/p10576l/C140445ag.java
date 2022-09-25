package com.google.android.apps.search.podcasts.p10576l;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.ag */
/* compiled from: PG */
public final class C140445ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C140445ag f381495f;

    /* renamed from: g */
    private static volatile C63010eb f381496g;

    /* renamed from: a */
    public int f381497a;

    /* renamed from: b */
    public long f381498b;

    /* renamed from: c */
    public long f381499c;

    /* renamed from: d */
    public long f381500d;

    /* renamed from: e */
    public long f381501e;

    static {
        C140445ag agVar = new C140445ag();
        f381495f = agVar;
        C62942bv.registerDefaultInstance(C140445ag.class, agVar);
    }

    private C140445ag() {
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
                return newMessageInfo(f381495f, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u0004\u0002\u0002\u0003\u0002\u0004\u0002\u0005\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C140445ag();
            case 4:
                return new C140444af();
            case 5:
                return f381495f;
            case 6:
                C63010eb ebVar = f381496g;
                if (ebVar == null) {
                    synchronized (C140445ag.class) {
                        ebVar = f381496g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381495f);
                            f381496g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
