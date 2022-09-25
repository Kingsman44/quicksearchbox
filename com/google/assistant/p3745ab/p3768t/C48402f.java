package com.google.assistant.p3745ab.p3768t;

import com.google.p4500cm.p4501a.p4502a.p4505b.C58141c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.t.f */
/* compiled from: PG */
public final class C48402f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48402f f125100a;

    /* renamed from: d */
    private static volatile C63010eb f125101d;

    /* renamed from: b */
    private C58141c f125102b;

    /* renamed from: c */
    private byte f125103c = 2;

    static {
        C48402f fVar = new C48402f();
        f125100a = fVar;
        C62942bv.registerDefaultInstance(C48402f.class, fVar);
    }

    private C48402f() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125103c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125103c = b;
                return null;
            case 2:
                return newMessageInfo(f125100a, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0001\u0001Љ", new Object[]{"b"});
            case 3:
                return new C48402f();
            case 4:
                return new C48401e();
            case 5:
                return f125100a;
            case 6:
                C63010eb ebVar = f125101d;
                if (ebVar == null) {
                    synchronized (C48402f.class) {
                        ebVar = f125101d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125100a);
                            f125101d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
