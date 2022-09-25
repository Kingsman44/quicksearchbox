package com.google.android.apps.gsa.search.shared.service.p6935b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.search.shared.service.b.hz */
/* compiled from: PG */
public final class C87906hz extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C87906hz f237790b;

    /* renamed from: d */
    private static volatile C63010eb f237791d;

    /* renamed from: a */
    public int f237792a = 0;

    /* renamed from: c */
    private Object f237793c;

    static {
        C87906hz hzVar = new C87906hz();
        f237790b = hzVar;
        C62942bv.registerDefaultInstance(C87906hz.class, hzVar);
    }

    private C87906hz() {
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
                return newMessageInfo(f237790b, "\u0001\u0001\u0001\u0000\u0005\u0005\u0001\u0000\u0000\u0000\u0005ြ\u0000", new Object[]{C45240c.f118157a, "a", C87905hy.class});
            case 3:
                return new C87906hz();
            case 4:
                return new C87902hv();
            case 5:
                return f237790b;
            case 6:
                C63010eb ebVar = f237791d;
                if (ebVar == null) {
                    synchronized (C87906hz.class) {
                        ebVar = f237791d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f237790b);
                            f237791d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
