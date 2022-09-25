package com.google.android.apps.p489g.p494d;

import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57315dp;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.g.d.al */
/* compiled from: PG */
public final class C9149al extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C9149al f31584c;

    /* renamed from: e */
    private static volatile C63010eb f31585e;

    /* renamed from: a */
    public int f31586a;

    /* renamed from: b */
    public C57315dp f31587b;

    /* renamed from: d */
    private byte f31588d = 2;

    static {
        C9149al alVar = new C9149al();
        f31584c = alVar;
        C62942bv.registerDefaultInstance(C9149al.class, alVar);
    }

    private C9149al() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f31588d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f31588d = b;
                return null;
            case 2:
                return newMessageInfo(f31584c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C9149al();
            case 4:
                return new C9148ak();
            case 5:
                return f31584c;
            case 6:
                C63010eb ebVar = f31585e;
                if (ebVar == null) {
                    synchronized (C9149al.class) {
                        ebVar = f31585e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f31584c);
                            f31585e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
