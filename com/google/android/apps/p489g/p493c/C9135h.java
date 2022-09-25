package com.google.android.apps.p489g.p493c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7799kj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.g.c.h */
/* compiled from: PG */
public final class C9135h extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9135h f31441e;

    /* renamed from: g */
    private static volatile C63010eb f31442g;

    /* renamed from: a */
    public int f31443a;

    /* renamed from: b */
    public C7799kj f31444b;

    /* renamed from: c */
    public long f31445c;

    /* renamed from: d */
    public C63088z f31446d = C63088z.f170246b;

    /* renamed from: f */
    private byte f31447f = 2;

    static {
        C9135h hVar = new C9135h();
        f31441e = hVar;
        C62942bv.registerDefaultInstance(C9135h.class, hVar);
    }

    private C9135h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31447f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31447f = b;
                return null;
            case 2:
                return newMessageInfo(f31441e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဂ\u0001\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C9135h();
            case 4:
                return new C9134g();
            case 5:
                return f31441e;
            case 6:
                C63010eb ebVar = f31442g;
                if (ebVar == null) {
                    synchronized (C9135h.class) {
                        ebVar = f31442g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31441e);
                            f31442g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
