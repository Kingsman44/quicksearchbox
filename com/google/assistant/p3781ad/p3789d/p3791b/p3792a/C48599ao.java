package com.google.assistant.p3781ad.p3789d.p3791b.p3792a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.a.ao */
/* compiled from: PG */
public final class C48599ao extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C48599ao f125607b;

    /* renamed from: c */
    private static volatile C63010eb f125608c;

    /* renamed from: a */
    public C62995dn f125609a = C62995dn.f170057a;

    static {
        C48599ao aoVar = new C48599ao();
        f125607b = aoVar;
        C62942bv.registerDefaultInstance(C48599ao.class, aoVar);
    }

    private C48599ao() {
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
                return newMessageInfo(f125607b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"a", C48598an.f125606a});
            case 3:
                return new C48599ao();
            case 4:
                return new C48597am();
            case 5:
                return f125607b;
            case 6:
                C63010eb ebVar = f125608c;
                if (ebVar == null) {
                    synchronized (C48599ao.class) {
                        ebVar = f125608c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125607b);
                            f125608c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
