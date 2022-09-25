package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.cq */
/* compiled from: PG */
public final class C14260cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C14260cq f43137c;

    /* renamed from: d */
    private static volatile C63010eb f43138d;

    /* renamed from: a */
    public int f43139a = 0;

    /* renamed from: b */
    public Object f43140b;

    static {
        C14260cq cqVar = new C14260cq();
        f43137c = cqVar;
        C62942bv.registerDefaultInstance(C14260cq.class, cqVar);
    }

    private C14260cq() {
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
                return newMessageInfo(f43137c, "\u0000\u0007\u0001\u0000\u0001\b\u0007\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005<\u0000\u0007<\u0000\b<\u0000", new Object[]{"b", "a", C14245cb.class, C14259cp.class, C14257cn.class, C14250cg.class, C14254ck.class, C14248ce.class, C14252ci.class});
            case 3:
                return new C14260cq();
            case 4:
                return new C14246cc();
            case 5:
                return f43137c;
            case 6:
                C63010eb ebVar = f43138d;
                if (ebVar == null) {
                    synchronized (C14260cq.class) {
                        ebVar = f43138d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43137c);
                            f43138d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
