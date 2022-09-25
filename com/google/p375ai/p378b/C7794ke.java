package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.ke */
/* compiled from: PG */
public final class C7794ke extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7794ke f27258a;

    /* renamed from: c */
    private static volatile C63010eb f27259c;

    /* renamed from: b */
    private byte f27260b = 2;

    static {
        C7794ke keVar = new C7794ke();
        f27258a = keVar;
        C62942bv.registerDefaultInstance(C7794ke.class, keVar);
    }

    private C7794ke() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f27260b);
            case 1:
                this.f27260b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f27258a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7794ke();
            case 4:
                return new C7793kd();
            case 5:
                return f27258a;
            case 6:
                C63010eb ebVar = f27259c;
                if (ebVar == null) {
                    synchronized (C7794ke.class) {
                        ebVar = f27259c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f27258a);
                            f27259c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
