package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.kw */
/* compiled from: PG */
public final class C53356kw extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C53356kw f140005b;

    /* renamed from: d */
    private static volatile C63010eb f140006d;

    /* renamed from: a */
    public C53368lh f140007a;

    /* renamed from: c */
    private int f140008c;

    static {
        C53356kw kwVar = new C53356kw();
        f140005b = kwVar;
        C62942bv.registerDefaultInstance(C53356kw.class, kwVar);
    }

    private C53356kw() {
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
                return newMessageInfo(f140005b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C53356kw();
            case 4:
                return new C53355kv();
            case 5:
                return f140005b;
            case 6:
                C63010eb ebVar = f140006d;
                if (ebVar == null) {
                    synchronized (C53356kw.class) {
                        ebVar = f140006d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140005b);
                            f140006d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
