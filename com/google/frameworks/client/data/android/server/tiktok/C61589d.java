package com.google.frameworks.client.data.android.server.tiktok;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.frameworks.client.data.android.server.tiktok.d */
/* compiled from: PG */
public final class C61589d extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61589d f166445c;

    /* renamed from: e */
    private static volatile C63010eb f166446e;

    /* renamed from: a */
    public String f166447a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f166448b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f166449d;

    static {
        C61589d dVar = new C61589d();
        f166445c = dVar;
        C62942bv.registerDefaultInstance(C61589d.class, dVar);
    }

    private C61589d() {
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
                return newMessageInfo(f166445c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C61589d();
            case 4:
                return new C61588c();
            case 5:
                return f166445c;
            case 6:
                C63010eb ebVar = f166446e;
                if (ebVar == null) {
                    synchronized (C61589d.class) {
                        ebVar = f166446e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166445c);
                            f166446e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
