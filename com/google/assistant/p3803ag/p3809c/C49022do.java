package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.do */
/* compiled from: PG */
public final class C49022do extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49022do f126800d;

    /* renamed from: e */
    private static volatile C63010eb f126801e;

    /* renamed from: a */
    public int f126802a;

    /* renamed from: b */
    public int f126803b;

    /* renamed from: c */
    public String f126804c = BuildConfig.FLAVOR;

    static {
        C49022do doVar = new C49022do();
        f126800d = doVar;
        C62942bv.registerDefaultInstance(C49022do.class, doVar);
    }

    private C49022do() {
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
                return newMessageInfo(f126800d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C53306j.m86810b(), C45240c.f118157a});
            case 3:
                return new C49022do();
            case 4:
                return new C49021dn();
            case 5:
                return f126800d;
            case 6:
                C63010eb ebVar = f126801e;
                if (ebVar == null) {
                    synchronized (C49022do.class) {
                        ebVar = f126801e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126800d);
                            f126801e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
