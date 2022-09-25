package com.google.assistant.p3994s.p3995a;

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

/* renamed from: com.google.assistant.s.a.hg */
/* compiled from: PG */
public final class C53259hg extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C53259hg f139612h;

    /* renamed from: i */
    private static volatile C63010eb f139613i;

    /* renamed from: a */
    public int f139614a;

    /* renamed from: b */
    public int f139615b;

    /* renamed from: c */
    public int f139616c;

    /* renamed from: d */
    public C63042fg f139617d;

    /* renamed from: e */
    public String f139618e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f139619f;

    /* renamed from: g */
    public int f139620g;

    static {
        C53259hg hgVar = new C53259hg();
        f139612h = hgVar;
        C62942bv.registerDefaultInstance(C53259hg.class, hgVar);
    }

    private C53259hg() {
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
                return newMessageInfo(f139612h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0002\u0003ဈ\u0003\u0004င\u0004\u0005ဌ\u0001\u0006င\u0005", new Object[]{"a", "b", C53255hc.f139604a, "d", "e", C10662f.f35572a, C45240c.f118157a, C53258hf.m86799b(), C30325g.f82003a});
            case 3:
                return new C53259hg();
            case 4:
                return new C53254hb();
            case 5:
                return f139612h;
            case 6:
                C63010eb ebVar = f139613i;
                if (ebVar == null) {
                    synchronized (C53259hg.class) {
                        ebVar = f139613i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139612h);
                            f139613i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
