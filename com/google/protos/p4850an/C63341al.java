package com.google.protos.p4850an;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.al */
/* compiled from: PG */
public final class C63341al extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63341al f171177a;

    /* renamed from: c */
    private static volatile C63010eb f171178c;

    /* renamed from: b */
    private byte f171179b = 2;

    static {
        C63341al alVar = new C63341al();
        f171177a = alVar;
        C62942bv.registerDefaultInstance(C63341al.class, alVar);
    }

    private C63341al() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171179b);
            case 1:
                this.f171179b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f171177a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C63341al();
            case 4:
                return new C63340ak();
            case 5:
                return f171177a;
            case 6:
                C63010eb ebVar = f171178c;
                if (ebVar == null) {
                    synchronized (C63341al.class) {
                        ebVar = f171178c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171177a);
                            f171178c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
