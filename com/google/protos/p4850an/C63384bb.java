package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.bb */
/* compiled from: PG */
public final class C63384bb extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63384bb f171282a;

    /* renamed from: e */
    private static volatile C63010eb f171283e;

    /* renamed from: b */
    private int f171284b;

    /* renamed from: c */
    private C63389bg f171285c;

    /* renamed from: d */
    private byte f171286d = 2;

    static {
        C63384bb bbVar = new C63384bb();
        f171282a = bbVar;
        C62942bv.registerDefaultInstance(C63384bb.class, bbVar);
    }

    private C63384bb() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171286d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171286d = b;
                return null;
            case 2:
                return newMessageInfo(f171282a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63384bb();
            case 4:
                return new C63383ba();
            case 5:
                return f171282a;
            case 6:
                C63010eb ebVar = f171283e;
                if (ebVar == null) {
                    synchronized (C63384bb.class) {
                        ebVar = f171283e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171282a);
                            f171283e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
