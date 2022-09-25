package com.google.lens.p4705i.p4706a;

import com.google.android.libraries.p1657ba.p1664c.p1668c.p1671c.C19665d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.i.a.z */
/* compiled from: PG */
public final class C62395z extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C62395z f168436b;

    /* renamed from: d */
    private static volatile C63010eb f168437d;

    /* renamed from: a */
    public C19665d f168438a;

    /* renamed from: c */
    private byte f168439c = 2;

    static {
        C62395z zVar = new C62395z();
        f168436b = zVar;
        C62942bv.registerDefaultInstance(C62395z.class, zVar);
    }

    private C62395z() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168439c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f168439c = b;
                return null;
            case 2:
                return newMessageInfo(f168436b, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"a"});
            case 3:
                return new C62395z();
            case 4:
                return new C62394y();
            case 5:
                return f168436b;
            case 6:
                C63010eb ebVar = f168437d;
                if (ebVar == null) {
                    synchronized (C62395z.class) {
                        ebVar = f168437d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168436b);
                            f168437d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
