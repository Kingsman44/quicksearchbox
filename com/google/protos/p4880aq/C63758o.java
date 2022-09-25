package com.google.protos.p4880aq;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aq.o */
/* compiled from: PG */
public final class C63758o extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C63758o f172481e;

    /* renamed from: f */
    private static volatile C63010eb f172482f;

    /* renamed from: a */
    public int f172483a;

    /* renamed from: b */
    public String f172484b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f172485c;

    /* renamed from: d */
    public String f172486d = BuildConfig.FLAVOR;

    static {
        C63758o oVar = new C63758o();
        f172481e = oVar;
        C62942bv.registerDefaultInstance(C63758o.class, oVar);
    }

    private C63758o() {
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
                return newMessageInfo(f172481e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, C63751h.f172465a, "d"});
            case 3:
                return new C63758o();
            case 4:
                return new C63757n();
            case 5:
                return f172481e;
            case 6:
                C63010eb ebVar = f172482f;
                if (ebVar == null) {
                    synchronized (C63758o.class) {
                        ebVar = f172482f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172481e);
                            f172482f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
