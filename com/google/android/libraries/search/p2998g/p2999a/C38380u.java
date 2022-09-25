package com.google.android.libraries.search.p2998g.p2999a;

import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.g.a.u */
/* compiled from: PG */
public final class C38380u extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C38380u f101620d;

    /* renamed from: f */
    private static volatile C63010eb f101621f;

    /* renamed from: a */
    public int f101622a;

    /* renamed from: b */
    public int f101623b = 1;

    /* renamed from: c */
    public C88431bb f101624c;

    /* renamed from: e */
    private byte f101625e = 2;

    static {
        C38380u uVar = new C38380u();
        f101620d = uVar;
        C62942bv.registerDefaultInstance(C38380u.class, uVar);
    }

    private C38380u() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f101625e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f101625e = b;
                return null;
            case 2:
                return newMessageInfo(f101620d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဌ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C38381v.f101626a, C45240c.f118157a});
            case 3:
                return new C38380u();
            case 4:
                return new C38379t();
            case 5:
                return f101620d;
            case 6:
                C63010eb ebVar = f101621f;
                if (ebVar == null) {
                    synchronized (C38380u.class) {
                        ebVar = f101621f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f101620d);
                            f101621f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
