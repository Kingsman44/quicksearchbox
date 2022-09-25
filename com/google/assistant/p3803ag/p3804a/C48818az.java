package com.google.assistant.p3803ag.p3804a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4950bb.p4952b.C64396f;

/* renamed from: com.google.assistant.ag.a.az */
/* compiled from: PG */
public final class C48818az extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48818az f126306a;

    /* renamed from: e */
    private static volatile C63010eb f126307e;

    /* renamed from: b */
    private int f126308b;

    /* renamed from: c */
    private C64396f f126309c;

    /* renamed from: d */
    private byte f126310d = 2;

    static {
        C48818az azVar = new C48818az();
        f126306a = azVar;
        C62942bv.registerDefaultInstance(C48818az.class, azVar);
    }

    private C48818az() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f126310d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f126310d = b;
                return null;
            case 2:
                return newMessageInfo(f126306a, "\u0001\u0001\u0000\u0001\u0007\u0007\u0001\u0000\u0000\u0001\u0007ᐉ\u0001", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C48818az();
            case 4:
                return new C48817ay();
            case 5:
                return f126306a;
            case 6:
                C63010eb ebVar = f126307e;
                if (ebVar == null) {
                    synchronized (C48818az.class) {
                        ebVar = f126307e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126306a);
                            f126307e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
