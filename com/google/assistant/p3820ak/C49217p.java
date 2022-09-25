package com.google.assistant.p3820ak;

import com.google.assistant.p3980n.p3985c.C53025p;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.p */
/* compiled from: PG */
public final class C49217p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C49217p f127258c;

    /* renamed from: e */
    private static volatile C63010eb f127259e;

    /* renamed from: a */
    public int f127260a;

    /* renamed from: b */
    public C53025p f127261b;

    /* renamed from: d */
    private byte f127262d = 2;

    static {
        C49217p pVar = new C49217p();
        f127258c = pVar;
        C62942bv.registerDefaultInstance(C49217p.class, pVar);
    }

    private C49217p() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127262d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127262d = b;
                return null;
            case 2:
                return newMessageInfo(f127258c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C49217p();
            case 4:
                return new C49216o();
            case 5:
                return f127258c;
            case 6:
                C63010eb ebVar = f127259e;
                if (ebVar == null) {
                    synchronized (C49217p.class) {
                        ebVar = f127259e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127258c);
                            f127259e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
