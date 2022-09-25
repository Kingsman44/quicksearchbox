package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.st */
/* compiled from: PG */
public final class C52465st extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C52465st f137722h;

    /* renamed from: i */
    private static volatile C63010eb f137723i;

    /* renamed from: a */
    public int f137724a;

    /* renamed from: b */
    public String f137725b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f137726c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public long f137727d;

    /* renamed from: e */
    public int f137728e;

    /* renamed from: f */
    public String f137729f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C52522uw f137730g;

    static {
        C52465st stVar = new C52465st();
        f137722h = stVar;
        C62942bv.registerDefaultInstance(C52465st.class, stVar);
    }

    private C52465st() {
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
                return newMessageInfo(f137722h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0003\u0003ဂ\u0002\u0004ဈ\u0001\u0005ဈ\u0004\u0006ဉ\u0005", new Object[]{"a", "b", "e", C52464ss.f137721a, "d", C45240c.f118157a, C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C52465st();
            case 4:
                return new C52463sr();
            case 5:
                return f137722h;
            case 6:
                C63010eb ebVar = f137723i;
                if (ebVar == null) {
                    synchronized (C52465st.class) {
                        ebVar = f137723i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137722h);
                            f137723i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
