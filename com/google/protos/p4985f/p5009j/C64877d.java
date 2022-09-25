package com.google.protos.p4985f.p5009j;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.j.d */
/* compiled from: PG */
public final class C64877d extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C64877d f175784a;

    /* renamed from: c */
    private static volatile C63010eb f175785c;

    /* renamed from: b */
    private byte f175786b = 2;

    static {
        C64877d dVar = new C64877d();
        f175784a = dVar;
        C62942bv.registerDefaultInstance(C64877d.class, dVar);
    }

    private C64877d() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175786b);
            case 1:
                this.f175786b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f175784a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64877d();
            case 4:
                return new C64874c();
            case 5:
                return f175784a;
            case 6:
                C63010eb ebVar = f175785c;
                if (ebVar == null) {
                    synchronized (C64877d.class) {
                        ebVar = f175785c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175784a);
                            f175785c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
