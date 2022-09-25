package com.google.android.apps.gsa.nga.shared.p6275aa;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.ce */
/* compiled from: PG */
public final class C80156ce extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C80156ce f219955d;

    /* renamed from: e */
    private static volatile C63010eb f219956e;

    /* renamed from: a */
    public int f219957a;

    /* renamed from: b */
    public long f219958b;

    /* renamed from: c */
    public boolean f219959c;

    static {
        C80156ce ceVar = new C80156ce();
        f219955d = ceVar;
        C62942bv.registerDefaultInstance(C80156ce.class, ceVar);
    }

    private C80156ce() {
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
                return newMessageInfo(f219955d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဇ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C80156ce();
            case 4:
                return new C80155cd();
            case 5:
                return f219955d;
            case 6:
                C63010eb ebVar = f219956e;
                if (ebVar == null) {
                    synchronized (C80156ce.class) {
                        ebVar = f219956e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f219955d);
                            f219956e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
