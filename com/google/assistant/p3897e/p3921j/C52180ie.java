package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.ie */
/* compiled from: PG */
public final class C52180ie extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52180ie f136954d;

    /* renamed from: e */
    private static volatile C63010eb f136955e;

    /* renamed from: a */
    public int f136956a;

    /* renamed from: b */
    public int f136957b;

    /* renamed from: c */
    public long f136958c;

    static {
        C52180ie ieVar = new C52180ie();
        f136954d = ieVar;
        C62942bv.registerDefaultInstance(C52180ie.class, ieVar);
    }

    private C52180ie() {
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
                return newMessageInfo(f136954d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဌ\u0001\u0003ဂ\u0002", new Object[]{"a", "b", C52179id.m86536b(), C45240c.f118157a});
            case 3:
                return new C52180ie();
            case 4:
                return new C52177ib();
            case 5:
                return f136954d;
            case 6:
                C63010eb ebVar = f136955e;
                if (ebVar == null) {
                    synchronized (C52180ie.class) {
                        ebVar = f136955e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136954d);
                            f136955e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
