package com.google.audio.p4107b.p4108a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.audio.b.a.n */
/* compiled from: PG */
public final class C54591n extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54591n f143323c;

    /* renamed from: f */
    private static volatile C63010eb f143324f;

    /* renamed from: a */
    public C62971cq f143325a = emptyProtobufList();

    /* renamed from: b */
    public int f143326b;

    /* renamed from: d */
    private int f143327d;

    /* renamed from: e */
    private byte f143328e = 2;

    static {
        C54591n nVar = new C54591n();
        f143323c = nVar;
        C62942bv.registerDefaultInstance(C54591n.class, nVar);
    }

    private C54591n() {
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143328e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f143328e = b;
                return null;
            case 2:
                return newMessageInfo(f143323c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001Л\u0002ဌ\u0000", new Object[]{"d", "a", C54586i.class, "b", C54589l.f143322a});
            case 3:
                return new C54591n();
            case 4:
                return new C54588k();
            case 5:
                return f143323c;
            case 6:
                C63010eb ebVar = f143324f;
                if (ebVar == null) {
                    synchronized (C54591n.class) {
                        ebVar = f143324f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143323c);
                            f143324f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
