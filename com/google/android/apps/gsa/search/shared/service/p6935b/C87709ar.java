package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.ar */
/* compiled from: PG */
public final class C87709ar extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C87709ar f237172f;

    /* renamed from: g */
    private static volatile C63010eb f237173g;

    /* renamed from: a */
    public int f237174a;

    /* renamed from: b */
    public C63088z f237175b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f237176c;

    /* renamed from: d */
    public C63088z f237177d;

    /* renamed from: e */
    public boolean f237178e;

    static {
        C87709ar arVar = new C87709ar();
        f237172f = arVar;
        C62942bv.registerDefaultInstance(C87709ar.class, arVar);
    }

    private C87709ar() {
        C63088z zVar = C63088z.f170246b;
        this.f237176c = zVar;
        this.f237177d = zVar;
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
                return newMessageInfo(f237172f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ည\u0000\u0003ည\u0002\u0004ည\u0003\u0005ဇ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C87709ar();
            case 4:
                return new C87708aq();
            case 5:
                return f237172f;
            case 6:
                C63010eb ebVar = f237173g;
                if (ebVar == null) {
                    synchronized (C87709ar.class) {
                        ebVar = f237173g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237172f);
                            f237173g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
