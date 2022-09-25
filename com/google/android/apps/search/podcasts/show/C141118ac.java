package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.apps.search.podcasts.p10588n.p10589a.C140651c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.show.ac */
/* compiled from: PG */
public final class C141118ac extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141118ac f383141c;

    /* renamed from: d */
    private static volatile C63010eb f383142d;

    /* renamed from: a */
    public C140646b f383143a;

    /* renamed from: b */
    public C140651c f383144b;

    static {
        C141118ac acVar = new C141118ac();
        f383141c = acVar;
        C62942bv.registerDefaultInstance(C141118ac.class, acVar);
    }

    private C141118ac() {
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
                return newMessageInfo(f383141c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", new Object[]{"a", "b"});
            case 3:
                return new C141118ac();
            case 4:
                return new C141117ab();
            case 5:
                return f383141c;
            case 6:
                C63010eb ebVar = f383142d;
                if (ebVar == null) {
                    synchronized (C141118ac.class) {
                        ebVar = f383142d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383141c);
                            f383142d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
