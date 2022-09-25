package com.google.assistant.p3897e.p3917i.p3918a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.assistant.e.i.a.mp */
/* compiled from: PG */
public final class C51570mp extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C51570mp f134408e;

    /* renamed from: f */
    private static volatile C63010eb f134409f;

    /* renamed from: a */
    public int f134410a;

    /* renamed from: b */
    public C63088z f134411b = C63088z.f170246b;

    /* renamed from: c */
    public C63088z f134412c = C63088z.f170246b;

    /* renamed from: d */
    public boolean f134413d;

    static {
        C51570mp mpVar = new C51570mp();
        f134408e = mpVar;
        C62942bv.registerDefaultInstance(C51570mp.class, mpVar);
    }

    private C51570mp() {
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
                return newMessageInfo(f134408e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ည\u0000\u0002ည\u0001\u0003ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C51570mp();
            case 4:
                return new C51569mo();
            case 5:
                return f134408e;
            case 6:
                C63010eb ebVar = f134409f;
                if (ebVar == null) {
                    synchronized (C51570mp.class) {
                        ebVar = f134409f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134408e);
                            f134409f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
