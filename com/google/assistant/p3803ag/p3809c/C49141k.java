package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.k */
/* compiled from: PG */
public final class C49141k extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C49141k f127075d;

    /* renamed from: f */
    private static volatile C63010eb f127076f;

    /* renamed from: a */
    public String f127077a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C49143m f127078b;

    /* renamed from: c */
    public int f127079c;

    /* renamed from: e */
    private int f127080e;

    static {
        C49141k kVar = new C49141k();
        f127075d = kVar;
        C62942bv.registerDefaultInstance(C49141k.class, kVar);
    }

    private C49141k() {
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
                return newMessageInfo(f127075d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003ဌ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a, C49139i.f127074a});
            case 3:
                return new C49141k();
            case 4:
                return new C49115h();
            case 5:
                return f127075d;
            case 6:
                C63010eb ebVar = f127076f;
                if (ebVar == null) {
                    synchronized (C49141k.class) {
                        ebVar = f127076f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127075d);
                            f127076f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
