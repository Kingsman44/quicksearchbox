package com.google.assistant.p3886c.p3887a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106529c;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.c.a.v */
/* compiled from: PG */
public final class C50686v extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C50686v f131861f;

    /* renamed from: g */
    private static volatile C63010eb f131862g;

    /* renamed from: a */
    public int f131863a;

    /* renamed from: b */
    public C63042fg f131864b;

    /* renamed from: c */
    public int f131865c;

    /* renamed from: d */
    public int f131866d;

    /* renamed from: e */
    public String f131867e = BuildConfig.FLAVOR;

    static {
        C50686v vVar = new C50686v();
        f131861f = vVar;
        C62942bv.registerDefaultInstance(C50686v.class, vVar);
    }

    private C50686v() {
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
                return newMessageInfo(f131861f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C106531e.m177307b(), "d", C106529c.m177305b(), "e"});
            case 3:
                return new C50686v();
            case 4:
                return new C50685u();
            case 5:
                return f131861f;
            case 6:
                C63010eb ebVar = f131862g;
                if (ebVar == null) {
                    synchronized (C50686v.class) {
                        ebVar = f131862g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131861f);
                            f131862g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
