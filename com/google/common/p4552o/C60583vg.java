package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.vg */
/* compiled from: PG */
public final class C60583vg extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60583vg f164342e;

    /* renamed from: f */
    private static volatile C63010eb f164343f;

    /* renamed from: a */
    public int f164344a;

    /* renamed from: b */
    public int f164345b;

    /* renamed from: c */
    public C60585vi f164346c;

    /* renamed from: d */
    public int f164347d;

    static {
        C60583vg vgVar = new C60583vg();
        f164342e = vgVar;
        C62942bv.registerDefaultInstance(C60583vg.class, vgVar);
    }

    private C60583vg() {
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
                return newMessageInfo(f164342e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C60580vd.m92624b(), C45240c.f118157a, "d", C60581ve.f164341a});
            case 3:
                return new C60583vg();
            case 4:
                return new C60578vb();
            case 5:
                return f164342e;
            case 6:
                C63010eb ebVar = f164343f;
                if (ebVar == null) {
                    synchronized (C60583vg.class) {
                        ebVar = f164343f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f164342e);
                            f164343f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
