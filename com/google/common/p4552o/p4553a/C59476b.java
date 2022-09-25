package com.google.common.p4552o.p4553a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.b */
/* compiled from: PG */
public final class C59476b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59476b f157797e;

    /* renamed from: f */
    private static volatile C63010eb f157798f;

    /* renamed from: a */
    public int f157799a;

    /* renamed from: b */
    public int f157800b = 0;

    /* renamed from: c */
    public Object f157801c;

    /* renamed from: d */
    public int f157802d = -1;

    static {
        C59476b bVar = new C59476b();
        f157797e = bVar;
        C62942bv.registerDefaultInstance(C59476b.class, bVar);
    }

    private C59476b() {
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
                return newMessageInfo(f157797e, "\u0001\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", "d", C59559o.class, C59556l.class});
            case 3:
                return new C59476b();
            case 4:
                return new C59449a();
            case 5:
                return f157797e;
            case 6:
                C63010eb ebVar = f157798f;
                if (ebVar == null) {
                    synchronized (C59476b.class) {
                        ebVar = f157798f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157797e);
                            f157798f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
