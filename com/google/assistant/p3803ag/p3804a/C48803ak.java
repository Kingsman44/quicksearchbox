package com.google.assistant.p3803ag.p3804a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.ak */
/* compiled from: PG */
public final class C48803ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C48803ak f126274c;

    /* renamed from: d */
    private static volatile C63010eb f126275d;

    /* renamed from: a */
    public int f126276a;

    /* renamed from: b */
    public int f126277b;

    static {
        C48803ak akVar = new C48803ak();
        f126274c = akVar;
        C62942bv.registerDefaultInstance(C48803ak.class, akVar);
    }

    private C48803ak() {
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
                return newMessageInfo(f126274c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C48802aj.f126273a});
            case 3:
                return new C48803ak();
            case 4:
                return new C48801ai();
            case 5:
                return f126274c;
            case 6:
                C63010eb ebVar = f126275d;
                if (ebVar == null) {
                    synchronized (C48803ak.class) {
                        ebVar = f126275d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126274c);
                            f126275d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
