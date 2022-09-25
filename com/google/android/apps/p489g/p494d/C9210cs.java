package com.google.android.apps.p489g.p494d;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.cs */
/* compiled from: PG */
public final class C9210cs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C9210cs f31814e;

    /* renamed from: f */
    private static volatile C63010eb f31815f;

    /* renamed from: a */
    public int f31816a;

    /* renamed from: b */
    public String f31817b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f31818c;

    /* renamed from: d */
    public String f31819d = BuildConfig.FLAVOR;

    static {
        C9210cs csVar = new C9210cs();
        f31814e = csVar;
        C62942bv.registerDefaultInstance(C9210cs.class, csVar);
    }

    private C9210cs() {
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
                return newMessageInfo(f31814e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C9209cr.m23691b(), "d"});
            case 3:
                return new C9210cs();
            case 4:
                return new C9207cp();
            case 5:
                return f31814e;
            case 6:
                C63010eb ebVar = f31815f;
                if (ebVar == null) {
                    synchronized (C9210cs.class) {
                        ebVar = f31815f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31814e);
                            f31815f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
