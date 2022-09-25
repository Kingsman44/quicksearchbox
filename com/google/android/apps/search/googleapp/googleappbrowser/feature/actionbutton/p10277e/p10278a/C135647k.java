package com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.p10277e.p10278a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.actionbutton.e.a.k */
/* compiled from: PG */
public final class C135647k extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C135647k f369483c;

    /* renamed from: d */
    private static volatile C63010eb f369484d;

    /* renamed from: a */
    public int f369485a;

    /* renamed from: b */
    public int f369486b;

    static {
        C135647k kVar = new C135647k();
        f369483c = kVar;
        C62942bv.registerDefaultInstance(C135647k.class, kVar);
    }

    private C135647k() {
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
                return newMessageInfo(f369483c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C135647k();
            case 4:
                return new C135646j();
            case 5:
                return f369483c;
            case 6:
                C63010eb ebVar = f369484d;
                if (ebVar == null) {
                    synchronized (C135647k.class) {
                        ebVar = f369484d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f369483c);
                            f369484d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
