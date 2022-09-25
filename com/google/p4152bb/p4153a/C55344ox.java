package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.ox */
/* compiled from: PG */
public final class C55344ox extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55344ox f145810c;

    /* renamed from: d */
    public static final C62940bt f145811d;

    /* renamed from: e */
    private static volatile C63010eb f145812e;

    /* renamed from: a */
    public int f145813a;

    /* renamed from: b */
    public long f145814b;

    static {
        C55344ox oxVar = new C55344ox();
        f145810c = oxVar;
        C62942bv.registerDefaultInstance(C55344ox.class, oxVar);
        f145811d = C62942bv.newSingularGeneratedExtension(C55317nx.f145731c, oxVar, oxVar, (C62958ce) null, 85396739, C63066gd.MESSAGE, C55344ox.class);
    }

    private C55344ox() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f145810c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55344ox();
            case 4:
                return new C55343ow();
            case 5:
                return f145810c;
            case 6:
                C63010eb ebVar = f145812e;
                if (ebVar == null) {
                    synchronized (C55344ox.class) {
                        ebVar = f145812e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145810c);
                            f145812e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
