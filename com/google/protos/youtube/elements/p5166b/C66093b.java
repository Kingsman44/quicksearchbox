package com.google.protos.youtube.elements.p5166b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.youtube.elements.C66128bg;

/* renamed from: com.google.protos.youtube.elements.b.b */
/* compiled from: PG */
public final class C66093b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C66093b f179724c;

    /* renamed from: f */
    private static volatile C63010eb f179725f;

    /* renamed from: a */
    public C66101f f179726a;

    /* renamed from: b */
    public C66128bg f179727b;

    /* renamed from: d */
    private int f179728d;

    /* renamed from: e */
    private byte f179729e = 2;

    static {
        C66093b bVar = new C66093b();
        f179724c = bVar;
        C62942bv.registerDefaultInstance(C66093b.class, bVar);
    }

    private C66093b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f179729e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f179729e = b;
                return null;
            case 2:
                return newMessageInfo(f179724c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C66093b();
            case 4:
                return new C66066a();
            case 5:
                return f179724c;
            case 6:
                C63010eb ebVar = f179725f;
                if (ebVar == null) {
                    synchronized (C66093b.class) {
                        ebVar = f179725f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179724c);
                            f179725f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
