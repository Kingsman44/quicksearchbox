package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.lh */
/* compiled from: PG */
public final class C60234lh extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60234lh f162963e;

    /* renamed from: f */
    private static volatile C63010eb f162964f;

    /* renamed from: a */
    public int f162965a;

    /* renamed from: b */
    public int f162966b;

    /* renamed from: c */
    public String f162967c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f162968d;

    static {
        C60234lh lhVar = new C60234lh();
        f162963e = lhVar;
        C62942bv.registerDefaultInstance(C60234lh.class, lhVar);
    }

    private C60234lh() {
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
                return newMessageInfo(f162963e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဌ\u0000\u0003ဈ\u0001\u0004ဂ\u0002", new Object[]{"a", "b", C60233lg.f162962a, C45240c.f118157a, "d"});
            case 3:
                return new C60234lh();
            case 4:
                return new C60232lf();
            case 5:
                return f162963e;
            case 6:
                C63010eb ebVar = f162964f;
                if (ebVar == null) {
                    synchronized (C60234lh.class) {
                        ebVar = f162964f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162963e);
                            f162964f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
