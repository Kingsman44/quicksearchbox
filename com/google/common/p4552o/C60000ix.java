package com.google.common.p4552o;

import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80248co;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.common.o.ix */
/* compiled from: PG */
public final class C60000ix extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C60000ix f162157e;

    /* renamed from: f */
    public static final C62940bt f162158f;

    /* renamed from: g */
    private static volatile C63010eb f162159g;

    /* renamed from: a */
    public int f162160a;

    /* renamed from: b */
    public int f162161b;

    /* renamed from: c */
    public int f162162c;

    /* renamed from: d */
    public int f162163d;

    static {
        C60000ix ixVar = new C60000ix();
        f162157e = ixVar;
        C62942bv.registerDefaultInstance(C60000ix.class, ixVar);
        f162158f = C62942bv.newSingularGeneratedExtension(aqs.f159780k, ixVar, ixVar, (C62958ce) null, 542, C63066gd.MESSAGE, C60000ix.class);
    }

    private C60000ix() {
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
                return newMessageInfo(f162157e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002င\u0002\u0003ဌ\u0001", new Object[]{"a", "b", C80267v.m128111b(), "d", C45240c.f118157a, C80248co.m128105b()});
            case 3:
                return new C60000ix();
            case 4:
                return new C59999iw();
            case 5:
                return f162157e;
            case 6:
                C63010eb ebVar = f162159g;
                if (ebVar == null) {
                    synchronized (C60000ix.class) {
                        ebVar = f162159g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f162157e);
                            f162159g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
