package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.aj */
/* compiled from: PG */
public final class C80189aj extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C80189aj f220013e;

    /* renamed from: f */
    private static volatile C63010eb f220014f;

    /* renamed from: a */
    public int f220015a;

    /* renamed from: b */
    public int f220016b;

    /* renamed from: c */
    public boolean f220017c;

    /* renamed from: d */
    public C80244ck f220018d;

    static {
        C80189aj ajVar = new C80189aj();
        f220013e = ajVar;
        C62942bv.registerDefaultInstance(C80189aj.class, ajVar);
    }

    private C80189aj() {
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
                return newMessageInfo(f220013e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဇ\u0001\u0003ဉ\u0002", new Object[]{"a", "b", C80190ak.f220019a, C45240c.f118157a, "d"});
            case 3:
                return new C80189aj();
            case 4:
                return new C80188ai();
            case 5:
                return f220013e;
            case 6:
                C63010eb ebVar = f220014f;
                if (ebVar == null) {
                    synchronized (C80189aj.class) {
                        ebVar = f220014f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220013e);
                            f220014f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
