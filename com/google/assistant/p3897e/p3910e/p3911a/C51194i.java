package com.google.assistant.p3897e.p3910e.p3911a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.e.a.i */
/* compiled from: PG */
public final class C51194i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51194i f133258e;

    /* renamed from: f */
    private static volatile C63010eb f133259f;

    /* renamed from: a */
    public int f133260a;

    /* renamed from: b */
    public boolean f133261b;

    /* renamed from: c */
    public C63088z f133262c = C63088z.f170246b;

    /* renamed from: d */
    public int f133263d;

    static {
        C51194i iVar = new C51194i();
        f133258e = iVar;
        C62942bv.registerDefaultInstance(C51194i.class, iVar);
    }

    private C51194i() {
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
                return newMessageInfo(f133258e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဇ\u0000\u0003ည\u0001\u0004ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C51192g.f133257a});
            case 3:
                return new C51194i();
            case 4:
                return new C51191f();
            case 5:
                return f133258e;
            case 6:
                C63010eb ebVar = f133259f;
                if (ebVar == null) {
                    synchronized (C51194i.class) {
                        ebVar = f133259f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133258e);
                            f133259f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
