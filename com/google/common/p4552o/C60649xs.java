package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.xs */
/* compiled from: PG */
public final class C60649xs extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60649xs f164537d;

    /* renamed from: e */
    private static volatile C63010eb f164538e;

    /* renamed from: a */
    public int f164539a;

    /* renamed from: b */
    public C62961ch f164540b = emptyIntList();

    /* renamed from: c */
    public boolean f164541c;

    static {
        C60649xs xsVar = new C60649xs();
        f164537d = xsVar;
        C62942bv.registerDefaultInstance(C60649xs.class, xsVar);
    }

    private C60649xs() {
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
                return newMessageInfo(f164537d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u0016\u0002ဇ\u0000", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C60649xs();
            case 4:
                return new C60648xr();
            case 5:
                return f164537d;
            case 6:
                C63010eb ebVar = f164538e;
                if (ebVar == null) {
                    synchronized (C60649xs.class) {
                        ebVar = f164538e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164537d);
                            f164538e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
