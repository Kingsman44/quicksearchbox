package com.google.p4117aw.p4118a.p4119a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aw.a.a.m */
/* compiled from: PG */
public final class C54635m extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54635m f143445d;

    /* renamed from: e */
    private static volatile C63010eb f143446e;

    /* renamed from: a */
    public int f143447a;

    /* renamed from: b */
    public int f143448b;

    /* renamed from: c */
    public C54633k f143449c;

    static {
        C54635m mVar = new C54635m();
        f143445d = mVar;
        C62942bv.registerDefaultInstance(C54635m.class, mVar);
    }

    private C54635m() {
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
                return newMessageInfo(f143445d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C54624b.m87508b(), C45240c.f118157a});
            case 3:
                return new C54635m();
            case 4:
                return new C54634l();
            case 5:
                return f143445d;
            case 6:
                C63010eb ebVar = f143446e;
                if (ebVar == null) {
                    synchronized (C54635m.class) {
                        ebVar = f143446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143445d);
                            f143446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
