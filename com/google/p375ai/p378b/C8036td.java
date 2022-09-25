package com.google.p375ai.p378b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ai.b.td */
/* compiled from: PG */
public final class C8036td extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8036td f28229a;

    /* renamed from: c */
    private static volatile C63010eb f28230c;

    /* renamed from: b */
    private byte f28231b = 2;

    static {
        C8036td tdVar = new C8036td();
        f28229a = tdVar;
        C62942bv.registerDefaultInstance(C8036td.class, tdVar);
    }

    private C8036td() {
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28231b);
            case 1:
                this.f28231b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f28229a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C8036td();
            case 4:
                return new C8035tc();
            case 5:
                return f28229a;
            case 6:
                C63010eb ebVar = f28230c;
                if (ebVar == null) {
                    synchronized (C8036td.class) {
                        ebVar = f28230c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28229a);
                            f28230c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
