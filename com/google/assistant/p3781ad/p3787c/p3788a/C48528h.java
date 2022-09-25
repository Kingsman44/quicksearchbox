package com.google.assistant.p3781ad.p3787c.p3788a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.c.a.h */
/* compiled from: PG */
public final class C48528h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48528h f125358c;

    /* renamed from: d */
    private static volatile C63010eb f125359d;

    /* renamed from: a */
    public int f125360a;

    /* renamed from: b */
    public String f125361b = BuildConfig.FLAVOR;

    static {
        C48528h hVar = new C48528h();
        f125358c = hVar;
        C62942bv.registerDefaultInstance(C48528h.class, hVar);
    }

    private C48528h() {
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
                return newMessageInfo(f125358c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C48528h();
            case 4:
                return new C48527g();
            case 5:
                return f125358c;
            case 6:
                C63010eb ebVar = f125359d;
                if (ebVar == null) {
                    synchronized (C48528h.class) {
                        ebVar = f125359d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125358c);
                            f125359d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
