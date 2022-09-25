package com.google.assistant.p3858ar.p3859a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ar.a.h */
/* compiled from: PG */
public final class C49718h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49718h f128312c;

    /* renamed from: d */
    private static volatile C63010eb f128313d;

    /* renamed from: a */
    public int f128314a;

    /* renamed from: b */
    public String f128315b = BuildConfig.FLAVOR;

    static {
        C49718h hVar = new C49718h();
        f128312c = hVar;
        C62942bv.registerDefaultInstance(C49718h.class, hVar);
    }

    private C49718h() {
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
                return newMessageInfo(f128312c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49718h();
            case 4:
                return new C49717g();
            case 5:
                return f128312c;
            case 6:
                C63010eb ebVar = f128313d;
                if (ebVar == null) {
                    synchronized (C49718h.class) {
                        ebVar = f128313d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f128312c);
                            f128313d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
