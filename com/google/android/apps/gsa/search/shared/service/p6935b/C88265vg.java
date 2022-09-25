package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.vg */
/* compiled from: PG */
public final class C88265vg extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88265vg f238734c;

    /* renamed from: d */
    private static volatile C63010eb f238735d;

    /* renamed from: a */
    public int f238736a;

    /* renamed from: b */
    public boolean f238737b;

    static {
        C88265vg vgVar = new C88265vg();
        f238734c = vgVar;
        C62942bv.registerDefaultInstance(C88265vg.class, vgVar);
    }

    private C88265vg() {
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
                return newMessageInfo(f238734c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C88265vg();
            case 4:
                return new C88264vf();
            case 5:
                return f238734c;
            case 6:
                C63010eb ebVar = f238735d;
                if (ebVar == null) {
                    synchronized (C88265vg.class) {
                        ebVar = f238735d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238734c);
                            f238735d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
