package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.dd */
/* compiled from: PG */
public final class C29318dd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C29318dd f79461c;

    /* renamed from: d */
    private static volatile C63010eb f79462d;

    /* renamed from: a */
    public int f79463a;

    /* renamed from: b */
    public String f79464b = BuildConfig.FLAVOR;

    static {
        C29318dd ddVar = new C29318dd();
        f79461c = ddVar;
        C62942bv.registerDefaultInstance(C29318dd.class, ddVar);
    }

    private C29318dd() {
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
                return newMessageInfo(f79461c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C29318dd();
            case 4:
                return new C29317dc();
            case 5:
                return f79461c;
            case 6:
                C63010eb ebVar = f79462d;
                if (ebVar == null) {
                    synchronized (C29318dd.class) {
                        ebVar = f79462d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79461c);
                            f79462d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
