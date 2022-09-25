package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

@Deprecated
/* renamed from: com.google.assistant.e.j.qp */
/* compiled from: PG */
public final class C52407qp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52407qp f137523d;

    /* renamed from: e */
    private static volatile C63010eb f137524e;

    /* renamed from: a */
    public int f137525a;

    /* renamed from: b */
    public long f137526b;

    /* renamed from: c */
    public int f137527c;

    static {
        C52407qp qpVar = new C52407qp();
        f137523d = qpVar;
        C62942bv.registerDefaultInstance(C52407qp.class, qpVar);
    }

    private C52407qp() {
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
                return newMessageInfo(f137523d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52407qp();
            case 4:
                return new C52406qo();
            case 5:
                return f137523d;
            case 6:
                C63010eb ebVar = f137524e;
                if (ebVar == null) {
                    synchronized (C52407qp.class) {
                        ebVar = f137524e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137523d);
                            f137524e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
