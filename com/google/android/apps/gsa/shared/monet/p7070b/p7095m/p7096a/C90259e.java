package com.google.android.apps.gsa.shared.monet.p7070b.p7095m.p7096a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.monet.b.m.a.e */
/* compiled from: PG */
public final class C90259e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C90259e f252122d;

    /* renamed from: e */
    private static volatile C63010eb f252123e;

    /* renamed from: a */
    public int f252124a;

    /* renamed from: b */
    public boolean f252125b;

    /* renamed from: c */
    public int f252126c;

    static {
        C90259e eVar = new C90259e();
        f252122d = eVar;
        C62942bv.registerDefaultInstance(C90259e.class, eVar);
    }

    private C90259e() {
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
                return newMessageInfo(f252122d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C90258d.m146803b()});
            case 3:
                return new C90259e();
            case 4:
                return new C90256b();
            case 5:
                return f252122d;
            case 6:
                C63010eb ebVar = f252123e;
                if (ebVar == null) {
                    synchronized (C90259e.class) {
                        ebVar = f252123e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f252122d);
                            f252123e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
