package com.google.android.libraries.mdi.download;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.mdi.download.ef */
/* compiled from: PG */
public final class C29382ef extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C29382ef f79648c;

    /* renamed from: e */
    private static volatile C63010eb f79649e;

    /* renamed from: a */
    public String f79650a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f79651b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f79652d;

    static {
        C29382ef efVar = new C29382ef();
        f79648c = efVar;
        C62942bv.registerDefaultInstance(C29382ef.class, efVar);
    }

    private C29382ef() {
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
                return newMessageInfo(f79648c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C29382ef();
            case 4:
                return new C29381ee();
            case 5:
                return f79648c;
            case 6:
                C63010eb ebVar = f79649e;
                if (ebVar == null) {
                    synchronized (C29382ef.class) {
                        ebVar = f79649e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f79648c);
                            f79649e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
