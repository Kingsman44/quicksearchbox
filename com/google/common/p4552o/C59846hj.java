package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.hj */
/* compiled from: PG */
public final class C59846hj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C59846hj f161730f;

    /* renamed from: g */
    private static volatile C63010eb f161731g;

    /* renamed from: a */
    public int f161732a;

    /* renamed from: b */
    public String f161733b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f161734c;

    /* renamed from: d */
    public String f161735d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f161736e = BuildConfig.FLAVOR;

    static {
        C59846hj hjVar = new C59846hj();
        f161730f = hjVar;
        C62942bv.registerDefaultInstance(C59846hj.class, hjVar);
    }

    private C59846hj() {
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
                return newMessageInfo(f161730f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C59844hh.f161729a, "d", "e"});
            case 3:
                return new C59846hj();
            case 4:
                return new C59843hg();
            case 5:
                return f161730f;
            case 6:
                C63010eb ebVar = f161731g;
                if (ebVar == null) {
                    synchronized (C59846hj.class) {
                        ebVar = f161731g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f161730f);
                            f161731g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
