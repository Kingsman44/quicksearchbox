package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.hv */
/* compiled from: PG */
public final class C51441hv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51441hv f133969d;

    /* renamed from: e */
    private static volatile C63010eb f133970e;

    /* renamed from: a */
    public int f133971a;

    /* renamed from: b */
    public int f133972b;

    /* renamed from: c */
    public boolean f133973c;

    static {
        C51441hv hvVar = new C51441hv();
        f133969d = hvVar;
        C62942bv.registerDefaultInstance(C51441hv.class, hvVar);
    }

    private C51441hv() {
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
                return newMessageInfo(f133969d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C51440hu.f133968a, C45240c.f118157a});
            case 3:
                return new C51441hv();
            case 4:
                return new C51439ht();
            case 5:
                return f133969d;
            case 6:
                C63010eb ebVar = f133970e;
                if (ebVar == null) {
                    synchronized (C51441hv.class) {
                        ebVar = f133970e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133969d);
                            f133970e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
