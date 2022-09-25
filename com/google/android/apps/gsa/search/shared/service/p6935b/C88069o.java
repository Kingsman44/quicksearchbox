package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4500cm.p4518d.C58186c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.o */
/* compiled from: PG */
public final class C88069o extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C88069o f238120d;

    /* renamed from: f */
    private static volatile C63010eb f238121f;

    /* renamed from: a */
    public int f238122a;

    /* renamed from: b */
    public boolean f238123b;

    /* renamed from: c */
    public C58186c f238124c;

    /* renamed from: e */
    private byte f238125e = 2;

    static {
        C88069o oVar = new C88069o();
        f238120d = oVar;
        C62942bv.registerDefaultInstance(C88069o.class, oVar);
    }

    private C88069o() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f238125e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f238125e = b;
                return null;
            case 2:
                return newMessageInfo(f238120d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဇ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C88069o();
            case 4:
                return new C88042n();
            case 5:
                return f238120d;
            case 6:
                C63010eb ebVar = f238121f;
                if (ebVar == null) {
                    synchronized (C88069o.class) {
                        ebVar = f238121f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238120d);
                            f238121f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
