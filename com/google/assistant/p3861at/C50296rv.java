package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.rv */
/* compiled from: PG */
public final class C50296rv extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50296rv f130886d;

    /* renamed from: f */
    private static volatile C63010eb f130887f;

    /* renamed from: a */
    public String f130888a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f130889b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130890c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f130891e;

    static {
        C50296rv rvVar = new C50296rv();
        f130886d = rvVar;
        C62942bv.registerDefaultInstance(C50296rv.class, rvVar);
    }

    private C50296rv() {
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
                return newMessageInfo(f130886d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C50296rv();
            case 4:
                return new C50295ru();
            case 5:
                return f130886d;
            case 6:
                C63010eb ebVar = f130887f;
                if (ebVar == null) {
                    synchronized (C50296rv.class) {
                        ebVar = f130887f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130886d);
                            f130887f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
