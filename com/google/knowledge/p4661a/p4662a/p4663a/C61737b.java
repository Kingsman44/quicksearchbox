package com.google.knowledge.p4661a.p4662a.p4663a;

import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.a.a.b */
/* compiled from: PG */
public final class C61737b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C61737b f166782c;

    /* renamed from: e */
    private static volatile C63010eb f166783e;

    /* renamed from: a */
    public int f166784a;

    /* renamed from: b */
    public C61748j f166785b;

    /* renamed from: d */
    private byte f166786d = 2;

    static {
        C61737b bVar = new C61737b();
        f166782c = bVar;
        C62942bv.registerDefaultInstance(C61737b.class, bVar);
    }

    private C61737b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166786d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166786d = b;
                return null;
            case 2:
                return newMessageInfo(f166782c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C61737b();
            case 4:
                return new C61736a();
            case 5:
                return f166782c;
            case 6:
                C63010eb ebVar = f166783e;
                if (ebVar == null) {
                    synchronized (C61737b.class) {
                        ebVar = f166783e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166782c);
                            f166783e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
