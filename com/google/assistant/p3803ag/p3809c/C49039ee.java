package com.google.assistant.p3803ag.p3809c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.c.ee */
/* compiled from: PG */
public final class C49039ee extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49039ee f126830c;

    /* renamed from: e */
    private static volatile C63010eb f126831e;

    /* renamed from: a */
    public String f126832a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C49036eb f126833b;

    /* renamed from: d */
    private int f126834d;

    static {
        C49039ee eeVar = new C49039ee();
        f126830c = eeVar;
        C62942bv.registerDefaultInstance(C49039ee.class, eeVar);
    }

    private C49039ee() {
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
                return newMessageInfo(f126830c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49039ee();
            case 4:
                return new C49038ed();
            case 5:
                return f126830c;
            case 6:
                C63010eb ebVar = f126831e;
                if (ebVar == null) {
                    synchronized (C49039ee.class) {
                        ebVar = f126831e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126830c);
                            f126831e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
