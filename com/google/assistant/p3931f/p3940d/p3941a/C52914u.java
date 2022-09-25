package com.google.assistant.p3931f.p3940d.p3941a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.f.d.a.u */
/* compiled from: PG */
public final class C52914u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52914u f138754e;

    /* renamed from: f */
    private static volatile C63010eb f138755f;

    /* renamed from: a */
    public int f138756a = 0;

    /* renamed from: b */
    public Object f138757b;

    /* renamed from: c */
    public int f138758c;

    /* renamed from: d */
    public int f138759d;

    static {
        C52914u uVar = new C52914u();
        f138754e = uVar;
        C62942bv.registerDefaultInstance(C52914u.class, uVar);
    }

    private C52914u() {
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
                return newMessageInfo(f138754e, "\u0000\t\u0001\u0000\u0001\t\t\u0000\u0000\u0000\u0001\u0004\u0002\u0004\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b<\u0000\t<\u0000", new Object[]{"b", "a", C45240c.f118157a, "d", C52913t.class, C52901h.class, C52907n.class, C52905l.class, C52909p.class, C52903j.class, C52911r.class});
            case 3:
                return new C52914u();
            case 4:
                return new C52899f();
            case 5:
                return f138754e;
            case 6:
                C63010eb ebVar = f138755f;
                if (ebVar == null) {
                    synchronized (C52914u.class) {
                        ebVar = f138755f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138754e);
                            f138755f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
