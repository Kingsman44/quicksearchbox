package com.google.assistant.p3745ab.p3768t;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.t.b */
/* compiled from: PG */
public final class C48398b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48398b f125092a;

    /* renamed from: d */
    private static volatile C63010eb f125093d;

    /* renamed from: b */
    private C48400d f125094b;

    /* renamed from: c */
    private byte f125095c = 2;

    static {
        C48398b bVar = new C48398b();
        f125092a = bVar;
        C62942bv.registerDefaultInstance(C48398b.class, bVar);
    }

    private C48398b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125095c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125095c = b;
                return null;
            case 2:
                return newMessageInfo(f125092a, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0001\u0002Љ", new Object[]{"b"});
            case 3:
                return new C48398b();
            case 4:
                return new C48397a();
            case 5:
                return f125092a;
            case 6:
                C63010eb ebVar = f125093d;
                if (ebVar == null) {
                    synchronized (C48398b.class) {
                        ebVar = f125093d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125092a);
                            f125093d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
