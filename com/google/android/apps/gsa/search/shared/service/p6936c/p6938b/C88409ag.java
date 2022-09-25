package com.google.android.apps.gsa.search.shared.service.p6936c.p6938b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.android.apps.gsa.search.shared.service.c.b.ag */
/* compiled from: PG */
public final class C88409ag extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C88409ag f239047e;

    /* renamed from: f */
    private static volatile C63010eb f239048f;

    /* renamed from: a */
    public int f239049a;

    /* renamed from: b */
    public String f239050b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f239051c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63088z f239052d = C63088z.f170246b;

    static {
        C88409ag agVar = new C88409ag();
        f239047e = agVar;
        C62942bv.registerDefaultInstance(C88409ag.class, agVar);
    }

    private C88409ag() {
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
                return newMessageInfo(f239047e, "\u0001\u0003\u0000\u0001\u0002\u0004\u0003\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C88409ag();
            case 4:
                return new C88408af();
            case 5:
                return f239047e;
            case 6:
                C63010eb ebVar = f239048f;
                if (ebVar == null) {
                    synchronized (C88409ag.class) {
                        ebVar = f239048f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f239047e);
                            f239048f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
