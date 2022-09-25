package com.google.assistant.p3897e.p3902c.p3907c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.fl */
/* compiled from: PG */
public final class C51075fl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51075fl f132982e;

    /* renamed from: f */
    private static volatile C63010eb f132983f;

    /* renamed from: a */
    public int f132984a;

    /* renamed from: b */
    public String f132985b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f132986c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C51073fj f132987d;

    static {
        C51075fl flVar = new C51075fl();
        f132982e = flVar;
        C62942bv.registerDefaultInstance(C51075fl.class, flVar);
    }

    private C51075fl() {
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
                return newMessageInfo(f132982e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51075fl();
            case 4:
                return new C51074fk();
            case 5:
                return f132982e;
            case 6:
                C63010eb ebVar = f132983f;
                if (ebVar == null) {
                    synchronized (C51075fl.class) {
                        ebVar = f132983f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132982e);
                            f132983f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
