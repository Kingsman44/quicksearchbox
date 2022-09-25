package com.google.android.apps.search.googleapp.discover.p10238u;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.br */
/* compiled from: PG */
public final class C134986br extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C134986br f367571g;

    /* renamed from: h */
    private static volatile C63010eb f367572h;

    /* renamed from: a */
    public int f367573a;

    /* renamed from: b */
    public String f367574b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f367575c;

    /* renamed from: d */
    public int f367576d;

    /* renamed from: e */
    public int f367577e;

    /* renamed from: f */
    public C63042fg f367578f;

    static {
        C134986br brVar = new C134986br();
        f367571g = brVar;
        C62942bv.registerDefaultInstance(C134986br.class, brVar);
    }

    private C134986br() {
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
                return newMessageInfo(f367571g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004င\u0003\u0005ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, C57259bn.m88290b(), "d", C62722b.m94932b(), "e", C10662f.f35572a});
            case 3:
                return new C134986br();
            case 4:
                return new C134985bq();
            case 5:
                return f367571g;
            case 6:
                C63010eb ebVar = f367572h;
                if (ebVar == null) {
                    synchronized (C134986br.class) {
                        ebVar = f367572h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f367571g);
                            f367572h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
