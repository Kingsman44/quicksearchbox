package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.pn */
/* compiled from: PG */
public final class C50234pn extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50234pn f130605e;

    /* renamed from: f */
    private static volatile C63010eb f130606f;

    /* renamed from: a */
    public int f130607a;

    /* renamed from: b */
    public String f130608b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130609c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130610d = BuildConfig.FLAVOR;

    static {
        C50234pn pnVar = new C50234pn();
        f130605e = pnVar;
        C62942bv.registerDefaultInstance(C50234pn.class, pnVar);
    }

    private C50234pn() {
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
                return newMessageInfo(f130605e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50234pn();
            case 4:
                return new C50233pm();
            case 5:
                return f130605e;
            case 6:
                C63010eb ebVar = f130606f;
                if (ebVar == null) {
                    synchronized (C50234pn.class) {
                        ebVar = f130606f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130605e);
                            f130606f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
