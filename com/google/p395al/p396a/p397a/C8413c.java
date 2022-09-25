package com.google.p395al.p396a.p397a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.a.a.c */
/* compiled from: PG */
public final class C8413c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8413c f29263a;

    /* renamed from: e */
    private static volatile C63010eb f29264e;

    /* renamed from: b */
    private int f29265b;

    /* renamed from: c */
    private C60220t f29266c;

    /* renamed from: d */
    private byte f29267d = 2;

    static {
        C8413c cVar = new C8413c();
        f29263a = cVar;
        C62942bv.registerDefaultInstance(C8413c.class, cVar);
    }

    private C8413c() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29267d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29267d = b;
                return null;
            case 2:
                return newMessageInfo(f29263a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8413c();
            case 4:
                return new C8412b();
            case 5:
                return f29263a;
            case 6:
                C63010eb ebVar = f29264e;
                if (ebVar == null) {
                    synchronized (C8413c.class) {
                        ebVar = f29264e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29263a);
                            f29264e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
