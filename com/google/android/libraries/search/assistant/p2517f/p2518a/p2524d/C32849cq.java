package com.google.android.libraries.search.assistant.p2517f.p2518a.p2524d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.libraries.search.assistant.f.a.d.cq */
/* compiled from: PG */
public final class C32849cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32849cq f88059c;

    /* renamed from: d */
    private static volatile C63010eb f88060d;

    /* renamed from: a */
    public int f88061a;

    /* renamed from: b */
    public C63088z f88062b = C63088z.f170246b;

    static {
        C32849cq cqVar = new C32849cq();
        f88059c = cqVar;
        C62942bv.registerDefaultInstance(C32849cq.class, cqVar);
    }

    private C32849cq() {
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
                return newMessageInfo(f88059c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ည\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32849cq();
            case 4:
                return new C32848cp();
            case 5:
                return f88059c;
            case 6:
                C63010eb ebVar = f88060d;
                if (ebVar == null) {
                    synchronized (C32849cq.class) {
                        ebVar = f88060d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f88059c);
                            f88060d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
