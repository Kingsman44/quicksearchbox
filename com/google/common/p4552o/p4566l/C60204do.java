package com.google.common.p4552o.p4566l;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.common.o.l.do */
/* compiled from: PG */
public final class C60204do extends C62937bq implements C62938br {

    /* renamed from: a */
    public static final C60204do f162875a;

    /* renamed from: c */
    private static volatile C63010eb f162876c;

    /* renamed from: b */
    private byte f162877b = 2;

    static {
        C60204do doVar = new C60204do();
        f162875a = doVar;
        C62942bv.registerDefaultInstance(C60204do.class, doVar);
    }

    private C60204do() {
        emptyIntList();
        emptyIntList();
        emptyIntList();
        C62942bv.emptyProtobufList();
        C63088z zVar = C63088z.f170246b;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f162877b);
            case 1:
                this.f162877b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f162875a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C60204do();
            case 4:
                return new C60203dn();
            case 5:
                return f162875a;
            case 6:
                C63010eb ebVar = f162876c;
                if (ebVar == null) {
                    synchronized (C60204do.class) {
                        ebVar = f162876c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162875a);
                            f162876c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
