package com.google.android.apps.search.podcasts.p10576l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.l.p */
/* compiled from: PG */
public final class C140504p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140504p f381619c;

    /* renamed from: d */
    private static volatile C63010eb f381620d;

    /* renamed from: a */
    public boolean f381621a;

    /* renamed from: b */
    public boolean f381622b;

    static {
        C140504p pVar = new C140504p();
        f381619c = pVar;
        C62942bv.registerDefaultInstance(C140504p.class, pVar);
    }

    private C140504p() {
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
                return newMessageInfo(f381619c, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u0007\u0003\u0007", new Object[]{"a", "b"});
            case 3:
                return new C140504p();
            case 4:
                return new C140503o();
            case 5:
                return f381619c;
            case 6:
                C63010eb ebVar = f381620d;
                if (ebVar == null) {
                    synchronized (C140504p.class) {
                        ebVar = f381620d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f381619c);
                            f381620d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
