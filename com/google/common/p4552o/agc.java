package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6285g.C80422b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4262c.C56340b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.agc */
/* compiled from: PG */
public final class agc extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final agc f158608e;

    /* renamed from: f */
    private static volatile C63010eb f158609f;

    /* renamed from: a */
    public int f158610a;

    /* renamed from: b */
    public C62961ch f158611b = emptyIntList();

    /* renamed from: c */
    public float f158612c;

    /* renamed from: d */
    public C62961ch f158613d = emptyIntList();

    static {
        agc agc = new agc();
        f158608e = agc;
        C62942bv.registerDefaultInstance(agc.class, agc);
    }

    private agc() {
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
                return newMessageInfo(f158608e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001e\u0002ခ\u0000\u0003\u001e", new Object[]{"a", "b", C56340b.m87977b(), C45240c.f118157a, "d", C80422b.m128156b()});
            case 3:
                return new agc();
            case 4:
                return new agb();
            case 5:
                return f158608e;
            case 6:
                C63010eb ebVar = f158609f;
                if (ebVar == null) {
                    synchronized (agc.class) {
                        ebVar = f158609f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158608e);
                            f158609f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
