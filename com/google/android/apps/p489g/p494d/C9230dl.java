package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.dl */
/* compiled from: PG */
public final class C9230dl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C9230dl f31903f;

    /* renamed from: g */
    private static volatile C63010eb f31904g;

    /* renamed from: a */
    public int f31905a;

    /* renamed from: b */
    public String f31906b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f31907c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f31908d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f31909e = emptyProtobufList();

    static {
        C9230dl dlVar = new C9230dl();
        f31903f = dlVar;
        C62942bv.registerDefaultInstance(C9230dl.class, dlVar);
    }

    private C9230dl() {
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
                return newMessageInfo(f31903f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C9228dj.class});
            case 3:
                return new C9230dl();
            case 4:
                return new C9229dk();
            case 5:
                return f31903f;
            case 6:
                C63010eb ebVar = f31904g;
                if (ebVar == null) {
                    synchronized (C9230dl.class) {
                        ebVar = f31904g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31903f);
                            f31904g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
