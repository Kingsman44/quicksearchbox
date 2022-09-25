package com.google.p4691l.p4692a.p4693a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p5123l.C65593b;

/* renamed from: com.google.l.a.a.b */
/* compiled from: PG */
public final class C62014b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62014b f167572a;

    /* renamed from: e */
    private static volatile C63010eb f167573e;

    /* renamed from: b */
    private int f167574b;

    /* renamed from: c */
    private C65593b f167575c;

    /* renamed from: d */
    private byte f167576d = 2;

    static {
        C62014b bVar = new C62014b();
        f167572a = bVar;
        C62942bv.registerDefaultInstance(C62014b.class, bVar);
    }

    private C62014b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167576d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f167576d = b;
                return null;
            case 2:
                return newMessageInfo(f167572a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C62014b();
            case 4:
                return new C62013a();
            case 5:
                return f167572a;
            case 6:
                C63010eb ebVar = f167573e;
                if (ebVar == null) {
                    synchronized (C62014b.class) {
                        ebVar = f167573e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167572a);
                            f167573e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
