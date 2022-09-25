package com.google.protobuf;

import com.evernote.android.state.BuildConfig;

/* renamed from: com.google.protobuf.h */
/* compiled from: PG */
public final class C63070h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63070h f170215c;

    /* renamed from: d */
    private static volatile C63010eb f170216d;

    /* renamed from: a */
    public String f170217a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C63088z f170218b = C63088z.f170246b;

    static {
        C63070h hVar = new C63070h();
        f170215c = hVar;
        C62942bv.registerDefaultInstance(C63070h.class, hVar);
    }

    private C63070h() {
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
                return newMessageInfo(f170215c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"a", "b"});
            case 3:
                return new C63070h();
            case 4:
                return new C63062g();
            case 5:
                return f170215c;
            case 6:
                C63010eb ebVar = f170216d;
                if (ebVar == null) {
                    synchronized (C63070h.class) {
                        ebVar = f170216d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170215c);
                            f170216d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
