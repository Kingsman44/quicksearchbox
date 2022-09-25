package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.ju */
/* compiled from: PG */
public final class C14453ju extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C14453ju f43719b;

    /* renamed from: c */
    private static volatile C63010eb f43720c;

    /* renamed from: a */
    public int f43721a;

    static {
        C14453ju juVar = new C14453ju();
        f43719b = juVar;
        C62942bv.registerDefaultInstance(C14453ju.class, juVar);
    }

    private C14453ju() {
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
                return newMessageInfo(f43719b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0004", new Object[]{"a"});
            case 3:
                return new C14453ju();
            case 4:
                return new C14452jt();
            case 5:
                return f43719b;
            case 6:
                C63010eb ebVar = f43720c;
                if (ebVar == null) {
                    synchronized (C14453ju.class) {
                        ebVar = f43720c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43719b);
                            f43720c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
