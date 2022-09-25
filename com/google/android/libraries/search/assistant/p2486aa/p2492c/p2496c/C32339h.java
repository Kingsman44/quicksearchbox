package com.google.android.libraries.search.assistant.p2486aa.p2492c.p2496c;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5219a.C66722az;

/* renamed from: com.google.android.libraries.search.assistant.aa.c.c.h */
/* compiled from: PG */
public final class C32339h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C32339h f86681c;

    /* renamed from: e */
    private static volatile C63010eb f86682e;

    /* renamed from: a */
    public int f86683a;

    /* renamed from: b */
    public C66722az f86684b;

    /* renamed from: d */
    private byte f86685d = 2;

    static {
        C32339h hVar = new C32339h();
        f86681c = hVar;
        C62942bv.registerDefaultInstance(C32339h.class, hVar);
    }

    private C32339h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f86685d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f86685d = b;
                return null;
            case 2:
                return newMessageInfo(f86681c, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C32339h();
            case 4:
                return new C32338g();
            case 5:
                return f86681c;
            case 6:
                C63010eb ebVar = f86682e;
                if (ebVar == null) {
                    synchronized (C32339h.class) {
                        ebVar = f86682e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f86681c);
                            f86682e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
