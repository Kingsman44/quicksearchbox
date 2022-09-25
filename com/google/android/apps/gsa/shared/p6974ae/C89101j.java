package com.google.android.apps.gsa.shared.p6974ae;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.ae.j */
/* compiled from: PG */
public final class C89101j extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C89101j f241530c;

    /* renamed from: e */
    private static volatile C63010eb f241531e;

    /* renamed from: a */
    public int f241532a = 0;

    /* renamed from: b */
    public Object f241533b;

    /* renamed from: d */
    private byte f241534d = 2;

    static {
        C89101j jVar = new C89101j();
        f241530c = jVar;
        C62942bv.registerDefaultInstance(C89101j.class, jVar);
    }

    private C89101j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f241534d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f241534d = b;
                return null;
            case 2:
                return newMessageInfo(f241530c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", C89100i.class});
            case 3:
                return new C89101j();
            case 4:
                return new C89098g();
            case 5:
                return f241530c;
            case 6:
                C63010eb ebVar = f241531e;
                if (ebVar == null) {
                    synchronized (C89101j.class) {
                        ebVar = f241531e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f241530c);
                            f241531e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
