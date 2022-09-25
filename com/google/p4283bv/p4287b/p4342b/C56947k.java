package com.google.p4283bv.p4287b.p4342b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.b.b.k */
/* compiled from: PG */
public final class C56947k extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C56947k f151990a;

    /* renamed from: c */
    private static volatile C63010eb f151991c;

    /* renamed from: b */
    private byte f151992b = 2;

    static {
        C56947k kVar = new C56947k();
        f151990a = kVar;
        C62942bv.registerDefaultInstance(C56947k.class, kVar);
    }

    private C56947k() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f151992b);
            case 1:
                this.f151992b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f151990a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C56947k();
            case 4:
                return new C56946j();
            case 5:
                return f151990a;
            case 6:
                C63010eb ebVar = f151991c;
                if (ebVar == null) {
                    synchronized (C56947k.class) {
                        ebVar = f151991c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151990a);
                            f151991c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
