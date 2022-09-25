package com.google.p4017at.p4086k.p4087a.p4088a.p4089a;

import com.google.p4283bv.p4369f.p4370a.p4371a.C57616cf;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.k.a.a.a.ab */
/* compiled from: PG */
public final class C54464ab extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54464ab f143008b;

    /* renamed from: d */
    private static volatile C63010eb f143009d;

    /* renamed from: a */
    public C57616cf f143010a;

    /* renamed from: c */
    private byte f143011c = 2;

    static {
        C54464ab abVar = new C54464ab();
        f143008b = abVar;
        C62942bv.registerDefaultInstance(C54464ab.class, abVar);
    }

    private C54464ab() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f143011c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f143011c = b;
                return null;
            case 2:
                return newMessageInfo(f143008b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C54464ab();
            case 4:
                return new C54463aa();
            case 5:
                return f143008b;
            case 6:
                C63010eb ebVar = f143009d;
                if (ebVar == null) {
                    synchronized (C54464ab.class) {
                        ebVar = f143009d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143008b);
                            f143009d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
