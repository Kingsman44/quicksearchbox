package com.google.p4152bb.p4153a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.jc */
/* compiled from: PG */
public final class C55188jc extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C55188jc f145269b;

    /* renamed from: d */
    private static volatile C63010eb f145270d;

    /* renamed from: a */
    public int f145271a;

    /* renamed from: c */
    private int f145272c;

    static {
        C55188jc jcVar = new C55188jc();
        f145269b = jcVar;
        C62942bv.registerDefaultInstance(C55188jc.class, jcVar);
    }

    private C55188jc() {
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
                return newMessageInfo(f145269b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{C45240c.f118157a, "a", C55193jh.f145278a});
            case 3:
                return new C55188jc();
            case 4:
                return new C55187jb();
            case 5:
                return f145269b;
            case 6:
                C63010eb ebVar = f145270d;
                if (ebVar == null) {
                    synchronized (C55188jc.class) {
                        ebVar = f145270d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f145269b);
                            f145270d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
