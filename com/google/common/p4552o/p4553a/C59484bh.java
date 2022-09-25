package com.google.common.p4552o.p4553a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.bh */
/* compiled from: PG */
public final class C59484bh extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C59484bh f157819d;

    /* renamed from: e */
    private static volatile C63010eb f157820e;

    /* renamed from: a */
    public int f157821a;

    /* renamed from: b */
    public int f157822b;

    /* renamed from: c */
    public int f157823c;

    static {
        C59484bh bhVar = new C59484bh();
        f157819d = bhVar;
        C62942bv.registerDefaultInstance(C59484bh.class, bhVar);
    }

    private C59484bh() {
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
                return newMessageInfo(f157819d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0001", new Object[]{"a", "b", C80265t.m128109b(), C45240c.f118157a});
            case 3:
                return new C59484bh();
            case 4:
                return new C59483bg();
            case 5:
                return f157819d;
            case 6:
                C63010eb ebVar = f157820e;
                if (ebVar == null) {
                    synchronized (C59484bh.class) {
                        ebVar = f157820e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157819d);
                            f157820e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
