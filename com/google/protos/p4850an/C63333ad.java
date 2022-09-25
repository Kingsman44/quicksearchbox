package com.google.protos.p4850an;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61748j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.ad */
/* compiled from: PG */
public final class C63333ad extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C63333ad f171166a;

    /* renamed from: e */
    private static volatile C63010eb f171167e;

    /* renamed from: b */
    private int f171168b;

    /* renamed from: c */
    private C61748j f171169c;

    /* renamed from: d */
    private byte f171170d = 2;

    static {
        C63333ad adVar = new C63333ad();
        f171166a = adVar;
        C62942bv.registerDefaultInstance(C63333ad.class, adVar);
    }

    private C63333ad() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171170d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171170d = b;
                return null;
            case 2:
                return newMessageInfo(f171166a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", C45240c.f118157a});
            case 3:
                return new C63333ad();
            case 4:
                return new C63332ac();
            case 5:
                return f171166a;
            case 6:
                C63010eb ebVar = f171167e;
                if (ebVar == null) {
                    synchronized (C63333ad.class) {
                        ebVar = f171167e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171166a);
                            f171167e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
