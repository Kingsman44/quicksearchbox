package com.google.assistant.p3886c.p3887a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.r */
/* compiled from: PG */
public final class C50682r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50682r f131853f;

    /* renamed from: g */
    private static volatile C63010eb f131854g;

    /* renamed from: a */
    public int f131855a;

    /* renamed from: b */
    public int f131856b;

    /* renamed from: c */
    public long f131857c;

    /* renamed from: d */
    public long f131858d;

    /* renamed from: e */
    public String f131859e = BuildConfig.FLAVOR;

    static {
        C50682r rVar = new C50682r();
        f131853f = rVar;
        C62942bv.registerDefaultInstance(C50682r.class, rVar);
    }

    private C50682r() {
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
                return newMessageInfo(f131853f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C106531e.m177307b(), C45240c.f118157a, "d", "e"});
            case 3:
                return new C50682r();
            case 4:
                return new C50681q();
            case 5:
                return f131853f;
            case 6:
                C63010eb ebVar = f131854g;
                if (ebVar == null) {
                    synchronized (C50682r.class) {
                        ebVar = f131854g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131853f);
                            f131854g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
