package com.google.p395al.p408c.p414c.p416b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.c.b.h */
/* compiled from: PG */
public final class C8498h extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C8498h f29494b;

    /* renamed from: d */
    private static volatile C63010eb f29495d;

    /* renamed from: a */
    public C62971cq f29496a = emptyProtobufList();

    /* renamed from: c */
    private byte f29497c = 2;

    static {
        C8498h hVar = new C8498h();
        f29494b = hVar;
        C62942bv.registerDefaultInstance(C8498h.class, hVar);
    }

    private C8498h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29497c);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29497c = b;
                return null;
            case 2:
                return newMessageInfo(f29494b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8495e.class});
            case 3:
                return new C8498h();
            case 4:
                return new C8457a();
            case 5:
                return f29494b;
            case 6:
                C63010eb ebVar = f29495d;
                if (ebVar == null) {
                    synchronized (C8498h.class) {
                        ebVar = f29495d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29494b);
                            f29495d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
