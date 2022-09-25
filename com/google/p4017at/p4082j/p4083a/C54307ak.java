package com.google.p4017at.p4082j.p4083a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4816ai.p4820d.p4828e.C63244b;

/* renamed from: com.google.at.j.a.ak */
/* compiled from: PG */
public final class C54307ak extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54307ak f142671c;

    /* renamed from: f */
    private static volatile C63010eb f142672f;

    /* renamed from: a */
    public C62971cq f142673a = emptyProtobufList();

    /* renamed from: b */
    public C54447l f142674b;

    /* renamed from: d */
    private C63244b f142675d;

    /* renamed from: e */
    private byte f142676e = 2;

    static {
        C54307ak akVar = new C54307ak();
        f142671c = akVar;
        C62942bv.registerDefaultInstance(C54307ak.class, akVar);
    }

    private C54307ak() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142676e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142676e = b;
                return null;
            case 2:
                return newMessageInfo(f142671c, "\u0000\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0001\u0001\u0001\u001b\u0002\t\u0004Љ", new Object[]{"a", C54449n.class, "b", "d"});
            case 3:
                return new C54307ak();
            case 4:
                return new C54306aj();
            case 5:
                return f142671c;
            case 6:
                C63010eb ebVar = f142672f;
                if (ebVar == null) {
                    synchronized (C54307ak.class) {
                        ebVar = f142672f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142671c);
                            f142672f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
