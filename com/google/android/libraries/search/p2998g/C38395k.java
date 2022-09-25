package com.google.android.libraries.search.p2998g;

import com.google.android.libraries.search.p2998g.p2999a.C38370k;
import com.google.android.libraries.search.p2998g.p2999a.C38377r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.k */
/* compiled from: PG */
public final class C38395k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38395k f101637d;

    /* renamed from: f */
    private static volatile C63010eb f101638f;

    /* renamed from: a */
    public int f101639a;

    /* renamed from: b */
    public C38370k f101640b;

    /* renamed from: c */
    public C38377r f101641c;

    /* renamed from: e */
    private byte f101642e = 2;

    static {
        C38395k kVar = new C38395k();
        f101637d = kVar;
        C62942bv.registerDefaultInstance(C38395k.class, kVar);
    }

    private C38395k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101642e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f101642e = b;
                return null;
            case 2:
                return newMessageInfo(f101637d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C38395k();
            case 4:
                return new C38394j();
            case 5:
                return f101637d;
            case 6:
                C63010eb ebVar = f101638f;
                if (ebVar == null) {
                    synchronized (C38395k.class) {
                        ebVar = f101638f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101637d);
                            f101638f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
