package com.google.p4017at.p4018a.p4019a.p4020a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.a.a.a.bv */
/* compiled from: PG */
public final class C53791bv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C53791bv f141184e;

    /* renamed from: f */
    private static volatile C63010eb f141185f;

    /* renamed from: a */
    public int f141186a;

    /* renamed from: b */
    public int f141187b;

    /* renamed from: c */
    public String f141188c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C53786bq f141189d;

    static {
        C53791bv bvVar = new C53791bv();
        f141184e = bvVar;
        C62942bv.registerDefaultInstance(C53791bv.class, bvVar);
    }

    private C53791bv() {
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
                return newMessageInfo(f141184e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဉ\u0003", new Object[]{"a", "b", C45595b.m81284b(), C45240c.f118157a, "d"});
            case 3:
                return new C53791bv();
            case 4:
                return new C53790bu();
            case 5:
                return f141184e;
            case 6:
                C63010eb ebVar = f141185f;
                if (ebVar == null) {
                    synchronized (C53791bv.class) {
                        ebVar = f141185f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141184e);
                            f141185f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
