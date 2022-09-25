package com.google.p395al.p408c.p409a.p410a;

import com.google.p4152bb.p4153a.C55421x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.al.c.a.a.g */
/* compiled from: PG */
public final class C8448g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8448g f29351c;

    /* renamed from: f */
    private static volatile C63010eb f29352f;

    /* renamed from: a */
    public int f29353a;

    /* renamed from: b */
    public C62971cq f29354b = emptyProtobufList();

    /* renamed from: d */
    private int f29355d;

    /* renamed from: e */
    private byte f29356e = 2;

    static {
        C8448g gVar = new C8448g();
        f29351c = gVar;
        C62942bv.registerDefaultInstance(C8448g.class, gVar);
    }

    private C8448g() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f29356e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f29356e = b;
                return null;
            case 2:
                return newMessageInfo(f29351c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0001\u0001ဌ\u0001\u0002Л", new Object[]{"d", "a", C55421x.m87687b(), "b", C8446e.class});
            case 3:
                return new C8448g();
            case 4:
                return new C8447f();
            case 5:
                return f29351c;
            case 6:
                C63010eb ebVar = f29352f;
                if (ebVar == null) {
                    synchronized (C8448g.class) {
                        ebVar = f29352f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29351c);
                            f29352f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
