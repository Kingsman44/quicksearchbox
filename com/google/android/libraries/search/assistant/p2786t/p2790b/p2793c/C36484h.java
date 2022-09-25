package com.google.android.libraries.search.assistant.p2786t.p2790b.p2793c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.search.assistant.t.b.c.h */
/* compiled from: PG */
public final class C36484h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C36484h f95228b;

    /* renamed from: d */
    private static volatile C63010eb f95229d;

    /* renamed from: a */
    public boolean f95230a;

    /* renamed from: c */
    private int f95231c;

    static {
        C36484h hVar = new C36484h();
        f95228b = hVar;
        C62942bv.registerDefaultInstance(C36484h.class, hVar);
    }

    private C36484h() {
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
                return newMessageInfo(f95228b, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဇ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C36484h();
            case 4:
                return new C36483g();
            case 5:
                return f95228b;
            case 6:
                C63010eb ebVar = f95229d;
                if (ebVar == null) {
                    synchronized (C36484h.class) {
                        ebVar = f95229d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f95228b);
                            f95229d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
