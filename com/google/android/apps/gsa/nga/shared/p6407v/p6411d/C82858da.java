package com.google.android.apps.gsa.nga.shared.p6407v.p6411d;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80515d;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.d.da */
/* compiled from: PG */
public final class C82858da extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C82858da f225929d;

    /* renamed from: e */
    private static volatile C63010eb f225930e;

    /* renamed from: a */
    public int f225931a;

    /* renamed from: b */
    public int f225932b;

    /* renamed from: c */
    public long f225933c;

    static {
        C82858da daVar = new C82858da();
        f225929d = daVar;
        C62942bv.registerDefaultInstance(C82858da.class, daVar);
    }

    private C82858da() {
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
                return newMessageInfo(f225929d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001", new Object[]{"a", "b", C80515d.m128186b(), C45240c.f118157a});
            case 3:
                return new C82858da();
            case 4:
                return new C82856cz();
            case 5:
                return f225929d;
            case 6:
                C63010eb ebVar = f225930e;
                if (ebVar == null) {
                    synchronized (C82858da.class) {
                        ebVar = f225930e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f225929d);
                            f225930e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
