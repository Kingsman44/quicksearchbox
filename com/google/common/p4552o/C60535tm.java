package com.google.common.p4552o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.tm */
/* compiled from: PG */
public final class C60535tm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C60535tm f163949d;

    /* renamed from: e */
    private static volatile C63010eb f163950e;

    /* renamed from: a */
    public int f163951a;

    /* renamed from: b */
    public int f163952b = 1;

    /* renamed from: c */
    public int f163953c;

    static {
        C60535tm tmVar = new C60535tm();
        f163949d = tmVar;
        C62942bv.registerDefaultInstance(C60535tm.class, tmVar);
    }

    private C60535tm() {
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
                return newMessageInfo(f163949d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C60534tl.m92606b(), C45240c.f118157a});
            case 3:
                return new C60535tm();
            case 4:
                return new C60532tj();
            case 5:
                return f163949d;
            case 6:
                C63010eb ebVar = f163950e;
                if (ebVar == null) {
                    synchronized (C60535tm.class) {
                        ebVar = f163950e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f163949d);
                            f163950e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
