package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.iw */
/* compiled from: PG */
public final class C7758iw extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C7758iw f27160d;

    /* renamed from: f */
    private static volatile C63010eb f27161f;

    /* renamed from: a */
    public String f27162a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f27163b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f27164c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f27165e;

    static {
        C7758iw iwVar = new C7758iw();
        f27160d = iwVar;
        C62942bv.registerDefaultInstance(C7758iw.class, iwVar);
    }

    private C7758iw() {
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
                return newMessageInfo(f27160d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C7758iw();
            case 4:
                return new C7757iv();
            case 5:
                return f27160d;
            case 6:
                C63010eb ebVar = f27161f;
                if (ebVar == null) {
                    synchronized (C7758iw.class) {
                        ebVar = f27161f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27160d);
                            f27161f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
