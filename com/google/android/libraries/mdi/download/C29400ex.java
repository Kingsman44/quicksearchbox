package com.google.android.libraries.mdi.download;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.libraries.mdi.download.ex */
/* compiled from: PG */
public final class C29400ex extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C29400ex f79706d;

    /* renamed from: e */
    private static volatile C63010eb f79707e;

    /* renamed from: a */
    public int f79708a;

    /* renamed from: b */
    public long f79709b;

    /* renamed from: c */
    public C63042fg f79710c;

    static {
        C29400ex exVar = new C29400ex();
        f79706d = exVar;
        C62942bv.registerDefaultInstance(C29400ex.class, exVar);
    }

    private C29400ex() {
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
                return newMessageInfo(f79706d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C29400ex();
            case 4:
                return new C29399ew();
            case 5:
                return f79706d;
            case 6:
                C63010eb ebVar = f79707e;
                if (ebVar == null) {
                    synchronized (C29400ex.class) {
                        ebVar = f79707e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79706d);
                            f79707e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
