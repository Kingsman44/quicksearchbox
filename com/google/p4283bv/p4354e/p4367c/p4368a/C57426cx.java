package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cx */
/* compiled from: PG */
public final class C57426cx extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57426cx f153400c;

    /* renamed from: e */
    private static volatile C63010eb f153401e;

    /* renamed from: a */
    public int f153402a;

    /* renamed from: b */
    public int f153403b;

    /* renamed from: d */
    private int f153404d;

    static {
        C57426cx cxVar = new C57426cx();
        f153400c = cxVar;
        C62942bv.registerDefaultInstance(C57426cx.class, cxVar);
    }

    private C57426cx() {
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
                return newMessageInfo(f153400c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001င\u0000\u0002ဌ\u0001", new Object[]{"d", "a", "b", C57419cq.f153394a});
            case 3:
                return new C57426cx();
            case 4:
                return new C57425cw();
            case 5:
                return f153400c;
            case 6:
                C63010eb ebVar = f153401e;
                if (ebVar == null) {
                    synchronized (C57426cx.class) {
                        ebVar = f153401e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153400c);
                            f153401e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
