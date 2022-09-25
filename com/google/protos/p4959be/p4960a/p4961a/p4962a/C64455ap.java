package com.google.protos.p4959be.p4960a.p4961a.p4962a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.be.a.a.a.ap */
/* compiled from: PG */
public final class C64455ap extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C64455ap f174839d;

    /* renamed from: e */
    private static volatile C63010eb f174840e;

    /* renamed from: a */
    public int f174841a = 0;

    /* renamed from: b */
    public Object f174842b;

    /* renamed from: c */
    public C62910ar f174843c;

    static {
        C64455ap apVar = new C64455ap();
        f174839d = apVar;
        C62942bv.registerDefaultInstance(C64455ap.class, apVar);
    }

    private C64455ap() {
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
                return newMessageInfo(f174839d, "\u0000\u0006\u0001\u0000\u0001\u0006\u0006\u0000\u0000\u0000\u0001\t\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0006<\u0000", new Object[]{"b", "a", C45240c.f118157a, C64454ao.class, C64450ak.class, C64547w.class, C64448ai.class, C64452am.class});
            case 3:
                return new C64455ap();
            case 4:
                return new C64545u();
            case 5:
                return f174839d;
            case 6:
                C63010eb ebVar = f174840e;
                if (ebVar == null) {
                    synchronized (C64455ap.class) {
                        ebVar = f174840e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f174839d);
                            f174840e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
