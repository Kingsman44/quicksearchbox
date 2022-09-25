package com.google.assistant.p3745ab.p3765q;

import com.google.assistant.p3745ab.C48255bl;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.q.b */
/* compiled from: PG */
public final class C48383b extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48383b f125062a;

    /* renamed from: d */
    private static volatile C63010eb f125063d;

    /* renamed from: b */
    private C48255bl f125064b;

    /* renamed from: c */
    private byte f125065c = 2;

    static {
        C48383b bVar = new C48383b();
        f125062a = bVar;
        C62942bv.registerDefaultInstance(C48383b.class, bVar);
    }

    private C48383b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 0;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f125065c);
            case 1:
                if (obj != null) {
                    b = 1;
                }
                this.f125065c = b;
                return null;
            case 2:
                return newMessageInfo(f125062a, "\u0000\u0001\u0000\u0000\u0005\u0005\u0001\u0000\u0000\u0001\u0005Љ", new Object[]{"b"});
            case 3:
                return new C48383b();
            case 4:
                return new C48382a();
            case 5:
                return f125062a;
            case 6:
                C63010eb ebVar = f125063d;
                if (ebVar == null) {
                    synchronized (C48383b.class) {
                        ebVar = f125063d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f125062a);
                            f125063d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
