package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.t */
/* compiled from: PG */
public final class C54256t extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54256t f142458b;

    /* renamed from: d */
    private static volatile C63010eb f142459d;

    /* renamed from: a */
    public String f142460a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f142461c;

    static {
        C54256t tVar = new C54256t();
        f142458b = tVar;
        C62942bv.registerDefaultInstance(C54256t.class, tVar);
    }

    private C54256t() {
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
                return newMessageInfo(f142458b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C54256t();
            case 4:
                return new C54255s();
            case 5:
                return f142458b;
            case 6:
                C63010eb ebVar = f142459d;
                if (ebVar == null) {
                    synchronized (C54256t.class) {
                        ebVar = f142459d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142458b);
                            f142459d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
