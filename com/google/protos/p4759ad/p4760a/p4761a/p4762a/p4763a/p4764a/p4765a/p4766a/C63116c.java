package com.google.protos.p4759ad.p4760a.p4761a.p4762a.p4763a.p4764a.p4765a.p4766a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ad.a.a.a.a.a.a.a.c */
/* compiled from: PG */
public final class C63116c extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C63116c f170382d;

    /* renamed from: f */
    private static volatile C63010eb f170383f;

    /* renamed from: a */
    public String f170384a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public String f170385b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f170386c;

    /* renamed from: e */
    private int f170387e;

    static {
        C63116c cVar = new C63116c();
        f170382d = cVar;
        C62942bv.registerDefaultInstance(C63116c.class, cVar);
    }

    private C63116c() {
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
                return newMessageInfo(f170382d, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဂ\u0002", new Object[]{"e", "a", "b", C45240c.f118157a});
            case 3:
                return new C63116c();
            case 4:
                return new C63115b();
            case 5:
                return f170382d;
            case 6:
                C63010eb ebVar = f170383f;
                if (ebVar == null) {
                    synchronized (C63116c.class) {
                        ebVar = f170383f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170382d);
                            f170383f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
