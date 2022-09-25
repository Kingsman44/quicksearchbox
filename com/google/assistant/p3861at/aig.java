package com.google.assistant.p3861at;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.aig */
/* compiled from: PG */
public final class aig extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final aig f129387d;

    /* renamed from: f */
    private static volatile C63010eb f129388f;

    /* renamed from: a */
    public int f129389a;

    /* renamed from: b */
    public ahz f129390b;

    /* renamed from: c */
    public boolean f129391c;

    /* renamed from: e */
    private byte f129392e = 2;

    static {
        aig aig = new aig();
        f129387d = aig;
        C62942bv.registerDefaultInstance(aig.class, aig);
    }

    private aig() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f129392e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f129392e = b;
                return null;
            case 2:
                return newMessageInfo(f129387d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new aig();
            case 4:
                return new aif();
            case 5:
                return f129387d;
            case 6:
                C63010eb ebVar = f129388f;
                if (ebVar == null) {
                    synchronized (aig.class) {
                        ebVar = f129388f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129387d);
                            f129388f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
