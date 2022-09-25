package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.fi */
/* compiled from: PG */
public final class C82920fi extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C82920fi f226214c;

    /* renamed from: d */
    private static volatile C63010eb f226215d;

    /* renamed from: a */
    public int f226216a;

    /* renamed from: b */
    public int f226217b;

    static {
        C82920fi fiVar = new C82920fi();
        f226214c = fiVar;
        C62942bv.registerDefaultInstance(C82920fi.class, fiVar);
    }

    private C82920fi() {
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
                return newMessageInfo(f226214c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0000", new Object[]{"a", "b", C82918fg.f226213a});
            case 3:
                return new C82920fi();
            case 4:
                return new C82917ff();
            case 5:
                return f226214c;
            case 6:
                C63010eb ebVar = f226215d;
                if (ebVar == null) {
                    synchronized (C82920fi.class) {
                        ebVar = f226215d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f226214c);
                            f226215d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
