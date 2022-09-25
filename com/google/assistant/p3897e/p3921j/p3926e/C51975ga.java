package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ga */
/* compiled from: PG */
public final class C51975ga extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C51975ga f136390c;

    /* renamed from: e */
    private static volatile C63010eb f136391e;

    /* renamed from: a */
    public String f136392a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public boolean f136393b;

    /* renamed from: d */
    private int f136394d;

    static {
        C51975ga gaVar = new C51975ga();
        f136390c = gaVar;
        C62942bv.registerDefaultInstance(C51975ga.class, gaVar);
    }

    private C51975ga() {
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
                return newMessageInfo(f136390c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C51975ga();
            case 4:
                return new C51973fz();
            case 5:
                return f136390c;
            case 6:
                C63010eb ebVar = f136391e;
                if (ebVar == null) {
                    synchronized (C51975ga.class) {
                        ebVar = f136391e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136390c);
                            f136391e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
