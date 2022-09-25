package com.google.p4242bp.p4266g;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.bp.g.p */
/* compiled from: PG */
public final class C56366p extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C56366p f150323a;

    /* renamed from: e */
    private static volatile C63010eb f150324e;

    /* renamed from: b */
    private int f150325b;

    /* renamed from: c */
    private C63771b f150326c;

    /* renamed from: d */
    private byte f150327d = 2;

    static {
        C56366p pVar = new C56366p();
        f150323a = pVar;
        C62942bv.registerDefaultInstance(C56366p.class, pVar);
    }

    private C56366p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f150327d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f150327d = b;
                return null;
            case 2:
                return newMessageInfo(f150323a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C56366p();
            case 4:
                return new C56365o();
            case 5:
                return f150323a;
            case 6:
                C63010eb ebVar = f150324e;
                if (ebVar == null) {
                    synchronized (C56366p.class) {
                        ebVar = f150324e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150323a);
                            f150324e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
