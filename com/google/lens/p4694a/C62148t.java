package com.google.lens.p4694a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.t */
/* compiled from: PG */
public final class C62148t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62148t f167783a;

    /* renamed from: c */
    private static volatile C63010eb f167784c;

    /* renamed from: b */
    private byte f167785b = 2;

    static {
        C62148t tVar = new C62148t();
        f167783a = tVar;
        C62942bv.registerDefaultInstance(C62148t.class, tVar);
    }

    private C62148t() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f167785b);
            case 1:
                this.f167785b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f167783a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62148t();
            case 4:
                return new C62147s();
            case 5:
                return f167783a;
            case 6:
                C63010eb ebVar = f167784c;
                if (ebVar == null) {
                    synchronized (C62148t.class) {
                        ebVar = f167784c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167783a);
                            f167784c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
