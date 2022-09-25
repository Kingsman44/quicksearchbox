package com.google.p4744p;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.p.b */
/* compiled from: PG */
public final class C62872b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62872b f169762d;

    /* renamed from: e */
    private static volatile C63010eb f169763e;

    /* renamed from: a */
    public int f169764a;

    /* renamed from: b */
    public C63088z f169765b;

    /* renamed from: c */
    public C63088z f169766c;

    static {
        C62872b bVar = new C62872b();
        f169762d = bVar;
        C62942bv.registerDefaultInstance(C62872b.class, bVar);
    }

    private C62872b() {
        C63088z zVar = C63088z.f170246b;
        C63088z zVar2 = C63088z.f170246b;
        this.f169765b = zVar2;
        this.f169766c = zVar2;
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
                return newMessageInfo(f169762d, "\u0000\u0003\u0000\u0000\u0003\u0005\u0003\u0000\u0000\u0000\u0003\n\u0004\u000b\u0005\n", new Object[]{C45240c.f118157a, "a", "b"});
            case 3:
                return new C62872b();
            case 4:
                return new C62869a();
            case 5:
                return f169762d;
            case 6:
                C63010eb ebVar = f169763e;
                if (ebVar == null) {
                    synchronized (C62872b.class) {
                        ebVar = f169763e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169762d);
                            f169763e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
