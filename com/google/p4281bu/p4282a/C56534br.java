package com.google.p4281bu.p4282a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bu.a.br */
/* compiled from: PG */
public final class C56534br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56534br f150971c;

    /* renamed from: d */
    private static volatile C63010eb f150972d;

    /* renamed from: a */
    public boolean f150973a;

    /* renamed from: b */
    public boolean f150974b;

    static {
        C56534br brVar = new C56534br();
        f150971c = brVar;
        C62942bv.registerDefaultInstance(C56534br.class, brVar);
    }

    private C56534br() {
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
                return newMessageInfo(f150971c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0007\u0002\u0007", new Object[]{"a", "b"});
            case 3:
                return new C56534br();
            case 4:
                return new C56533bq();
            case 5:
                return f150971c;
            case 6:
                C63010eb ebVar = f150972d;
                if (ebVar == null) {
                    synchronized (C56534br.class) {
                        ebVar = f150972d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f150971c);
                            f150972d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
