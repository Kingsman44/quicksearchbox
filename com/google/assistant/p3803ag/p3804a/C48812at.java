package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3927k.p3928a.C52666f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ag.a.at */
/* compiled from: PG */
public final class C48812at extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48812at f126292a;

    /* renamed from: e */
    private static volatile C63010eb f126293e;

    /* renamed from: b */
    private int f126294b;

    /* renamed from: c */
    private C52666f f126295c;

    /* renamed from: d */
    private byte f126296d = 2;

    static {
        C48812at atVar = new C48812at();
        f126292a = atVar;
        C62942bv.registerDefaultInstance(C48812at.class, atVar);
    }

    private C48812at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126296d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126296d = b;
                return null;
            case 2:
                return newMessageInfo(f126292a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48812at();
            case 4:
                return new C48811as();
            case 5:
                return f126292a;
            case 6:
                C63010eb ebVar = f126293e;
                if (ebVar == null) {
                    synchronized (C48812at.class) {
                        ebVar = f126293e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126292a);
                            f126293e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
