package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.mj */
/* compiled from: PG */
public final class C7853mj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7853mj f27527d;

    /* renamed from: f */
    private static volatile C63010eb f27528f;

    /* renamed from: a */
    public String f27529a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f27530b;

    /* renamed from: c */
    public boolean f27531c;

    /* renamed from: e */
    private int f27532e;

    static {
        C7853mj mjVar = new C7853mj();
        f27527d = mjVar;
        C62942bv.registerDefaultInstance(C7853mj.class, mjVar);
    }

    private C7853mj() {
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
                return newMessageInfo(f27527d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဇ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C7853mj();
            case 4:
                return new C7852mi();
            case 5:
                return f27527d;
            case 6:
                C63010eb ebVar = f27528f;
                if (ebVar == null) {
                    synchronized (C7853mj.class) {
                        ebVar = f27528f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27527d);
                            f27528f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
