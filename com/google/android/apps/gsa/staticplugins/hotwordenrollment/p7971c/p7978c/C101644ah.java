package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.apps.gsa.assistant.settings.features.av.bh;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ah */
/* compiled from: PG */
public final class C101644ah extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C101644ah f283624c;

    /* renamed from: d */
    private static volatile C63010eb f283625d;

    /* renamed from: a */
    public int f283626a;

    /* renamed from: b */
    public bh f283627b;

    static {
        C101644ah ahVar = new C101644ah();
        f283624c = ahVar;
        C62942bv.registerDefaultInstance(C101644ah.class, ahVar);
    }

    private C101644ah() {
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
                return newMessageInfo(f283624c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C101644ah();
            case 4:
                return new C101643ag();
            case 5:
                return f283624c;
            case 6:
                C63010eb ebVar = f283625d;
                if (ebVar == null) {
                    synchronized (C101644ah.class) {
                        ebVar = f283625d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f283624c);
                            f283625d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
