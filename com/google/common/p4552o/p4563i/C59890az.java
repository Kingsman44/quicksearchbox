package com.google.common.p4552o.p4563i;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.i.az */
/* compiled from: PG */
public final class C59890az extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59890az f161838e;

    /* renamed from: f */
    private static volatile C63010eb f161839f;

    /* renamed from: a */
    public int f161840a;

    /* renamed from: b */
    public int f161841b;

    /* renamed from: c */
    public String f161842c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f161843d;

    static {
        C59890az azVar = new C59890az();
        f161838e = azVar;
        C62942bv.registerDefaultInstance(C59890az.class, azVar);
    }

    private C59890az() {
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
                return newMessageInfo(f161838e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002ဈ\u0001\u0003ဌ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d", C59889ay.f161837a});
            case 3:
                return new C59890az();
            case 4:
                return new C59888ax();
            case 5:
                return f161838e;
            case 6:
                C63010eb ebVar = f161839f;
                if (ebVar == null) {
                    synchronized (C59890az.class) {
                        ebVar = f161839f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161838e);
                            f161839f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
