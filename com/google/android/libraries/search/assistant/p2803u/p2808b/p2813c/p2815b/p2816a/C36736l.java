package com.google.android.libraries.search.assistant.p2803u.p2808b.p2813c.p2815b.p2816a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.u.b.c.b.a.l */
/* compiled from: PG */
public final class C36736l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C36736l f95725c;

    /* renamed from: d */
    private static volatile C63010eb f95726d;

    /* renamed from: a */
    public int f95727a;

    /* renamed from: b */
    public String f95728b = BuildConfig.FLAVOR;

    static {
        C36736l lVar = new C36736l();
        f95725c = lVar;
        C62942bv.registerDefaultInstance(C36736l.class, lVar);
    }

    private C36736l() {
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
                return newMessageInfo(f95725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C36736l();
            case 4:
                return new C36735k();
            case 5:
                return f95725c;
            case 6:
                C63010eb ebVar = f95726d;
                if (ebVar == null) {
                    synchronized (C36736l.class) {
                        ebVar = f95726d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95725c);
                            f95726d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
