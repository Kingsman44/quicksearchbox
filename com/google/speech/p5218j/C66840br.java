package com.google.speech.p5218j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.br */
/* compiled from: PG */
public final class C66840br extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66840br f181754c;

    /* renamed from: d */
    private static volatile C63010eb f181755d;

    /* renamed from: a */
    public int f181756a;

    /* renamed from: b */
    public int f181757b;

    static {
        C66840br brVar = new C66840br();
        f181754c = brVar;
        C62942bv.registerDefaultInstance(C66840br.class, brVar);
    }

    private C66840br() {
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
                return newMessageInfo(f181754c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C66841bs.f181758a});
            case 3:
                return new C66840br();
            case 4:
                return new C66839bq();
            case 5:
                return f181754c;
            case 6:
                C63010eb ebVar = f181755d;
                if (ebVar == null) {
                    synchronized (C66840br.class) {
                        ebVar = f181755d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181754c);
                            f181755d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
