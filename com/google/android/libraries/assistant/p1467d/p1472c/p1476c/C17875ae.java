package com.google.android.libraries.assistant.p1467d.p1472c.p1476c;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.d.c.c.ae */
/* compiled from: PG */
public final class C17875ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C17875ae f51212c;

    /* renamed from: e */
    private static volatile C63010eb f51213e;

    /* renamed from: a */
    public String f51214a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f51215b = BuildConfig.FLAVOR;

    /* renamed from: d */
    private int f51216d;

    static {
        C17875ae aeVar = new C17875ae();
        f51212c = aeVar;
        C62942bv.registerDefaultInstance(C17875ae.class, aeVar);
    }

    private C17875ae() {
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
                return newMessageInfo(f51212c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C17875ae();
            case 4:
                return new C17874ad();
            case 5:
                return f51212c;
            case 6:
                C63010eb ebVar = f51213e;
                if (ebVar == null) {
                    synchronized (C17875ae.class) {
                        ebVar = f51213e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f51212c);
                            f51213e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
