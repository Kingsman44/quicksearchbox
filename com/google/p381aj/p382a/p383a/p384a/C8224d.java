package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.d */
/* compiled from: PG */
public final class C8224d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8224d f28875a;

    /* renamed from: e */
    private static volatile C63010eb f28876e;

    /* renamed from: b */
    private int f28877b;

    /* renamed from: c */
    private C8242v f28878c;

    /* renamed from: d */
    private byte f28879d = 2;

    static {
        C8224d dVar = new C8224d();
        f28875a = dVar;
        C62942bv.registerDefaultInstance(C8224d.class, dVar);
    }

    private C8224d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28879d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28879d = b;
                return null;
            case 2:
                return newMessageInfo(f28875a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C8224d();
            case 4:
                return new C8223c();
            case 5:
                return f28875a;
            case 6:
                C63010eb ebVar = f28876e;
                if (ebVar == null) {
                    synchronized (C8224d.class) {
                        ebVar = f28876e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28875a);
                            f28876e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
