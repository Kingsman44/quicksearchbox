package com.google.speech.p5199c.p5200a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5228m.C67277ah;

/* renamed from: com.google.speech.c.a.u */
/* compiled from: PG */
public final class C66476u extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66476u f180749e;

    /* renamed from: f */
    private static volatile C63010eb f180750f;

    /* renamed from: a */
    public int f180751a;

    /* renamed from: b */
    public int f180752b;

    /* renamed from: c */
    public long f180753c;

    /* renamed from: d */
    public long f180754d;

    static {
        C66476u uVar = new C66476u();
        f180749e = uVar;
        C62942bv.registerDefaultInstance(C66476u.class, uVar);
    }

    private C66476u() {
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
                return newMessageInfo(f180749e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C67277ah.f182881a, C45240c.f118157a, "d"});
            case 3:
                return new C66476u();
            case 4:
                return new C66475t();
            case 5:
                return f180749e;
            case 6:
                C63010eb ebVar = f180750f;
                if (ebVar == null) {
                    synchronized (C66476u.class) {
                        ebVar = f180750f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180749e);
                            f180750f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
