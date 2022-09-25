package com.google.p4283bv.p4369f.p4370a.p4371a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.f.a.a.ca */
/* compiled from: PG */
public final class C57611ca extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C57611ca f153892a;

    /* renamed from: c */
    private static volatile C63010eb f153893c;

    /* renamed from: b */
    private byte f153894b = 2;

    static {
        C57611ca caVar = new C57611ca();
        f153892a = caVar;
        C62942bv.registerDefaultInstance(C57611ca.class, caVar);
    }

    private C57611ca() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153894b);
            case 1:
                this.f153894b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f153892a, "\u0000\u0000", (Object[]) null);
            case 3:
                return new C57611ca();
            case 4:
                return new C57609bz();
            case 5:
                return f153892a;
            case 6:
                C63010eb ebVar = f153893c;
                if (ebVar == null) {
                    synchronized (C57611ca.class) {
                        ebVar = f153893c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153892a);
                            f153893c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
