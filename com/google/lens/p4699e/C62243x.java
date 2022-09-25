package com.google.lens.p4699e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.lens.p4707j.C62578l;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.x */
/* compiled from: PG */
public final class C62243x extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62962ci f168042b = new C62238s();

    /* renamed from: d */
    public static final C62962ci f168043d = new C62239t();

    /* renamed from: e */
    public static final C62243x f168044e;

    /* renamed from: f */
    private static volatile C63010eb f168045f;

    /* renamed from: a */
    public C62961ch f168046a = emptyIntList();

    /* renamed from: c */
    public C62961ch f168047c = emptyIntList();

    static {
        C62243x xVar = new C62243x();
        f168044e = xVar;
        C62942bv.registerDefaultInstance(C62243x.class, xVar);
    }

    private C62243x() {
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
                return newMessageInfo(f168044e, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001e\u0002\u001e", new Object[]{"a", C62242w.m94762b(), C45240c.f118157a, C62578l.m94801b()});
            case 3:
                return new C62243x();
            case 4:
                return new C62240u();
            case 5:
                return f168044e;
            case 6:
                C63010eb ebVar = f168045f;
                if (ebVar == null) {
                    synchronized (C62243x.class) {
                        ebVar = f168045f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168044e);
                            f168045f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
