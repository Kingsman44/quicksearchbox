package com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9258a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.a.a.l */
/* compiled from: PG */
public final class C122103l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C122103l f338754c;

    /* renamed from: d */
    private static volatile C63010eb f338755d;

    /* renamed from: a */
    public int f338756a;

    /* renamed from: b */
    public String f338757b = BuildConfig.FLAVOR;

    static {
        C122103l lVar = new C122103l();
        f338754c = lVar;
        C62942bv.registerDefaultInstance(C122103l.class, lVar);
    }

    private C122103l() {
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
                return newMessageInfo(f338754c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C122103l();
            case 4:
                return new C122102k();
            case 5:
                return f338754c;
            case 6:
                C63010eb ebVar = f338755d;
                if (ebVar == null) {
                    synchronized (C122103l.class) {
                        ebVar = f338755d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f338754c);
                            f338755d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
