package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.at.wl */
/* compiled from: PG */
public final class C50421wl extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50421wl f131233d;

    /* renamed from: e */
    private static volatile C63010eb f131234e;

    /* renamed from: a */
    public int f131235a;

    /* renamed from: b */
    public String f131236b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C63088z f131237c = C63088z.f170246b;

    static {
        C50421wl wlVar = new C50421wl();
        f131233d = wlVar;
        C62942bv.registerDefaultInstance(C50421wl.class, wlVar);
    }

    private C50421wl() {
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
                return newMessageInfo(f131233d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0003ည\u0002", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C50421wl();
            case 4:
                return new C50420wk();
            case 5:
                return f131233d;
            case 6:
                C63010eb ebVar = f131234e;
                if (ebVar == null) {
                    synchronized (C50421wl.class) {
                        ebVar = f131234e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131233d);
                            f131234e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
