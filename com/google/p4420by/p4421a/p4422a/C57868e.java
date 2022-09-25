package com.google.p4420by.p4421a.p4422a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.by.a.a.e */
/* compiled from: PG */
public final class C57868e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57868e f154587c;

    /* renamed from: d */
    private static volatile C63010eb f154588d;

    /* renamed from: a */
    public int f154589a;

    /* renamed from: b */
    public int f154590b;

    static {
        C57868e eVar = new C57868e();
        f154587c = eVar;
        C62942bv.registerDefaultInstance(C57868e.class, eVar);
    }

    private C57868e() {
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
                return newMessageInfo(f154587c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C57864a.f154585a});
            case 3:
                return new C57868e();
            case 4:
                return new C57867d();
            case 5:
                return f154587c;
            case 6:
                C63010eb ebVar = f154588d;
                if (ebVar == null) {
                    synchronized (C57868e.class) {
                        ebVar = f154588d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154587c);
                            f154588d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
