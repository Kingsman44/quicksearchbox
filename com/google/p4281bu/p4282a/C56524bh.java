package com.google.p4281bu.p4282a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.bh */
/* compiled from: PG */
public final class C56524bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C56524bh f150947d;

    /* renamed from: e */
    private static volatile C63010eb f150948e;

    /* renamed from: a */
    public int f150949a = 0;

    /* renamed from: b */
    public Object f150950b;

    /* renamed from: c */
    public C62910ar f150951c;

    static {
        C56524bh bhVar = new C56524bh();
        f150947d = bhVar;
        C62942bv.registerDefaultInstance(C56524bh.class, bhVar);
    }

    private C56524bh() {
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
                return newMessageInfo(f150947d, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C45240c.f118157a, C56523bg.class, C56519bc.class, C56502am.class, C56517ba.class, C56521be.class});
            case 3:
                return new C56524bh();
            case 4:
                return new C56500ak();
            case 5:
                return f150947d;
            case 6:
                C63010eb ebVar = f150948e;
                if (ebVar == null) {
                    synchronized (C56524bh.class) {
                        ebVar = f150948e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150947d);
                            f150948e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
