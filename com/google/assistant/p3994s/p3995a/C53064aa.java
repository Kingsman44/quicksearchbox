package com.google.assistant.p3994s.p3995a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5027o.C64969d;

/* renamed from: com.google.assistant.s.a.aa */
/* compiled from: PG */
public final class C53064aa extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53064aa f139063d;

    /* renamed from: f */
    private static volatile C63010eb f139064f;

    /* renamed from: a */
    public int f139065a;

    /* renamed from: b */
    public C64969d f139066b;

    /* renamed from: c */
    public C53470z f139067c;

    /* renamed from: e */
    private byte f139068e = 2;

    static {
        C53064aa aaVar = new C53064aa();
        f139063d = aaVar;
        C62942bv.registerDefaultInstance(C53064aa.class, aaVar);
    }

    private C53064aa() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139068e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139068e = b;
                return null;
            case 2:
                return newMessageInfo(f139063d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53064aa();
            case 4:
                return new C53466v();
            case 5:
                return f139063d;
            case 6:
                C63010eb ebVar = f139064f;
                if (ebVar == null) {
                    synchronized (C53064aa.class) {
                        ebVar = f139064f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139063d);
                            f139064f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
