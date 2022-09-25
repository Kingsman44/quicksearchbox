package com.google.assistant.p3886c.p3887a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.c.a.h */
/* compiled from: PG */
public final class C50672h extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C50672h f131816d;

    /* renamed from: e */
    private static volatile C63010eb f131817e;

    /* renamed from: a */
    public int f131818a;

    /* renamed from: b */
    public int f131819b;

    /* renamed from: c */
    public String f131820c = BuildConfig.FLAVOR;

    static {
        C50672h hVar = new C50672h();
        f131816d = hVar;
        C62942bv.registerDefaultInstance(C50672h.class, hVar);
    }

    private C50672h() {
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
                return newMessageInfo(f131816d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C106531e.m177307b(), C45240c.f118157a});
            case 3:
                return new C50672h();
            case 4:
                return new C50671g();
            case 5:
                return f131816d;
            case 6:
                C63010eb ebVar = f131817e;
                if (ebVar == null) {
                    synchronized (C50672h.class) {
                        ebVar = f131817e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131816d);
                            f131817e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
