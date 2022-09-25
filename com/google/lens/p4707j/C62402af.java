package com.google.lens.p4707j;

import com.google.lens.p4698d.C62180s;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.j.af */
/* compiled from: PG */
public final class C62402af extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C62402af f168450c;

    /* renamed from: e */
    private static volatile C63010eb f168451e;

    /* renamed from: a */
    public int f168452a = 0;

    /* renamed from: b */
    public Object f168453b;

    /* renamed from: d */
    private byte f168454d = 2;

    static {
        C62402af afVar = new C62402af();
        f168450c = afVar;
        C62942bv.registerDefaultInstance(C62402af.class, afVar);
    }

    private C62402af() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168454d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f168454d = b;
                return null;
            case 2:
                return newMessageInfo(f168450c, "\u0001\u0001\u0001\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐼ\u0000", new Object[]{"b", "a", C62180s.class});
            case 3:
                return new C62402af();
            case 4:
                return new C62401ae();
            case 5:
                return f168450c;
            case 6:
                C63010eb ebVar = f168451e;
                if (ebVar == null) {
                    synchronized (C62402af.class) {
                        ebVar = f168451e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168450c);
                            f168451e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
