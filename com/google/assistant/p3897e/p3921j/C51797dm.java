package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3803ag.p3809c.C48980c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.dm */
/* compiled from: PG */
public final class C51797dm extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51797dm f135902d;

    /* renamed from: e */
    private static volatile C63010eb f135903e;

    /* renamed from: a */
    public int f135904a;

    /* renamed from: b */
    public int f135905b;

    /* renamed from: c */
    public boolean f135906c;

    static {
        C51797dm dmVar = new C51797dm();
        f135902d = dmVar;
        C62942bv.registerDefaultInstance(C51797dm.class, dmVar);
    }

    private C51797dm() {
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
                return newMessageInfo(f135902d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C48980c.m85332b(), C45240c.f118157a});
            case 3:
                return new C51797dm();
            case 4:
                return new C51796dl();
            case 5:
                return f135902d;
            case 6:
                C63010eb ebVar = f135903e;
                if (ebVar == null) {
                    synchronized (C51797dm.class) {
                        ebVar = f135903e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135902d);
                            f135903e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
