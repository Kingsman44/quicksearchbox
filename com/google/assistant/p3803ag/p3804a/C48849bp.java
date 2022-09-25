package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4068b.p4069a.C54188e;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.bp */
/* compiled from: PG */
public final class C48849bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C48849bp f126405d;

    /* renamed from: g */
    private static volatile C63010eb f126406g;

    /* renamed from: a */
    public int f126407a;

    /* renamed from: b */
    public C48847bn f126408b;

    /* renamed from: c */
    public C54188e f126409c;

    /* renamed from: e */
    private C48834ba f126410e;

    /* renamed from: f */
    private byte f126411f = 2;

    static {
        C48849bp bpVar = new C48849bp();
        f126405d = bpVar;
        C62942bv.registerDefaultInstance(C48849bp.class, bpVar);
    }

    private C48849bp() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126411f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126411f = b;
                return null;
            case 2:
                return newMessageInfo(f126405d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"a", "b", "e", C45240c.f118157a});
            case 3:
                return new C48849bp();
            case 4:
                return new C48848bo();
            case 5:
                return f126405d;
            case 6:
                C63010eb ebVar = f126406g;
                if (ebVar == null) {
                    synchronized (C48849bp.class) {
                        ebVar = f126406g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126405d);
                            f126406g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
