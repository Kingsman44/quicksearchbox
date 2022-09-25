package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.qd */
/* compiled from: PG */
public final class C50251qd extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50251qd f130676e;

    /* renamed from: f */
    private static volatile C63010eb f130677f;

    /* renamed from: a */
    public int f130678a;

    /* renamed from: b */
    public String f130679b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public double f130680c;

    /* renamed from: d */
    public double f130681d;

    static {
        C50251qd qdVar = new C50251qd();
        f130676e = qdVar;
        C62942bv.registerDefaultInstance(C50251qd.class, qdVar);
    }

    private C50251qd() {
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
                return newMessageInfo(f130676e, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002က\u0001\u0003က\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50251qd();
            case 4:
                return new C50250qc();
            case 5:
                return f130676e;
            case 6:
                C63010eb ebVar = f130677f;
                if (ebVar == null) {
                    synchronized (C50251qd.class) {
                        ebVar = f130677f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130676e);
                            f130677f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
