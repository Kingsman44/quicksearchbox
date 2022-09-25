package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.cq */
/* compiled from: PG */
public final class C54878cq extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54878cq f144169c;

    /* renamed from: d */
    private static volatile C63010eb f144170d;

    /* renamed from: a */
    public int f144171a;

    /* renamed from: b */
    public C54876co f144172b;

    static {
        C54878cq cqVar = new C54878cq();
        f144169c = cqVar;
        C62942bv.registerDefaultInstance(C54878cq.class, cqVar);
    }

    private C54878cq() {
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
                return newMessageInfo(f144169c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54878cq();
            case 4:
                return new C54877cp();
            case 5:
                return f144169c;
            case 6:
                C63010eb ebVar = f144170d;
                if (ebVar == null) {
                    synchronized (C54878cq.class) {
                        ebVar = f144170d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144169c);
                            f144170d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
