package com.google.android.libraries.lens.ondevice.p2037n;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4172bg.C55694ab;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.lens.ondevice.n.an */
/* compiled from: PG */
public final class C24781an extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C24781an f67714d;

    /* renamed from: e */
    private static volatile C63010eb f67715e;

    /* renamed from: a */
    public int f67716a;

    /* renamed from: b */
    public C55694ab f67717b;

    /* renamed from: c */
    public C62995dn f67718c = C62995dn.f170057a;

    static {
        C24781an anVar = new C24781an();
        f67714d = anVar;
        C62942bv.registerDefaultInstance(C24781an.class, anVar);
    }

    private C24781an() {
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
                return newMessageInfo(f67714d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0001\u0000\u0000\u0001ဉ\u0000\u00022", new Object[]{"a", "b", C45240c.f118157a, C24780am.f67713a});
            case 3:
                return new C24781an();
            case 4:
                return new C24779al();
            case 5:
                return f67714d;
            case 6:
                C63010eb ebVar = f67715e;
                if (ebVar == null) {
                    synchronized (C24781an.class) {
                        ebVar = f67715e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f67714d);
                            f67715e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
