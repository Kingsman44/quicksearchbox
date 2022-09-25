package com.google.android.apps.gsa.nga.shared.p6339f.p6342c;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6278c.C80151b;
import com.google.android.apps.gsa.nga.shared.p6337e.p6338a.C81022b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.f.c.f */
/* compiled from: PG */
public final class C81048f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C81048f f222138d;

    /* renamed from: f */
    private static volatile C63010eb f222139f;

    /* renamed from: a */
    public int f222140a = 0;

    /* renamed from: b */
    public Object f222141b;

    /* renamed from: c */
    public C80151b f222142c;

    /* renamed from: e */
    private byte f222143e = 2;

    static {
        C81048f fVar = new C81048f();
        f222138d = fVar;
        C62942bv.registerDefaultInstance(C81048f.class, fVar);
    }

    private C81048f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f222143e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f222143e = b;
                return null;
            case 2:
                return newMessageInfo(f222138d, "\u0000\u0004\u0001\u0000\u0001\u0004\u0004\u0000\u0000\u0001\u0001м\u0000\u0002\t\u0003<\u0000\u0004<\u0000", new Object[]{"b", "a", C81046d.class, C45240c.f118157a, C81022b.class, C81050h.class});
            case 3:
                return new C81048f();
            case 4:
                return new C81047e();
            case 5:
                return f222138d;
            case 6:
                C63010eb ebVar = f222139f;
                if (ebVar == null) {
                    synchronized (C81048f.class) {
                        ebVar = f222139f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f222138d);
                            f222139f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
