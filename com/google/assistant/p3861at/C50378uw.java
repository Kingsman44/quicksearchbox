package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.uw */
/* compiled from: PG */
public final class C50378uw extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C50378uw f131140c;

    /* renamed from: d */
    private static volatile C63010eb f131141d;

    /* renamed from: a */
    public int f131142a;

    /* renamed from: b */
    public String f131143b = BuildConfig.FLAVOR;

    static {
        C50378uw uwVar = new C50378uw();
        f131140c = uwVar;
        C62942bv.registerDefaultInstance(C50378uw.class, uwVar);
    }

    private C50378uw() {
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
                return newMessageInfo(f131140c, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0003", new Object[]{"a", "b"});
            case 3:
                return new C50378uw();
            case 4:
                return new C50377uv();
            case 5:
                return f131140c;
            case 6:
                C63010eb ebVar = f131141d;
                if (ebVar == null) {
                    synchronized (C50378uw.class) {
                        ebVar = f131141d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131140c);
                            f131141d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
