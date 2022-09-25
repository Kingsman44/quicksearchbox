package com.google.knowledge.p4671b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.ag */
/* compiled from: PG */
public final class C61788ag extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61788ag f166893c;

    /* renamed from: e */
    private static volatile C63010eb f166894e;

    /* renamed from: a */
    public int f166895a;

    /* renamed from: b */
    public C61797ap f166896b;

    /* renamed from: d */
    private byte f166897d = 2;

    static {
        C61788ag agVar = new C61788ag();
        f166893c = agVar;
        C62942bv.registerDefaultInstance(C61788ag.class, agVar);
    }

    private C61788ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166897d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166897d = b;
                return null;
            case 2:
                return newMessageInfo(f166893c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61788ag();
            case 4:
                return new C61787af();
            case 5:
                return f166893c;
            case 6:
                C63010eb ebVar = f166894e;
                if (ebVar == null) {
                    synchronized (C61788ag.class) {
                        ebVar = f166894e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166893c);
                            f166894e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
