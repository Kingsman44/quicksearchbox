package com.google.protos.p4934ay.p4939d.p4940a.p4941a.p4942a.p4943a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ay.d.a.a.a.a.r */
/* compiled from: PG */
public final class C64342r extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64342r f173935a;

    /* renamed from: e */
    private static volatile C63010eb f173936e;

    /* renamed from: b */
    private int f173937b;

    /* renamed from: c */
    private C64302au f173938c;

    /* renamed from: d */
    private byte f173939d = 2;

    static {
        C64342r rVar = new C64342r();
        f173935a = rVar;
        C62942bv.registerDefaultInstance(C64342r.class, rVar);
    }

    private C64342r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173939d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173939d = b;
                return null;
            case 2:
                return newMessageInfo(f173935a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C64342r();
            case 4:
                return new C64341q();
            case 5:
                return f173935a;
            case 6:
                C63010eb ebVar = f173936e;
                if (ebVar == null) {
                    synchronized (C64342r.class) {
                        ebVar = f173936e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173935a);
                            f173936e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
