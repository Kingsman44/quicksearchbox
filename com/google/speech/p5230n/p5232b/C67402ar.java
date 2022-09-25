package com.google.speech.p5230n.p5232b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.speech.p5230n.p5231a.C67372i;

/* renamed from: com.google.speech.n.b.ar */
/* compiled from: PG */
public final class C67402ar extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C67402ar f183192d;

    /* renamed from: f */
    private static volatile C63010eb f183193f;

    /* renamed from: a */
    public int f183194a;

    /* renamed from: b */
    public C62971cq f183195b = emptyProtobufList();

    /* renamed from: c */
    public C67372i f183196c;

    /* renamed from: e */
    private byte f183197e = 2;

    static {
        C67402ar arVar = new C67402ar();
        f183192d = arVar;
        C62942bv.registerDefaultInstance(C67402ar.class, arVar);
    }

    private C67402ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183197e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183197e = b;
                return null;
            case 2:
                return newMessageInfo(f183192d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0002\u0001Л\u0002ᐉ\u0000", new Object[]{"a", "b", C67400ap.class, C45240c.f118157a});
            case 3:
                return new C67402ar();
            case 4:
                return new C67401aq();
            case 5:
                return f183192d;
            case 6:
                C63010eb ebVar = f183193f;
                if (ebVar == null) {
                    synchronized (C67402ar.class) {
                        ebVar = f183193f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183192d);
                            f183193f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
