package com.google.p395al.p398b.p399a.p402b.p403a.p404a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.b.a.b.a.a.d */
/* compiled from: PG */
public final class C8431d extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C8431d f29316b;

    /* renamed from: e */
    private static volatile C63010eb f29317e;

    /* renamed from: a */
    public C8429b f29318a;

    /* renamed from: c */
    private int f29319c;

    /* renamed from: d */
    private byte f29320d = 2;

    static {
        C8431d dVar = new C8431d();
        f29316b = dVar;
        C62942bv.registerDefaultInstance(C8431d.class, dVar);
    }

    private C8431d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29320d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29320d = b;
                return null;
            case 2:
                return newMessageInfo(f29316b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဉ\u0001", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C8431d();
            case 4:
                return new C8430c();
            case 5:
                return f29316b;
            case 6:
                C63010eb ebVar = f29317e;
                if (ebVar == null) {
                    synchronized (C8431d.class) {
                        ebVar = f29317e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29316b);
                            f29317e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
