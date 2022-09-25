package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.cl */
/* compiled from: PG */
public final class C57414cl extends C62937bq implements C62938br {

    /* renamed from: b */
    public static final C57414cl f153380b;

    /* renamed from: d */
    private static volatile C63010eb f153381d;

    /* renamed from: a */
    public C62971cq f153382a = emptyProtobufList();

    /* renamed from: c */
    private byte f153383c = 2;

    static {
        C57414cl clVar = new C57414cl();
        f153380b = clVar;
        C62942bv.registerDefaultInstance(C57414cl.class, clVar);
    }

    private C57414cl() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153383c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153383c = b;
                return null;
            case 2:
                return newMessageInfo(f153380b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C57416cn.class});
            case 3:
                return new C57414cl();
            case 4:
                return new C57411ci();
            case 5:
                return f153380b;
            case 6:
                C63010eb ebVar = f153381d;
                if (ebVar == null) {
                    synchronized (C57414cl.class) {
                        ebVar = f153381d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153380b);
                            f153381d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
