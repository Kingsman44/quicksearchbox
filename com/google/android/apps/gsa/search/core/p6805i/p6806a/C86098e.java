package com.google.android.apps.gsa.search.core.p6805i.p6806a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.core.i.a.e */
/* compiled from: PG */
public final class C86098e extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C86098e f232722b;

    /* renamed from: c */
    private static volatile C63010eb f232723c;

    /* renamed from: a */
    public C62961ch f232724a = emptyIntList();

    static {
        C86098e eVar = new C86098e();
        f232722b = eVar;
        C62942bv.registerDefaultInstance(C86098e.class, eVar);
    }

    private C86098e() {
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
                return newMessageInfo(f232722b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u0016", new Object[]{"a"});
            case 3:
                return new C86098e();
            case 4:
                return new C86097d();
            case 5:
                return f232722b;
            case 6:
                C63010eb ebVar = f232723c;
                if (ebVar == null) {
                    synchronized (C86098e.class) {
                        ebVar = f232723c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f232722b);
                            f232723c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
