package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.common.o.de */
/* compiled from: PG */
public final class C59720de extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59720de f160297d;

    /* renamed from: e */
    private static volatile C63010eb f160298e;

    /* renamed from: a */
    public int f160299a;

    /* renamed from: b */
    public int f160300b;

    /* renamed from: c */
    public C63042fg f160301c;

    static {
        C59720de deVar = new C59720de();
        f160297d = deVar;
        C62942bv.registerDefaultInstance(C59720de.class, deVar);
    }

    private C59720de() {
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
                return newMessageInfo(f160297d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C59718dc.f160296a, C45240c.f118157a});
            case 3:
                return new C59720de();
            case 4:
                return new C59719dd();
            case 5:
                return f160297d;
            case 6:
                C63010eb ebVar = f160298e;
                if (ebVar == null) {
                    synchronized (C59720de.class) {
                        ebVar = f160298e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160297d);
                            f160298e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
