package com.google.p4184bj.p4193c.p4197c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bj.c.c.aq */
/* compiled from: PG */
public final class C55943aq extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C55943aq f148904d;

    /* renamed from: f */
    private static volatile C63010eb f148905f;

    /* renamed from: a */
    public int f148906a;

    /* renamed from: b */
    public boolean f148907b;

    /* renamed from: c */
    public boolean f148908c;

    /* renamed from: e */
    private int f148909e;

    static {
        C55943aq aqVar = new C55943aq();
        f148904d = aqVar;
        C62942bv.registerDefaultInstance(C55943aq.class, aqVar);
    }

    private C55943aq() {
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
                return newMessageInfo(f148904d, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဇ\u0001\u0004ဇ\u0003", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C55943aq();
            case 4:
                return new C55942ap();
            case 5:
                return f148904d;
            case 6:
                C63010eb ebVar = f148905f;
                if (ebVar == null) {
                    synchronized (C55943aq.class) {
                        ebVar = f148905f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f148904d);
                            f148905f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
