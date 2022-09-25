package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aj */
/* compiled from: PG */
public final class C49825aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49825aj f129452c;

    /* renamed from: e */
    private static volatile C63010eb f129453e;

    /* renamed from: a */
    public String f129454a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f129455b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f129456d;

    static {
        C49825aj ajVar = new C49825aj();
        f129452c = ajVar;
        C62942bv.registerDefaultInstance(C49825aj.class, ajVar);
    }

    private C49825aj() {
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
                return newMessageInfo(f129452c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C49825aj();
            case 4:
                return new C49824ai();
            case 5:
                return f129452c;
            case 6:
                C63010eb ebVar = f129453e;
                if (ebVar == null) {
                    synchronized (C49825aj.class) {
                        ebVar = f129453e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129452c);
                            f129453e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
