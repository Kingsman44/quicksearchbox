package com.google.nlp.p4730a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.nlp.a.ae */
/* compiled from: PG */
public final class C62741ae extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62741ae f169461a;

    /* renamed from: c */
    private static volatile C63010eb f169462c;

    /* renamed from: b */
    private byte f169463b = 2;

    static {
        C62741ae aeVar = new C62741ae();
        f169461a = aeVar;
        C62942bv.registerDefaultInstance(C62741ae.class, aeVar);
    }

    private C62741ae() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169463b);
            case 1:
                this.f169463b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169461a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62741ae();
            case 4:
                return new C62740ad();
            case 5:
                return f169461a;
            case 6:
                C63010eb ebVar = f169462c;
                if (ebVar == null) {
                    synchronized (C62741ae.class) {
                        ebVar = f169462c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169461a);
                            f169462c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
