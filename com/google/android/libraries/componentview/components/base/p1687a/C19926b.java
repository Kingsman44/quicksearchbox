package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.componentview.components.base.a.b */
/* compiled from: PG */
public final class C19926b extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C19926b f55754e;

    /* renamed from: f */
    private static volatile C63010eb f55755f;

    /* renamed from: a */
    public int f55756a;

    /* renamed from: b */
    public boolean f55757b = true;

    /* renamed from: c */
    public boolean f55758c;

    /* renamed from: d */
    public C19995r f55759d;

    static {
        C19926b bVar = new C19926b();
        f55754e = bVar;
        C62942bv.registerDefaultInstance(C19926b.class, bVar);
    }

    private C19926b() {
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
                return newMessageInfo(f55754e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C19926b();
            case 4:
                return new C19899a();
            case 5:
                return f55754e;
            case 6:
                C63010eb ebVar = f55755f;
                if (ebVar == null) {
                    synchronized (C19926b.class) {
                        ebVar = f55755f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55754e);
                            f55755f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
