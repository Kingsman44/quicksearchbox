package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57573aq;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.n */
/* compiled from: PG */
public final class C54477n extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54477n f143036b;

    /* renamed from: c */
    private static volatile C63010eb f143037c;

    /* renamed from: a */
    public C57573aq f143038a;

    static {
        C54477n nVar = new C54477n();
        f143036b = nVar;
        C62942bv.registerDefaultInstance(C54477n.class, nVar);
    }

    private C54477n() {
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
                return newMessageInfo(f143036b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", new Object[]{"a"});
            case 3:
                return new C54477n();
            case 4:
                return new C54476m();
            case 5:
                return f143036b;
            case 6:
                C63010eb ebVar = f143037c;
                if (ebVar == null) {
                    synchronized (C54477n.class) {
                        ebVar = f143037c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143036b);
                            f143037c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
