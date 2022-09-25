package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C52066y;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.c.c.cq */
/* compiled from: PG */
public final class C50999cq extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C50999cq f132770a;

    /* renamed from: f */
    private static volatile C63010eb f132771f;

    /* renamed from: b */
    private int f132772b;

    /* renamed from: c */
    private C52066y f132773c;

    /* renamed from: d */
    private C51016dg f132774d;

    /* renamed from: e */
    private byte f132775e = 2;

    static {
        C50999cq cqVar = new C50999cq();
        f132770a = cqVar;
        C62942bv.registerDefaultInstance(C50999cq.class, cqVar);
    }

    private C50999cq() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132775e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132775e = b;
                return null;
            case 2:
                return newMessageInfo(f132770a, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a, "d"});
            case 3:
                return new C50999cq();
            case 4:
                return new C50998cp();
            case 5:
                return f132770a;
            case 6:
                C63010eb ebVar = f132771f;
                if (ebVar == null) {
                    synchronized (C50999cq.class) {
                        ebVar = f132771f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132770a);
                            f132771f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
