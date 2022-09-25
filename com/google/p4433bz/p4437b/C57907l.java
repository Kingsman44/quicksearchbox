package com.google.p4433bz.p4437b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bz.b.l */
/* compiled from: PG */
public final class C57907l extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C57907l f154887c;

    /* renamed from: d */
    private static volatile C63010eb f154888d;

    /* renamed from: a */
    public int f154889a = 0;

    /* renamed from: b */
    public Object f154890b;

    static {
        C57907l lVar = new C57907l();
        f154887c = lVar;
        C62942bv.registerDefaultInstance(C57907l.class, lVar);
    }

    private C57907l() {
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
                return newMessageInfo(f154887c, "\u0001\u0005\u0001\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000\u0004ြ\u0000\u0005ြ\u0000", new Object[]{"b", "a", C57897b.class, C57903h.class, C57905j.class, C57911p.class, C57901f.class});
            case 3:
                return new C57907l();
            case 4:
                return new C57906k();
            case 5:
                return f154887c;
            case 6:
                C63010eb ebVar = f154888d;
                if (ebVar == null) {
                    synchronized (C57907l.class) {
                        ebVar = f154888d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154887c);
                            f154888d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
