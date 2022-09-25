package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.mj */
/* compiled from: PG */
public final class C51564mj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51564mj f134396d;

    /* renamed from: e */
    private static volatile C63010eb f134397e;

    /* renamed from: a */
    public int f134398a;

    /* renamed from: b */
    public long f134399b;

    /* renamed from: c */
    public long f134400c;

    static {
        C51564mj mjVar = new C51564mj();
        f134396d = mjVar;
        C62942bv.registerDefaultInstance(C51564mj.class, mjVar);
    }

    private C51564mj() {
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
                return newMessageInfo(f134396d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C51564mj();
            case 4:
                return new C51563mi();
            case 5:
                return f134396d;
            case 6:
                C63010eb ebVar = f134397e;
                if (ebVar == null) {
                    synchronized (C51564mj.class) {
                        ebVar = f134397e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134396d);
                            f134397e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
