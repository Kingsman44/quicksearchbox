package com.google.protos.p4946az;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.az.l */
/* compiled from: PG */
public final class C64364l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C64364l f173967h;

    /* renamed from: i */
    private static volatile C63010eb f173968i;

    /* renamed from: a */
    public int f173969a;

    /* renamed from: b */
    public String f173970b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f173971c;

    /* renamed from: d */
    public String f173972d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173973e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f173974f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C64363k f173975g;

    static {
        C64364l lVar = new C64364l();
        f173967h = lVar;
        C62942bv.registerDefaultInstance(C64364l.class, lVar);
    }

    private C64364l() {
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
                return newMessageInfo(f173967h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003ဈ\u0002\u0005ဈ\u0004\u0006ဉ\u0006\u0007ဈ\u0005", new Object[]{"a", "b", C45240c.f118157a, C64357e.f173960a, "d", "e", C30325g.f82003a, C10662f.f35572a});
            case 3:
                return new C64364l();
            case 4:
                return new C64359g();
            case 5:
                return f173967h;
            case 6:
                C63010eb ebVar = f173968i;
                if (ebVar == null) {
                    synchronized (C64364l.class) {
                        ebVar = f173968i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173967h);
                            f173968i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
