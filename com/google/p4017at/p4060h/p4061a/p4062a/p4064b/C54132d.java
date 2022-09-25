package com.google.p4017at.p4060h.p4061a.p4062a.p4064b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p395al.p398b.p399a.p400a.p401a.C8417b;
import com.google.p4017at.p4060h.p4061a.p4062a.C54144d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.b.d */
/* compiled from: PG */
public final class C54132d extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54132d f142050d;

    /* renamed from: f */
    private static volatile C63010eb f142051f;

    /* renamed from: a */
    public int f142052a;

    /* renamed from: b */
    public C8417b f142053b;

    /* renamed from: c */
    public C54144d f142054c;

    /* renamed from: e */
    private byte f142055e = 2;

    static {
        C54132d dVar = new C54132d();
        f142050d = dVar;
        C62942bv.registerDefaultInstance(C54132d.class, dVar);
    }

    private C54132d() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142055e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142055e = b;
                return null;
            case 2:
                return newMessageInfo(f142050d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᐉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54132d();
            case 4:
                return new C54131c();
            case 5:
                return f142050d;
            case 6:
                C63010eb ebVar = f142051f;
                if (ebVar == null) {
                    synchronized (C54132d.class) {
                        ebVar = f142051f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142050d);
                            f142051f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
