package com.google.protos.p5127o.p5128a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.o.a.j */
/* compiled from: PG */
public final class C65629j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C65629j f178340d;

    /* renamed from: f */
    private static volatile C63010eb f178341f;

    /* renamed from: a */
    public int f178342a;

    /* renamed from: b */
    public C55093fp f178343b;

    /* renamed from: c */
    public int f178344c;

    /* renamed from: e */
    private byte f178345e = 2;

    static {
        C65629j jVar = new C65629j();
        f178340d = jVar;
        C62942bv.registerDefaultInstance(C65629j.class, jVar);
    }

    private C65629j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f178345e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f178345e = b;
                return null;
            case 2:
                return newMessageInfo(f178340d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဌ\u0001", new Object[]{"a", "b", C45240c.f118157a, C65627h.f178339a});
            case 3:
                return new C65629j();
            case 4:
                return new C65626g();
            case 5:
                return f178340d;
            case 6:
                C63010eb ebVar = f178341f;
                if (ebVar == null) {
                    synchronized (C65629j.class) {
                        ebVar = f178341f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f178340d);
                            f178341f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
