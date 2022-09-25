package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cp */
/* compiled from: PG */
public final class C14259cp extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14259cp f43134b;

    /* renamed from: c */
    private static volatile C63010eb f43135c;

    /* renamed from: a */
    public int f43136a;

    static {
        C14259cp cpVar = new C14259cp();
        f43134b = cpVar;
        C62942bv.registerDefaultInstance(C14259cp.class, cpVar);
    }

    private C14259cp() {
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
                return newMessageInfo(f43134b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\f", new Object[]{"a"});
            case 3:
                return new C14259cp();
            case 4:
                return new C14258co();
            case 5:
                return f43134b;
            case 6:
                C63010eb ebVar = f43135c;
                if (ebVar == null) {
                    synchronized (C14259cp.class) {
                        ebVar = f43135c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43134b);
                            f43135c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
