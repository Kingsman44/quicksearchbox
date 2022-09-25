package com.google.android.libraries.search.p2998g.p2999a;

import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.f */
/* compiled from: PG */
public final class C38365f extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C38365f f101578c;

    /* renamed from: e */
    private static volatile C63010eb f101579e;

    /* renamed from: a */
    public int f101580a = 0;

    /* renamed from: b */
    public Object f101581b;

    /* renamed from: d */
    private byte f101582d = 2;

    static {
        C38365f fVar = new C38365f();
        f101578c = fVar;
        C62942bv.registerDefaultInstance(C38365f.class, fVar);
    }

    private C38365f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101582d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f101582d = b;
                return null;
            case 2:
                return newMessageInfo(f101578c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ᐼ\u0000", new Object[]{"b", "a", C87741bw.class, C38380u.class});
            case 3:
                return new C38365f();
            case 4:
                return new C38363d();
            case 5:
                return f101578c;
            case 6:
                C63010eb ebVar = f101579e;
                if (ebVar == null) {
                    synchronized (C38365f.class) {
                        ebVar = f101579e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101578c);
                            f101579e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
