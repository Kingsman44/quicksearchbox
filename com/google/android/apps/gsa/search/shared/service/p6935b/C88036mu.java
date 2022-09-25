package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.libraries.gsa.monet.internal.shared.p1890b.C23037d;
import com.google.android.libraries.gsa.monet.shared.p1894d.C23099b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.mu */
/* compiled from: PG */
public final class C88036mu extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88036mu f238057c;

    /* renamed from: e */
    private static volatile C63010eb f238058e;

    /* renamed from: a */
    public int f238059a = 0;

    /* renamed from: b */
    public Object f238060b;

    /* renamed from: d */
    private byte f238061d = 2;

    static {
        C88036mu muVar = new C88036mu();
        f238057c = muVar;
        C62942bv.registerDefaultInstance(C88036mu.class, muVar);
    }

    private C88036mu() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238061d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238061d = b;
                return null;
            case 2:
                return newMessageInfo(f238057c, "\u0001\t\u0001\u0000\u0001\u000e\t\u0000\u0000\u0001\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\rြ\u0000\u000eြ\u0000", new Object[]{"b", "a", C88022mg.class, C88024mi.class, C23037d.class, C88028mm.class, C88032mq.class, C88026mk.class, C23099b.class, C88034ms.class, C88030mo.class});
            case 3:
                return new C88036mu();
            case 4:
                return new C88035mt();
            case 5:
                return f238057c;
            case 6:
                C63010eb ebVar = f238058e;
                if (ebVar == null) {
                    synchronized (C88036mu.class) {
                        ebVar = f238058e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238057c);
                            f238058e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
