package com.google.protos.p4895aw.p4902b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.b.br */
/* compiled from: PG */
public final class C64008br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64008br f173093c;

    /* renamed from: d */
    private static volatile C63010eb f173094d;

    /* renamed from: a */
    public int f173095a = 0;

    /* renamed from: b */
    public Object f173096b;

    static {
        C64008br brVar = new C64008br();
        f173093c = brVar;
        C62942bv.registerDefaultInstance(C64008br.class, brVar);
    }

    private C64008br() {
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
                return newMessageInfo(f173093c, "\u0001\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001ျ\u0000\u0002ျ\u0000", new Object[]{"b", "a"});
            case 3:
                return new C64008br();
            case 4:
                return new C64007bq();
            case 5:
                return f173093c;
            case 6:
                C63010eb ebVar = f173094d;
                if (ebVar == null) {
                    synchronized (C64008br.class) {
                        ebVar = f173094d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173093c);
                            f173094d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
