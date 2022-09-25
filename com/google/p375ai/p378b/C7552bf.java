package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.bf */
/* compiled from: PG */
public final class C7552bf extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C7552bf f26124a;

    /* renamed from: c */
    private static volatile C63010eb f26125c;

    /* renamed from: b */
    private byte f26126b = 2;

    static {
        C7552bf bfVar = new C7552bf();
        f26124a = bfVar;
        C62942bv.registerDefaultInstance(C7552bf.class, bfVar);
    }

    private C7552bf() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f26126b);
            case 1:
                this.f26126b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f26124a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C7552bf();
            case 4:
                return new C7551be();
            case 5:
                return f26124a;
            case 6:
                C63010eb ebVar = f26125c;
                if (ebVar == null) {
                    synchronized (C7552bf.class) {
                        ebVar = f26125c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f26124a);
                            f26125c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
