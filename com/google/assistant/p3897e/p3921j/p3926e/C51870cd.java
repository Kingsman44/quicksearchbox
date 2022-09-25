package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.cd */
/* compiled from: PG */
public final class C51870cd extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51870cd f136053c;

    /* renamed from: e */
    private static volatile C63010eb f136054e;

    /* renamed from: a */
    public String f136055a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f136056b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f136057d;

    static {
        C51870cd cdVar = new C51870cd();
        f136053c = cdVar;
        C62942bv.registerDefaultInstance(C51870cd.class, cdVar);
    }

    private C51870cd() {
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
                return newMessageInfo(f136053c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51870cd();
            case 4:
                return new C51869cc();
            case 5:
                return f136053c;
            case 6:
                C63010eb ebVar = f136054e;
                if (ebVar == null) {
                    synchronized (C51870cd.class) {
                        ebVar = f136054e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136053c);
                            f136054e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
