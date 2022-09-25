package com.google.p4017at.p4060h.p4061a.p4062a.p4066d;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.d.n */
/* compiled from: PG */
public final class C54162n extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54162n f142138d;

    /* renamed from: f */
    private static volatile C63010eb f142139f;

    /* renamed from: a */
    public int f142140a;

    /* renamed from: b */
    public C54128b f142141b;

    /* renamed from: c */
    public C54160l f142142c;

    /* renamed from: e */
    private byte f142143e = 2;

    static {
        C54162n nVar = new C54162n();
        f142138d = nVar;
        C62942bv.registerDefaultInstance(C54162n.class, nVar);
    }

    private C54162n() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142143e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142143e = b;
                return null;
            case 2:
                return newMessageInfo(f142138d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54162n();
            case 4:
                return new C54161m();
            case 5:
                return f142138d;
            case 6:
                C63010eb ebVar = f142139f;
                if (ebVar == null) {
                    synchronized (C54162n.class) {
                        ebVar = f142139f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142138d);
                            f142139f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
