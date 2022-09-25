package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.fv */
/* compiled from: PG */
public final class C55099fv extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C55099fv f144985e;

    /* renamed from: f */
    private static volatile C63010eb f144986f;

    /* renamed from: a */
    public int f144987a;

    /* renamed from: b */
    public String f144988b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f144989c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f144990d = BuildConfig.FLAVOR;

    static {
        C55099fv fvVar = new C55099fv();
        f144985e = fvVar;
        C62942bv.registerDefaultInstance(C55099fv.class, fvVar);
    }

    private C55099fv() {
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
                return newMessageInfo(f144985e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C55099fv();
            case 4:
                return new C55098fu();
            case 5:
                return f144985e;
            case 6:
                C63010eb ebVar = f144986f;
                if (ebVar == null) {
                    synchronized (C55099fv.class) {
                        ebVar = f144986f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144985e);
                            f144986f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
