package com.google.android.apps.search.podcasts.show;

import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.podcasts.show.ae */
/* compiled from: PG */
public final class C141120ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C141120ae f383145c;

    /* renamed from: d */
    private static volatile C63010eb f383146d;

    /* renamed from: a */
    public C140646b f383147a;

    /* renamed from: b */
    public boolean f383148b;

    static {
        C141120ae aeVar = new C141120ae();
        f383145c = aeVar;
        C62942bv.registerDefaultInstance(C141120ae.class, aeVar);
    }

    private C141120ae() {
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
                return newMessageInfo(f383145c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C141120ae();
            case 4:
                return new C141119ad();
            case 5:
                return f383145c;
            case 6:
                C63010eb ebVar = f383146d;
                if (ebVar == null) {
                    synchronized (C141120ae.class) {
                        ebVar = f383146d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f383145c);
                            f383146d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
