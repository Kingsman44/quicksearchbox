package com.google.android.apps.search.googleapp.p10357n.p10358a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4017at.p4060h.p4061a.p4062a.p4063a.C54111j;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.n.a.o */
/* compiled from: PG */
public final class C136707o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C136707o f372118f;

    /* renamed from: g */
    private static volatile C63010eb f372119g;

    /* renamed from: a */
    public int f372120a;

    /* renamed from: b */
    public String f372121b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public long f372122c;

    /* renamed from: d */
    public int f372123d;

    /* renamed from: e */
    public int f372124e;

    static {
        C136707o oVar = new C136707o();
        f372118f = oVar;
        C62942bv.registerDefaultInstance(C136707o.class, oVar);
    }

    private C136707o() {
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
                return newMessageInfo(f372118f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဌ\u0002\u0004ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C54111j.f141983a, "e", C136708p.f372125a});
            case 3:
                return new C136707o();
            case 4:
                return new C136706n();
            case 5:
                return f372118f;
            case 6:
                C63010eb ebVar = f372119g;
                if (ebVar == null) {
                    synchronized (C136707o.class) {
                        ebVar = f372119g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f372118f);
                            f372119g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
