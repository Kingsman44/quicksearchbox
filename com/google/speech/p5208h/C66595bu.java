package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.h.bu */
/* compiled from: PG */
public final class C66595bu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C66595bu f181148e;

    /* renamed from: f */
    private static volatile C63010eb f181149f;

    /* renamed from: a */
    public int f181150a;

    /* renamed from: b */
    public int f181151b;

    /* renamed from: c */
    public boolean f181152c;

    /* renamed from: d */
    public String f181153d = BuildConfig.FLAVOR;

    static {
        C66595bu buVar = new C66595bu();
        f181148e = buVar;
        C62942bv.registerDefaultInstance(C66595bu.class, buVar);
    }

    private C66595bu() {
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
                return newMessageInfo(f181148e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C66594bt.f181147a, C45240c.f118157a, "d"});
            case 3:
                return new C66595bu();
            case 4:
                return new C66593bs();
            case 5:
                return f181148e;
            case 6:
                C63010eb ebVar = f181149f;
                if (ebVar == null) {
                    synchronized (C66595bu.class) {
                        ebVar = f181149f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181148e);
                            f181149f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
