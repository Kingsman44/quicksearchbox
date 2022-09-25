package com.google.android.apps.gsa.assist;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.assist.al */
/* compiled from: PG */
public final class C9341al extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C9341al f32415d;

    /* renamed from: e */
    private static volatile C63010eb f32416e;

    /* renamed from: a */
    public int f32417a;

    /* renamed from: b */
    public int f32418b;

    /* renamed from: c */
    public int f32419c;

    static {
        C9341al alVar = new C9341al();
        f32415d = alVar;
        C62942bv.registerDefaultInstance(C9341al.class, alVar);
    }

    private C9341al() {
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
                return newMessageInfo(f32415d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C9341al();
            case 4:
                return new C9340ak();
            case 5:
                return f32415d;
            case 6:
                C63010eb ebVar = f32416e;
                if (ebVar == null) {
                    synchronized (C9341al.class) {
                        ebVar = f32416e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f32415d);
                            f32416e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
