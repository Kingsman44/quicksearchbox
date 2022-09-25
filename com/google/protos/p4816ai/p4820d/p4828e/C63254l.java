package com.google.protos.p4816ai.p4820d.p4828e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ai.d.e.l */
/* compiled from: PG */
public final class C63254l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63254l f170907f;

    /* renamed from: g */
    private static volatile C63010eb f170908g;

    /* renamed from: a */
    public int f170909a;

    /* renamed from: b */
    public String f170910b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f170911c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f170912d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f170913e = BuildConfig.FLAVOR;

    static {
        C63254l lVar = new C63254l();
        f170907f = lVar;
        C62942bv.registerDefaultInstance(C63254l.class, lVar);
    }

    private C63254l() {
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
                return newMessageInfo(f170907f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C63254l();
            case 4:
                return new C63253k();
            case 5:
                return f170907f;
            case 6:
                C63010eb ebVar = f170908g;
                if (ebVar == null) {
                    synchronized (C63254l.class) {
                        ebVar = f170908g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f170907f);
                            f170908g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
