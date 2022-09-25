package com.google.assistant.p4008y.p4013d;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.d.p */
/* compiled from: PG */
public final class C53664p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C53664p f140857c;

    /* renamed from: d */
    private static volatile C63010eb f140858d;

    /* renamed from: a */
    public int f140859a;

    /* renamed from: b */
    public int f140860b;

    static {
        C53664p pVar = new C53664p();
        f140857c = pVar;
        C62942bv.registerDefaultInstance(C53664p.class, pVar);
    }

    private C53664p() {
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
                return newMessageInfo(f140857c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C53663o.m86883b()});
            case 3:
                return new C53664p();
            case 4:
                return new C53661m();
            case 5:
                return f140857c;
            case 6:
                C63010eb ebVar = f140858d;
                if (ebVar == null) {
                    synchronized (C53664p.class) {
                        ebVar = f140858d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140857c);
                            f140858d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
