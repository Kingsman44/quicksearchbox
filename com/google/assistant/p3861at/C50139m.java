package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.m */
/* compiled from: PG */
public final class C50139m extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50139m f130345f;

    /* renamed from: g */
    private static volatile C63010eb f130346g;

    /* renamed from: a */
    public int f130347a;

    /* renamed from: b */
    public String f130348b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f130349c;

    /* renamed from: d */
    public String f130350d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f130351e;

    static {
        C50139m mVar = new C50139m();
        f130345f = mVar;
        C62942bv.registerDefaultInstance(C50139m.class, mVar);
    }

    private C50139m() {
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
                return newMessageInfo(f130345f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C50112l.f130273a});
            case 3:
                return new C50139m();
            case 4:
                return new C50085k();
            case 5:
                return f130345f;
            case 6:
                C63010eb ebVar = f130346g;
                if (ebVar == null) {
                    synchronized (C50139m.class) {
                        ebVar = f130346g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130345f);
                            f130346g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
