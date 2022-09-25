package com.google.p375ai.p378b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ck */
/* compiled from: PG */
public final class C7584ck extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C7584ck f26200e;

    /* renamed from: f */
    private static volatile C63010eb f26201f;

    /* renamed from: a */
    public int f26202a;

    /* renamed from: b */
    public String f26203b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f26204c;

    /* renamed from: d */
    public String f26205d = BuildConfig.FLAVOR;

    static {
        C7584ck ckVar = new C7584ck();
        f26200e = ckVar;
        C62942bv.registerDefaultInstance(C7584ck.class, ckVar);
    }

    private C7584ck() {
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
                return newMessageInfo(f26200e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C7583cj.m22786b(), "d"});
            case 3:
                return new C7584ck();
            case 4:
                return new C7581ch();
            case 5:
                return f26200e;
            case 6:
                C63010eb ebVar = f26201f;
                if (ebVar == null) {
                    synchronized (C7584ck.class) {
                        ebVar = f26201f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26200e);
                            f26201f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
