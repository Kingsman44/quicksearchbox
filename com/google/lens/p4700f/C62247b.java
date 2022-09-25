package com.google.lens.p4700f;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.f.b */
/* compiled from: PG */
public final class C62247b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C62247b f168052a;

    /* renamed from: c */
    private static volatile C63010eb f168053c;

    /* renamed from: b */
    private byte f168054b = 2;

    static {
        C62247b bVar = new C62247b();
        f168052a = bVar;
        C62942bv.registerDefaultInstance(C62247b.class, bVar);
    }

    private C62247b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f168054b);
            case 1:
                this.f168054b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f168052a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C62247b();
            case 4:
                return new C62246a();
            case 5:
                return f168052a;
            case 6:
                C63010eb ebVar = f168053c;
                if (ebVar == null) {
                    synchronized (C62247b.class) {
                        ebVar = f168053c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f168052a);
                            f168053c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
