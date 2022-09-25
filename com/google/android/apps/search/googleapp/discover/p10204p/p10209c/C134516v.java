package com.google.android.apps.search.googleapp.discover.p10204p.p10209c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.discover.p.c.v */
/* compiled from: PG */
public final class C134516v extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C134516v f366329a;

    /* renamed from: b */
    private static volatile C63010eb f366330b;

    static {
        C134516v vVar = new C134516v();
        f366329a = vVar;
        C62942bv.registerDefaultInstance(C134516v.class, vVar);
    }

    private C134516v() {
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
                return newMessageInfo(f366329a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C134516v();
            case 4:
                return new C134515u();
            case 5:
                return f366329a;
            case 6:
                C63010eb ebVar = f366330b;
                if (ebVar == null) {
                    synchronized (C134516v.class) {
                        ebVar = f366330b;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f366329a);
                            f366330b = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
