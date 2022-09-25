package com.google.assistant.p3858ar.p3859a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.m */
/* compiled from: PG */
public final class C49723m extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C49723m f128331b;

    /* renamed from: d */
    private static volatile C63010eb f128332d;

    /* renamed from: a */
    public String f128333a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f128334c;

    static {
        C49723m mVar = new C49723m();
        f128331b = mVar;
        C62942bv.registerDefaultInstance(C49723m.class, mVar);
    }

    private C49723m() {
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
                return newMessageInfo(f128331b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C49723m();
            case 4:
                return new C49722l();
            case 5:
                return f128331b;
            case 6:
                C63010eb ebVar = f128332d;
                if (ebVar == null) {
                    synchronized (C49723m.class) {
                        ebVar = f128332d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128331b);
                            f128332d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
