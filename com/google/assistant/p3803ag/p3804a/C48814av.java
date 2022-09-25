package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4813ah.p4814a.p4815a.C63171d;

/* renamed from: com.google.assistant.ag.a.av */
/* compiled from: PG */
public final class C48814av extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48814av f126297a;

    /* renamed from: e */
    private static volatile C63010eb f126298e;

    /* renamed from: b */
    private int f126299b;

    /* renamed from: c */
    private C63171d f126300c;

    /* renamed from: d */
    private byte f126301d = 2;

    static {
        C48814av avVar = new C48814av();
        f126297a = avVar;
        C62942bv.registerDefaultInstance(C48814av.class, avVar);
    }

    private C48814av() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126301d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126301d = b;
                return null;
            case 2:
                return newMessageInfo(f126297a, "\u0001\u0001\u0000\u0001\u0003\u0003\u0001\u0000\u0000\u0001\u0003ᐉ\u0002", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48814av();
            case 4:
                return new C48813au();
            case 5:
                return f126297a;
            case 6:
                C63010eb ebVar = f126298e;
                if (ebVar == null) {
                    synchronized (C48814av.class) {
                        ebVar = f126298e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126297a);
                            f126298e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
