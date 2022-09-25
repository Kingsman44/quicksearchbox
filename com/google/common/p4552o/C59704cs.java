package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.cs */
/* compiled from: PG */
public final class C59704cs extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C59704cs f160187e;

    /* renamed from: f */
    private static volatile C63010eb f160188f;

    /* renamed from: a */
    public int f160189a;

    /* renamed from: b */
    public int f160190b;

    /* renamed from: c */
    public String f160191c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public int f160192d;

    static {
        C59704cs csVar = new C59704cs();
        f160187e = csVar;
        C62942bv.registerDefaultInstance(C59704cs.class, csVar);
    }

    private C59704cs() {
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
                return newMessageInfo(f160187e, "\u0001\u0003\u0000\u0001\u0001\u0005\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0004ဈ\u0001\u0005ဌ\u0002", new Object[]{"a", "b", C59700co.m92488b(), C45240c.f118157a, "d", C59703cr.m92490b()});
            case 3:
                return new C59704cs();
            case 4:
                return new C59701cp();
            case 5:
                return f160187e;
            case 6:
                C63010eb ebVar = f160188f;
                if (ebVar == null) {
                    synchronized (C59704cs.class) {
                        ebVar = f160188f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f160187e);
                            f160188f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
