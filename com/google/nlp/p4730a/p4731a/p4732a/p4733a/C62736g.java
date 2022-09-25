package com.google.nlp.p4730a.p4731a.p4732a.p4733a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;
import com.google.protobuf.C63088z;

/* renamed from: com.google.nlp.a.a.a.a.g */
/* compiled from: PG */
public final class C62736g extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62736g f169448h;

    /* renamed from: i */
    private static volatile C63010eb f169449i;

    /* renamed from: a */
    public int f169450a;

    /* renamed from: b */
    public C63042fg f169451b;

    /* renamed from: c */
    public String f169452c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f169453d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f169454e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C63088z f169455f = C63088z.f170246b;

    /* renamed from: g */
    public C63088z f169456g = C63088z.f170246b;

    static {
        C62736g gVar = new C62736g();
        f169448h = gVar;
        C62942bv.registerDefaultInstance(C62736g.class, gVar);
    }

    private C62736g() {
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
                return newMessageInfo(f169448h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ည\u0004\u0005ည\u0005\u0006ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C10662f.f35572a, C30325g.f82003a, "e"});
            case 3:
                return new C62736g();
            case 4:
                return new C62735f();
            case 5:
                return f169448h;
            case 6:
                C63010eb ebVar = f169449i;
                if (ebVar == null) {
                    synchronized (C62736g.class) {
                        ebVar = f169449i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169448h);
                            f169449i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
