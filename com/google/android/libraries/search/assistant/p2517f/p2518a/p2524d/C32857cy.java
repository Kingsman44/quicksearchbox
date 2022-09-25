package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cy */
/* compiled from: PG */
public final class C32857cy extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32857cy f88077c;

    /* renamed from: d */
    private static volatile C63010eb f88078d;

    /* renamed from: a */
    public int f88079a;

    /* renamed from: b */
    public String f88080b = BuildConfig.FLAVOR;

    static {
        C32857cy cyVar = new C32857cy();
        f88077c = cyVar;
        C62942bv.registerDefaultInstance(C32857cy.class, cyVar);
    }

    private C32857cy() {
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
                return newMessageInfo(f88077c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32857cy();
            case 4:
                return new C32856cx();
            case 5:
                return f88077c;
            case 6:
                C63010eb ebVar = f88078d;
                if (ebVar == null) {
                    synchronized (C32857cy.class) {
                        ebVar = f88078d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88077c);
                            f88078d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
