package com.google.lens.p4708k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.t */
/* compiled from: PG */
public final class C62612t extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62612t f169048a;

    /* renamed from: c */
    private static volatile C63010eb f169049c;

    /* renamed from: b */
    private byte f169050b = 2;

    static {
        C62612t tVar = new C62612t();
        f169048a = tVar;
        C62942bv.registerDefaultInstance(C62612t.class, tVar);
    }

    private C62612t() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f169050b);
            case 1:
                this.f169050b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f169048a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62612t();
            case 4:
                return new C62611s();
            case 5:
                return f169048a;
            case 6:
                C63010eb ebVar = f169049c;
                if (ebVar == null) {
                    synchronized (C62612t.class) {
                        ebVar = f169049c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169048a);
                            f169049c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
