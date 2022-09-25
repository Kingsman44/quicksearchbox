package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.qd */
/* compiled from: PG */
public final class C88127qd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C88127qd f238234c;

    /* renamed from: e */
    private static volatile C63010eb f238235e;

    /* renamed from: a */
    public String f238236a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f238237b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f238238d;

    static {
        C88127qd qdVar = new C88127qd();
        f238234c = qdVar;
        C62942bv.registerDefaultInstance(C88127qd.class, qdVar);
    }

    private C88127qd() {
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
                return newMessageInfo(f238234c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C88127qd();
            case 4:
                return new C88126qc();
            case 5:
                return f238234c;
            case 6:
                C63010eb ebVar = f238235e;
                if (ebVar == null) {
                    synchronized (C88127qd.class) {
                        ebVar = f238235e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f238234c);
                            f238235e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
