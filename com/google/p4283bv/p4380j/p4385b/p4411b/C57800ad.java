package com.google.p4283bv.p4380j.p4385b.p4411b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.j.b.b.ad */
/* compiled from: PG */
public final class C57800ad extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C57800ad f154417d;

    /* renamed from: f */
    private static volatile C63010eb f154418f;

    /* renamed from: a */
    public String f154419a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f154420b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C57805b f154421c;

    /* renamed from: e */
    private int f154422e;

    static {
        C57800ad adVar = new C57800ad();
        f154417d = adVar;
        C62942bv.registerDefaultInstance(C57800ad.class, adVar);
    }

    private C57800ad() {
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
                return newMessageInfo(f154417d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဉ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C57800ad();
            case 4:
                return new C57799ac();
            case 5:
                return f154417d;
            case 6:
                C63010eb ebVar = f154418f;
                if (ebVar == null) {
                    synchronized (C57800ad.class) {
                        ebVar = f154418f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f154417d);
                            f154418f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
