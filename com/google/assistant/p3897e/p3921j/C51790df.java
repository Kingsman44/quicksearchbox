package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.df */
/* compiled from: PG */
public final class C51790df extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51790df f135885d;

    /* renamed from: e */
    private static volatile C63010eb f135886e;

    /* renamed from: a */
    public int f135887a;

    /* renamed from: b */
    public boolean f135888b;

    /* renamed from: c */
    public boolean f135889c;

    static {
        C51790df dfVar = new C51790df();
        f135885d = dfVar;
        C62942bv.registerDefaultInstance(C51790df.class, dfVar);
    }

    private C51790df() {
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
                return newMessageInfo(f135885d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51790df();
            case 4:
                return new C51789de();
            case 5:
                return f135885d;
            case 6:
                C63010eb ebVar = f135886e;
                if (ebVar == null) {
                    synchronized (C51790df.class) {
                        ebVar = f135886e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135885d);
                            f135886e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
