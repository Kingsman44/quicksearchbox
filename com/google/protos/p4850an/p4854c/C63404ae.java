package com.google.protos.p4850an.p4854c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.c.ae */
/* compiled from: PG */
public final class C63404ae extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63404ae f171340c;

    /* renamed from: f */
    private static volatile C63010eb f171341f;

    /* renamed from: a */
    public int f171342a;

    /* renamed from: b */
    public C63408ai f171343b;

    /* renamed from: d */
    private C63408ai f171344d;

    /* renamed from: e */
    private byte f171345e = 2;

    static {
        C63404ae aeVar = new C63404ae();
        f171340c = aeVar;
        C62942bv.registerDefaultInstance(C63404ae.class, aeVar);
    }

    private C63404ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171345e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171345e = b;
                return null;
            case 2:
                return newMessageInfo(f171340c, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0003ᐉ\u0002", new Object[]{"a", "b", "d"});
            case 3:
                return new C63404ae();
            case 4:
                return new C63403ad();
            case 5:
                return f171340c;
            case 6:
                C63010eb ebVar = f171341f;
                if (ebVar == null) {
                    synchronized (C63404ae.class) {
                        ebVar = f171341f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171340c);
                            f171341f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
