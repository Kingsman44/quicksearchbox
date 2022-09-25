package com.google.common.p4552o.p4553a;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80201av;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80239cf;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80265t;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.a.be */
/* compiled from: PG */
public final class C59481be extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59481be f157812f;

    /* renamed from: g */
    private static volatile C63010eb f157813g;

    /* renamed from: a */
    public int f157814a;

    /* renamed from: b */
    public int f157815b;

    /* renamed from: c */
    public int f157816c;

    /* renamed from: d */
    public int f157817d;

    /* renamed from: e */
    public int f157818e;

    static {
        C59481be beVar = new C59481be();
        f157812f = beVar;
        C62942bv.registerDefaultInstance(C59481be.class, beVar);
    }

    private C59481be() {
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
                return newMessageInfo(f157812f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဌ\u0002\u0003ဌ\u0003\u0004ဌ\u0004", new Object[]{"a", "b", C80267v.m128111b(), C45240c.f118157a, C80201av.m128094b(), "d", C80265t.m128109b(), "e", C80239cf.f220132a});
            case 3:
                return new C59481be();
            case 4:
                return new C59480bd();
            case 5:
                return f157812f;
            case 6:
                C63010eb ebVar = f157813g;
                if (ebVar == null) {
                    synchronized (C59481be.class) {
                        ebVar = f157813g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f157812f);
                            f157813g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
