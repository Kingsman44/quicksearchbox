package com.google.p4242bp.p4266g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bp.g.d */
/* compiled from: PG */
public final class C56354d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C56354d f150295b;

    /* renamed from: d */
    private static volatile C63010eb f150296d;

    /* renamed from: a */
    public C56353c f150297a;

    /* renamed from: c */
    private int f150298c;

    static {
        C56354d dVar = new C56354d();
        f150295b = dVar;
        C62942bv.registerDefaultInstance(C56354d.class, dVar);
    }

    private C56354d() {
        emptyIntList();
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
                return newMessageInfo(f150295b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C56354d();
            case 4:
                return new C56351a();
            case 5:
                return f150295b;
            case 6:
                C63010eb ebVar = f150296d;
                if (ebVar == null) {
                    synchronized (C56354d.class) {
                        ebVar = f150296d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150295b);
                            f150296d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
