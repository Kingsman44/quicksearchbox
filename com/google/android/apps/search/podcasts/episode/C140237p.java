package com.google.android.apps.search.podcasts.episode;

import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.episode.p */
/* compiled from: PG */
public final class C140237p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C140237p f380980c;

    /* renamed from: d */
    private static volatile C63010eb f380981d;

    /* renamed from: a */
    public int f380982a = 0;

    /* renamed from: b */
    public Object f380983b;

    static {
        C140237p pVar = new C140237p();
        f380980c = pVar;
        C62942bv.registerDefaultInstance(C140237p.class, pVar);
    }

    private C140237p() {
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
                return newMessageInfo(f380980c, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000", new Object[]{"b", "a", C140239r.class, C140641b.class});
            case 3:
                return new C140237p();
            case 4:
                return new C140236o();
            case 5:
                return f380980c;
            case 6:
                C63010eb ebVar = f380981d;
                if (ebVar == null) {
                    synchronized (C140237p.class) {
                        ebVar = f380981d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f380980c);
                            f380981d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
