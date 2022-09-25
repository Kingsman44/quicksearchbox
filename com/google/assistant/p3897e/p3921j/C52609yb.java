package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.yb */
/* compiled from: PG */
public final class C52609yb extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52609yb f138130d;

    /* renamed from: e */
    private static volatile C63010eb f138131e;

    /* renamed from: a */
    public int f138132a;

    /* renamed from: b */
    public int f138133b;

    /* renamed from: c */
    public long f138134c;

    static {
        C52609yb ybVar = new C52609yb();
        f138130d = ybVar;
        C62942bv.registerDefaultInstance(C52609yb.class, ybVar);
    }

    private C52609yb() {
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
                return newMessageInfo(f138130d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C52608ya.f138129a, C45240c.f118157a});
            case 3:
                return new C52609yb();
            case 4:
                return new C52606xz();
            case 5:
                return f138130d;
            case 6:
                C63010eb ebVar = f138131e;
                if (ebVar == null) {
                    synchronized (C52609yb.class) {
                        ebVar = f138131e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138130d);
                            f138131e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
