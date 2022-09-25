package com.google.p5238v.p5239a.p5255j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.v.a.j.bp */
/* compiled from: PG */
public final class C67686bp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C67686bp f183670d;

    /* renamed from: e */
    private static volatile C63010eb f183671e;

    /* renamed from: a */
    public int f183672a;

    /* renamed from: b */
    public C67688br f183673b;

    /* renamed from: c */
    public C63088z f183674c = C63088z.f170246b;

    static {
        C67686bp bpVar = new C67686bp();
        f183670d = bpVar;
        C62942bv.registerDefaultInstance(C67686bp.class, bpVar);
    }

    private C67686bp() {
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
                return newMessageInfo(f183670d, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C67686bp();
            case 4:
                return new C67685bo();
            case 5:
                return f183670d;
            case 6:
                C63010eb ebVar = f183671e;
                if (ebVar == null) {
                    synchronized (C67686bp.class) {
                        ebVar = f183671e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183670d);
                            f183671e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
