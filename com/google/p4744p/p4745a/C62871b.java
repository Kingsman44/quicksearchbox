package com.google.p4744p.p4745a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4744p.C62872b;
import com.google.p4744p.C62876f;
import com.google.p4744p.C62880j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.p.a.b */
/* compiled from: PG */
public final class C62871b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62871b f169757d;

    /* renamed from: e */
    private static volatile C63010eb f169758e;

    /* renamed from: a */
    public int f169759a = 0;

    /* renamed from: b */
    public Object f169760b;

    /* renamed from: c */
    public C63088z f169761c = C63088z.f170246b;

    static {
        C62871b bVar = new C62871b();
        f169757d = bVar;
        C62942bv.registerDefaultInstance(C62871b.class, bVar);
    }

    private C62871b() {
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
                return newMessageInfo(f169757d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004\n", new Object[]{"b", "a", C62880j.class, C62872b.class, C62876f.class, C45240c.f118157a});
            case 3:
                return new C62871b();
            case 4:
                return new C62870a();
            case 5:
                return f169757d;
            case 6:
                C63010eb ebVar = f169758e;
                if (ebVar == null) {
                    synchronized (C62871b.class) {
                        ebVar = f169758e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169757d);
                            f169758e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
