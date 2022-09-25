package com.google.assistant.p3994s.p3995a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.mr */
/* compiled from: PG */
public final class C53405mr extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53405mr f140136a;

    /* renamed from: c */
    private static volatile C63010eb f140137c;

    /* renamed from: b */
    private byte f140138b = 2;

    static {
        C53405mr mrVar = new C53405mr();
        f140136a = mrVar;
        C62942bv.registerDefaultInstance(C53405mr.class, mrVar);
    }

    private C53405mr() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f140138b);
            case 1:
                this.f140138b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f140136a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C53405mr();
            case 4:
                return new C53404mq();
            case 5:
                return f140136a;
            case 6:
                C63010eb ebVar = f140137c;
                if (ebVar == null) {
                    synchronized (C53405mr.class) {
                        ebVar = f140137c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140136a);
                            f140137c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
