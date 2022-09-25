package com.google.lens.p4699e;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.e.af */
/* compiled from: PG */
public final class C62193af extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62193af f167928a;

    /* renamed from: c */
    private static volatile C63010eb f167929c;

    /* renamed from: b */
    private byte f167930b = 2;

    static {
        C62193af afVar = new C62193af();
        f167928a = afVar;
        C62942bv.registerDefaultInstance(C62193af.class, afVar);
    }

    private C62193af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167930b);
            case 1:
                this.f167930b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167928a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62193af();
            case 4:
                return new C62192ae();
            case 5:
                return f167928a;
            case 6:
                C63010eb ebVar = f167929c;
                if (ebVar == null) {
                    synchronized (C62193af.class) {
                        ebVar = f167929c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167928a);
                            f167929c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
