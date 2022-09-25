package com.google.protos.p4985f.p5020k;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.f.k.ag */
/* compiled from: PG */
public final class C64905ag extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C64905ag f175815a;

    /* renamed from: c */
    private static volatile C63010eb f175816c;

    /* renamed from: b */
    private byte f175817b = 2;

    static {
        C64905ag agVar = new C64905ag();
        f175815a = agVar;
        C62942bv.registerDefaultInstance(C64905ag.class, agVar);
    }

    private C64905ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175817b);
            case 1:
                this.f175817b = obj == null ? (byte) 0 : 1;
                return null;
            case 2:
                return newMessageInfo(f175815a, "\u0001\u0000", (Object[]) null);
            case 3:
                return new C64905ag();
            case 4:
                return new C64904af();
            case 5:
                return f175815a;
            case 6:
                C63010eb ebVar = f175816c;
                if (ebVar == null) {
                    synchronized (C64905ag.class) {
                        ebVar = f175816c;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175815a);
                            f175816c = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
