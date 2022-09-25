package com.google.p4283bv.p4354e.p4356b.p4358b.p4362c.p4363a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.b.b.c.a.e */
/* compiled from: PG */
public final class C57174e extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57174e f152633d;

    /* renamed from: e */
    private static volatile C63010eb f152634e;

    /* renamed from: a */
    public int f152635a;

    /* renamed from: b */
    public long f152636b;

    /* renamed from: c */
    public String f152637c = BuildConfig.FLAVOR;

    static {
        C57174e eVar = new C57174e();
        f152633d = eVar;
        C62942bv.registerDefaultInstance(C57174e.class, eVar);
    }

    private C57174e() {
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
                return newMessageInfo(f152633d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဂ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C57174e();
            case 4:
                return new C57173d();
            case 5:
                return f152633d;
            case 6:
                C63010eb ebVar = f152634e;
                if (ebVar == null) {
                    synchronized (C57174e.class) {
                        ebVar = f152634e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f152633d);
                            f152634e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
