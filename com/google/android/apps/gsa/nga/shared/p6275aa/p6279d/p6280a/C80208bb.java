package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.assistant.p3897e.p3921j.p3926e.C51963fp;
import com.google.protobuf.C62912at;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.bb */
/* compiled from: PG */
public final class C80208bb extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80208bb f220061c;

    /* renamed from: d */
    private static volatile C63010eb f220062d;

    /* renamed from: a */
    public int f220063a = 0;

    /* renamed from: b */
    public Object f220064b;

    static {
        C80208bb bbVar = new C80208bb();
        f220061c = bbVar;
        C62942bv.registerDefaultInstance(C80208bb.class, bbVar);
    }

    private C80208bb() {
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
                return newMessageInfo(f220061c, "\u0001\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001ြ\u0000\u0002ြ\u0000\u0003ြ\u0000", new Object[]{"b", "a", C80259n.class, C51963fp.class, C62912at.class});
            case 3:
                return new C80208bb();
            case 4:
                return new C80207ba();
            case 5:
                return f220061c;
            case 6:
                C63010eb ebVar = f220062d;
                if (ebVar == null) {
                    synchronized (C80208bb.class) {
                        ebVar = f220062d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220061c);
                            f220062d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
