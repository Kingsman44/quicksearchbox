package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ch */
/* compiled from: PG */
public final class C87753ch extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C87753ch f237506e;

    /* renamed from: f */
    private static volatile C63010eb f237507f;

    /* renamed from: a */
    public int f237508a;

    /* renamed from: b */
    public String f237509b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f237510c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f237511d;

    static {
        C87753ch chVar = new C87753ch();
        f237506e = chVar;
        C62942bv.registerDefaultInstance(C87753ch.class, chVar);
    }

    private C87753ch() {
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
                return newMessageInfo(f237506e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဂ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C87753ch();
            case 4:
                return new C87752cg();
            case 5:
                return f237506e;
            case 6:
                C63010eb ebVar = f237507f;
                if (ebVar == null) {
                    synchronized (C87753ch.class) {
                        ebVar = f237507f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237506e);
                            f237507f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
