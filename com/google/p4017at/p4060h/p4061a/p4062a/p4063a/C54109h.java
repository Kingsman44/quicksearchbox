package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.h */
/* compiled from: PG */
public final class C54109h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54109h f141977c;

    /* renamed from: f */
    private static volatile C63010eb f141978f;

    /* renamed from: a */
    public int f141979a;

    /* renamed from: b */
    public C62971cq f141980b = emptyProtobufList();

    /* renamed from: d */
    private int f141981d;

    /* renamed from: e */
    private byte f141982e = 2;

    static {
        C54109h hVar = new C54109h();
        f141977c = hVar;
        C62942bv.registerDefaultInstance(C54109h.class, hVar);
    }

    private C54109h() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141982e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141982e = b;
                return null;
            case 2:
                return newMessageInfo(f141977c, "\u0001\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0001\u0004င\u0001\u0005Л", new Object[]{"d", "a", "b", C54108g.class});
            case 3:
                return new C54109h();
            case 4:
                return new C54104c();
            case 5:
                return f141977c;
            case 6:
                C63010eb ebVar = f141978f;
                if (ebVar == null) {
                    synchronized (C54109h.class) {
                        ebVar = f141978f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141977c);
                            f141978f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
