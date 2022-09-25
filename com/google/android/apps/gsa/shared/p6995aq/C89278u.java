package com.google.android.apps.gsa.shared.p6995aq;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.shared.aq.u */
/* compiled from: PG */
public final class C89278u extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C89278u f242057g;

    /* renamed from: h */
    private static volatile C63010eb f242058h;

    /* renamed from: a */
    public int f242059a;

    /* renamed from: b */
    public C89277t f242060b;

    /* renamed from: c */
    public C89277t f242061c;

    /* renamed from: d */
    public boolean f242062d;

    /* renamed from: e */
    public boolean f242063e;

    /* renamed from: f */
    public int f242064f;

    static {
        C89278u uVar = new C89278u();
        f242057g = uVar;
        C62942bv.registerDefaultInstance(C89278u.class, uVar);
    }

    private C89278u() {
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
                return newMessageInfo(f242057g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005င\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C89278u();
            case 4:
                return new C89273p();
            case 5:
                return f242057g;
            case 6:
                C63010eb ebVar = f242058h;
                if (ebVar == null) {
                    synchronized (C89278u.class) {
                        ebVar = f242058h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f242057g);
                            f242058h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
