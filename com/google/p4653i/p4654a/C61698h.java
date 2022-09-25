package com.google.p4653i.p4654a;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.i.a.h */
/* compiled from: PG */
public final class C61698h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61698h f166683c;

    /* renamed from: e */
    private static volatile C63010eb f166684e;

    /* renamed from: a */
    public int f166685a;

    /* renamed from: b */
    public C8242v f166686b;

    /* renamed from: d */
    private byte f166687d = 2;

    static {
        C61698h hVar = new C61698h();
        f166683c = hVar;
        C62942bv.registerDefaultInstance(C61698h.class, hVar);
    }

    private C61698h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166687d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166687d = b;
                return null;
            case 2:
                return newMessageInfo(f166683c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61698h();
            case 4:
                return new C61697g();
            case 5:
                return f166683c;
            case 6:
                C63010eb ebVar = f166684e;
                if (ebVar == null) {
                    synchronized (C61698h.class) {
                        ebVar = f166684e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166683c);
                            f166684e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
