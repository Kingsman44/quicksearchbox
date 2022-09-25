package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.uq */
/* compiled from: PG */
public final class C50372uq extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50372uq f131121e;

    /* renamed from: f */
    private static volatile C63010eb f131122f;

    /* renamed from: a */
    public int f131123a;

    /* renamed from: b */
    public int f131124b;

    /* renamed from: c */
    public C50369un f131125c;

    /* renamed from: d */
    public C50337ti f131126d;

    static {
        C50372uq uqVar = new C50372uq();
        f131121e = uqVar;
        C62942bv.registerDefaultInstance(C50372uq.class, uqVar);
    }

    private C50372uq() {
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
                return newMessageInfo(f131121e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0004ဉ\u0002", new Object[]{"a", "b", C50370uo.f131120a, C45240c.f118157a, "d"});
            case 3:
                return new C50372uq();
            case 4:
                return new C50367ul();
            case 5:
                return f131121e;
            case 6:
                C63010eb ebVar = f131122f;
                if (ebVar == null) {
                    synchronized (C50372uq.class) {
                        ebVar = f131122f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131121e);
                            f131122f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
