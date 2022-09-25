package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.ch */
/* compiled from: PG */
public final class C51874ch extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C51874ch f136059d;

    /* renamed from: f */
    private static volatile C63010eb f136060f;

    /* renamed from: a */
    public String f136061a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f136062b;

    /* renamed from: c */
    public String f136063c = BuildConfig.FLAVOR;

    /* renamed from: e */
    private int f136064e;

    static {
        C51874ch chVar = new C51874ch();
        f136059d = chVar;
        C62942bv.registerDefaultInstance(C51874ch.class, chVar);
    }

    private C51874ch() {
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
                return newMessageInfo(f136059d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"e", "a", "b", C51872cf.f136058a, C45240c.f118157a});
            case 3:
                return new C51874ch();
            case 4:
                return new C51871ce();
            case 5:
                return f136059d;
            case 6:
                C63010eb ebVar = f136060f;
                if (ebVar == null) {
                    synchronized (C51874ch.class) {
                        ebVar = f136060f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136059d);
                            f136060f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
