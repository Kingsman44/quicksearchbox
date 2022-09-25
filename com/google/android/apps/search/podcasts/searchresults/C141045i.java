package com.google.android.apps.search.podcasts.searchresults;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.searchresults.i */
/* compiled from: PG */
public final class C141045i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141045i f382906c;

    /* renamed from: d */
    private static volatile C63010eb f382907d;

    /* renamed from: a */
    public int f382908a = 0;

    /* renamed from: b */
    public Object f382909b;

    static {
        C141045i iVar = new C141045i();
        f382906c = iVar;
        C62942bv.registerDefaultInstance(C141045i.class, iVar);
    }

    private C141045i() {
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
                return newMessageInfo(f382906c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C141043g.class, C141041e.class});
            case 3:
                return new C141045i();
            case 4:
                return new C141044h();
            case 5:
                return f382906c;
            case 6:
                C63010eb ebVar = f382907d;
                if (ebVar == null) {
                    synchronized (C141045i.class) {
                        ebVar = f382907d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f382906c);
                            f382907d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
