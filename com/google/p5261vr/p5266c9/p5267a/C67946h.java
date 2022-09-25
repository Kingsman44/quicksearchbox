package com.google.p5261vr.p5266c9.p5267a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.vr.c9.a.h */
/* compiled from: PG */
public final class C67946h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C67946h f184143c;

    /* renamed from: d */
    private static volatile C63010eb f184144d;

    /* renamed from: a */
    public int f184145a;

    /* renamed from: b */
    public String f184146b = BuildConfig.FLAVOR;

    static {
        C67946h hVar = new C67946h();
        f184143c = hVar;
        C62942bv.registerDefaultInstance(C67946h.class, hVar);
    }

    private C67946h() {
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
                return newMessageInfo(f184143c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C67946h();
            case 4:
                return new C67945g();
            case 5:
                return f184143c;
            case 6:
                C63010eb ebVar = f184144d;
                if (ebVar == null) {
                    synchronized (C67946h.class) {
                        ebVar = f184144d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f184143c);
                            f184144d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
