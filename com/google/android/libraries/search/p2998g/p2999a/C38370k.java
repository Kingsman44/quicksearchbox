package com.google.android.libraries.search.p2998g.p2999a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.k */
/* compiled from: PG */
public final class C38370k extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C38370k f101593f;

    /* renamed from: h */
    private static volatile C63010eb f101594h;

    /* renamed from: a */
    public int f101595a;

    /* renamed from: b */
    public C38369j f101596b;

    /* renamed from: c */
    public C38367h f101597c;

    /* renamed from: d */
    public C38365f f101598d;

    /* renamed from: e */
    public C38362c f101599e;

    /* renamed from: g */
    private byte f101600g = 2;

    static {
        C38370k kVar = new C38370k();
        f101593f = kVar;
        C62942bv.registerDefaultInstance(C38370k.class, kVar);
    }

    private C38370k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101600g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f101600g = b;
                return null;
            case 2:
                return newMessageInfo(f101593f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003ᐉ\u0002\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C38370k();
            case 4:
                return new C38335a();
            case 5:
                return f101593f;
            case 6:
                C63010eb ebVar = f101594h;
                if (ebVar == null) {
                    synchronized (C38370k.class) {
                        ebVar = f101594h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101593f);
                            f101594h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
