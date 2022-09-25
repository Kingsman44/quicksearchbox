package com.google.lens.p4705i.p4706a;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.h */
/* compiled from: PG */
public final class C62377h extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62377h f168391c;

    /* renamed from: f */
    private static volatile C63010eb f168392f;

    /* renamed from: a */
    public C62395z f168393a;

    /* renamed from: b */
    public C19665d f168394b;

    /* renamed from: d */
    private int f168395d;

    /* renamed from: e */
    private byte f168396e = 2;

    static {
        C62377h hVar = new C62377h();
        f168391c = hVar;
        C62942bv.registerDefaultInstance(C62377h.class, hVar);
    }

    private C62377h() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168396e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168396e = b;
                return null;
            case 2:
                return newMessageInfo(f168391c, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C62377h();
            case 4:
                return new C62376g();
            case 5:
                return f168391c;
            case 6:
                C63010eb ebVar = f168392f;
                if (ebVar == null) {
                    synchronized (C62377h.class) {
                        ebVar = f168392f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168391c);
                            f168392f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
