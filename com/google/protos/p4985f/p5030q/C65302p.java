package com.google.protos.p4985f.p5030q;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.q.p */
/* compiled from: PG */
public final class C65302p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C65302p f176626c;

    /* renamed from: d */
    private static volatile C63010eb f176627d;

    /* renamed from: a */
    public int f176628a;

    /* renamed from: b */
    public C65170ed f176629b;

    static {
        C65302p pVar = new C65302p();
        f176626c = pVar;
        C62942bv.registerDefaultInstance(C65302p.class, pVar);
    }

    private C65302p() {
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
                return newMessageInfo(f176626c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C65302p();
            case 4:
                return new C65301o();
            case 5:
                return f176626c;
            case 6:
                C63010eb ebVar = f176627d;
                if (ebVar == null) {
                    synchronized (C65302p.class) {
                        ebVar = f176627d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f176626c);
                            f176627d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
