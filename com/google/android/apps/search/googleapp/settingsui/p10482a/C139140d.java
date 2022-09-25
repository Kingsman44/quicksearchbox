package com.google.android.apps.search.googleapp.settingsui.p10482a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.a.d */
/* compiled from: PG */
public final class C139140d extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C139140d f378431a;

    /* renamed from: b */
    private static volatile C63010eb f378432b;

    static {
        C139140d dVar = new C139140d();
        f378431a = dVar;
        C62942bv.registerDefaultInstance(C139140d.class, dVar);
    }

    private C139140d() {
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
                return newMessageInfo(f378431a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C139140d();
            case 4:
                return new C139139c();
            case 5:
                return f378431a;
            case 6:
                C63010eb ebVar = f378432b;
                if (ebVar == null) {
                    synchronized (C139140d.class) {
                        ebVar = f378432b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f378431a);
                            f378432b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
