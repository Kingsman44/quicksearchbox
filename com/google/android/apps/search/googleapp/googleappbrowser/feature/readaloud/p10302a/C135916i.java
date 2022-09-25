package com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.p10302a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.readaloud.a.i */
/* compiled from: PG */
public final class C135916i extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135916i f370168c;

    /* renamed from: d */
    private static volatile C63010eb f370169d;

    /* renamed from: a */
    public int f370170a;

    /* renamed from: b */
    public int f370171b;

    static {
        C135916i iVar = new C135916i();
        f370168c = iVar;
        C62942bv.registerDefaultInstance(C135916i.class, iVar);
    }

    private C135916i() {
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
                return newMessageInfo(f370168c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C135914g.m220527b()});
            case 3:
                return new C135916i();
            case 4:
                return new C135915h();
            case 5:
                return f370168c;
            case 6:
                C63010eb ebVar = f370169d;
                if (ebVar == null) {
                    synchronized (C135916i.class) {
                        ebVar = f370169d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f370168c);
                            f370169d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
