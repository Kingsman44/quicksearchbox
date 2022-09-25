package com.google.p4152bb.p4153a;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.bb.a.cm */
/* compiled from: PG */
public final class C55009cm extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C55009cm f144725c;

    /* renamed from: d */
    public static final C62940bt f144726d;

    /* renamed from: e */
    private static volatile C63010eb f144727e;

    /* renamed from: a */
    public int f144728a;

    /* renamed from: b */
    public int f144729b;

    static {
        C55009cm cmVar = new C55009cm();
        f144725c = cmVar;
        C62942bv.registerDefaultInstance(C55009cm.class, cmVar);
        f144726d = C62942bv.newSingularGeneratedExtension(C55005ci.f144714d, cmVar, cmVar, (C62958ce) null, 81979894, C63066gd.MESSAGE, C55009cm.class);
    }

    private C55009cm() {
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
                return newMessageInfo(f144725c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"a", "b"});
            case 3:
                return new C55009cm();
            case 4:
                return new C55008cl();
            case 5:
                return f144725c;
            case 6:
                C63010eb ebVar = f144727e;
                if (ebVar == null) {
                    synchronized (C55009cm.class) {
                        ebVar = f144727e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144725c);
                            f144727e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
