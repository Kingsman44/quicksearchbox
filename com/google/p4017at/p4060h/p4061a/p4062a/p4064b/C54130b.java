package com.google.p4017at.p4060h.p4061a.p4062a.p4064b;

import com.google.p395al.p408c.p411b.p412a.p413a.C8450b;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.b.b */
/* compiled from: PG */
public final class C54130b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54130b f142044c;

    /* renamed from: f */
    private static volatile C63010eb f142045f;

    /* renamed from: a */
    public int f142046a;

    /* renamed from: b */
    public C8450b f142047b;

    /* renamed from: d */
    private C54128b f142048d;

    /* renamed from: e */
    private byte f142049e = 2;

    static {
        C54130b bVar = new C54130b();
        f142044c = bVar;
        C62942bv.registerDefaultInstance(C54130b.class, bVar);
    }

    private C54130b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142049e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142049e = b;
                return null;
            case 2:
                return newMessageInfo(f142044c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ဉ\u0000\u0002ᐉ\u0001", new Object[]{"a", "b", "d"});
            case 3:
                return new C54130b();
            case 4:
                return new C54129a();
            case 5:
                return f142044c;
            case 6:
                C63010eb ebVar = f142045f;
                if (ebVar == null) {
                    synchronized (C54130b.class) {
                        ebVar = f142045f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142044c);
                            f142045f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
