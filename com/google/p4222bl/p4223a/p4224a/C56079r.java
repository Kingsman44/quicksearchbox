package com.google.p4222bl.p4223a.p4224a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bl.a.a.r */
/* compiled from: PG */
public final class C56079r extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56079r f149417c;

    /* renamed from: d */
    private static volatile C63010eb f149418d;

    /* renamed from: a */
    public int f149419a = 0;

    /* renamed from: b */
    public Object f149420b;

    static {
        C56079r rVar = new C56079r();
        f149417c = rVar;
        C62942bv.registerDefaultInstance(C56079r.class, rVar);
    }

    private C56079r() {
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
                return newMessageInfo(f149417c, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002<\u0000\u0003<\u0000", new Object[]{"b", "a", C56085x.class, C56083v.class, C56081t.class});
            case 3:
                return new C56079r();
            case 4:
                return new C56078q();
            case 5:
                return f149417c;
            case 6:
                C63010eb ebVar = f149418d;
                if (ebVar == null) {
                    synchronized (C56079r.class) {
                        ebVar = f149418d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f149417c);
                            f149418d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
