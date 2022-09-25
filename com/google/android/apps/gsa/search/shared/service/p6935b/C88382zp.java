package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.zp */
/* compiled from: PG */
public final class C88382zp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88382zp f238991e;

    /* renamed from: f */
    private static volatile C63010eb f238992f;

    /* renamed from: a */
    public int f238993a;

    /* renamed from: b */
    public String f238994b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f238995c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f238996d = BuildConfig.FLAVOR;

    static {
        C88382zp zpVar = new C88382zp();
        f238991e = zpVar;
        C62942bv.registerDefaultInstance(C88382zp.class, zpVar);
    }

    private C88382zp() {
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
                return newMessageInfo(f238991e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88382zp();
            case 4:
                return new C88381zo();
            case 5:
                return f238991e;
            case 6:
                C63010eb ebVar = f238992f;
                if (ebVar == null) {
                    synchronized (C88382zp.class) {
                        ebVar = f238992f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238991e);
                            f238992f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
