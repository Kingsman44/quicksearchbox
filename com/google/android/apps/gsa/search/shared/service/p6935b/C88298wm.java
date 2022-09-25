package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.wm */
/* compiled from: PG */
public final class C88298wm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88298wm f238806c;

    /* renamed from: d */
    private static volatile C63010eb f238807d;

    /* renamed from: a */
    public int f238808a;

    /* renamed from: b */
    public boolean f238809b;

    static {
        C88298wm wmVar = new C88298wm();
        f238806c = wmVar;
        C62942bv.registerDefaultInstance(C88298wm.class, wmVar);
    }

    private C88298wm() {
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
                return newMessageInfo(f238806c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88298wm();
            case 4:
                return new C88297wl();
            case 5:
                return f238806c;
            case 6:
                C63010eb ebVar = f238807d;
                if (ebVar == null) {
                    synchronized (C88298wm.class) {
                        ebVar = f238807d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238806c);
                            f238807d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
