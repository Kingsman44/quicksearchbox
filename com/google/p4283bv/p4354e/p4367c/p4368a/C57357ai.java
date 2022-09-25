package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ai */
/* compiled from: PG */
public final class C57357ai extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C57357ai f153229b;

    /* renamed from: d */
    private static volatile C63010eb f153230d;

    /* renamed from: a */
    public C62971cq f153231a = emptyProtobufList();

    /* renamed from: c */
    private byte f153232c = 2;

    static {
        C57357ai aiVar = new C57357ai();
        f153229b = aiVar;
        C62942bv.registerDefaultInstance(C57357ai.class, aiVar);
    }

    private C57357ai() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f153232c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f153232c = b;
                return null;
            case 2:
                return newMessageInfo(f153229b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C57359ak.class});
            case 3:
                return new C57357ai();
            case 4:
                return new C57356ah();
            case 5:
                return f153229b;
            case 6:
                C63010eb ebVar = f153230d;
                if (ebVar == null) {
                    synchronized (C57357ai.class) {
                        ebVar = f153230d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153229b);
                            f153230d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
