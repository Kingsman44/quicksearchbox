package com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.p8008j;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.pages.j.bl */
/* compiled from: PG */
public final class C102168bl extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C102168bl f285013f;

    /* renamed from: g */
    private static volatile C63010eb f285014g;

    /* renamed from: a */
    public int f285015a;

    /* renamed from: b */
    public String f285016b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f285017c;

    /* renamed from: d */
    public String f285018d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f285019e = BuildConfig.FLAVOR;

    static {
        C102168bl blVar = new C102168bl();
        f285013f = blVar;
        C62942bv.registerDefaultInstance(C102168bl.class, blVar);
    }

    private C102168bl() {
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
                return newMessageInfo(f285013f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C9439b.m23956b(), "d", "e"});
            case 3:
                return new C102168bl();
            case 4:
                return new C102167bk();
            case 5:
                return f285013f;
            case 6:
                C63010eb ebVar = f285014g;
                if (ebVar == null) {
                    synchronized (C102168bl.class) {
                        ebVar = f285014g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f285013f);
                            f285014g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
