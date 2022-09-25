package com.google.p4017at.p4060h.p4061a.p4062a.p4063a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.C54128b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.a.a.a.q */
/* compiled from: PG */
public final class C54118q extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C54118q f142002d;

    /* renamed from: f */
    private static volatile C63010eb f142003f;

    /* renamed from: a */
    public int f142004a;

    /* renamed from: b */
    public C54128b f142005b;

    /* renamed from: c */
    public C54116o f142006c;

    /* renamed from: e */
    private byte f142007e = 2;

    static {
        C54118q qVar = new C54118q();
        f142002d = qVar;
        C62942bv.registerDefaultInstance(C54118q.class, qVar);
    }

    private C54118q() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f142007e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f142007e = b;
                return null;
            case 2:
                return newMessageInfo(f142002d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C54118q();
            case 4:
                return new C54117p();
            case 5:
                return f142002d;
            case 6:
                C63010eb ebVar = f142003f;
                if (ebVar == null) {
                    synchronized (C54118q.class) {
                        ebVar = f142003f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142002d);
                            f142003f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
