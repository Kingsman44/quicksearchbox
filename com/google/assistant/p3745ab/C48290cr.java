package com.google.assistant.p3745ab;

import com.google.net.p4726a.p4728b.C62724b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.cr */
/* compiled from: PG */
public final class C48290cr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48290cr f124887a;

    /* renamed from: d */
    private static volatile C63010eb f124888d;

    /* renamed from: b */
    private C62724b f124889b;

    /* renamed from: c */
    private byte f124890c = 2;

    static {
        C48290cr crVar = new C48290cr();
        f124887a = crVar;
        C62942bv.registerDefaultInstance(C48290cr.class, crVar);
    }

    private C48290cr() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124890c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f124890c = b;
                return null;
            case 2:
                return newMessageInfo(f124887a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ", new Object[]{"b"});
            case 3:
                return new C48290cr();
            case 4:
                return new C48289cq();
            case 5:
                return f124887a;
            case 6:
                C63010eb ebVar = f124888d;
                if (ebVar == null) {
                    synchronized (C48290cr.class) {
                        ebVar = f124888d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124887a);
                            f124888d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
