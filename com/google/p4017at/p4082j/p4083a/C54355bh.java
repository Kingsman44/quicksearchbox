package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.j.a.bh */
/* compiled from: PG */
public final class C54355bh extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C54355bh f142790b;

    /* renamed from: c */
    private static volatile C63010eb f142791c;

    /* renamed from: a */
    public C62971cq f142792a = emptyProtobufList();

    static {
        C54355bh bhVar = new C54355bh();
        f142790b = bhVar;
        C62942bv.registerDefaultInstance(C54355bh.class, bhVar);
    }

    private C54355bh() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f142790b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"a", C54407df.class});
            case 3:
                return new C54355bh();
            case 4:
                return new C54354bg();
            case 5:
                return f142790b;
            case 6:
                C63010eb ebVar = f142791c;
                if (ebVar == null) {
                    synchronized (C54355bh.class) {
                        ebVar = f142791c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142790b);
                            f142791c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
