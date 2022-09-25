package com.google.android.apps.gsa.staticplugins.nowcards.p8104e.p8107c;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p375ai.p378b.C7718hj;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.e.c.ar */
/* compiled from: PG */
public final class C104501ar extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C104501ar f290649d;

    /* renamed from: f */
    private static volatile C63010eb f290650f;

    /* renamed from: a */
    public int f290651a;

    /* renamed from: b */
    public C7718hj f290652b;

    /* renamed from: c */
    public C62971cq f290653c = emptyProtobufList();

    /* renamed from: e */
    private byte f290654e = 2;

    static {
        C104501ar arVar = new C104501ar();
        f290649d = arVar;
        C62942bv.registerDefaultInstance(C104501ar.class, arVar);
    }

    private C104501ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f290654e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f290654e = b;
                return null;
            case 2:
                return newMessageInfo(f290649d, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0001\u0002\u0002ᐉ\u0000\u0003Л", new Object[]{"a", "b", C45240c.f118157a, C7718hj.class});
            case 3:
                return new C104501ar();
            case 4:
                return new C104500aq();
            case 5:
                return f290649d;
            case 6:
                C63010eb ebVar = f290650f;
                if (ebVar == null) {
                    synchronized (C104501ar.class) {
                        ebVar = f290650f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f290649d);
                            f290650f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
