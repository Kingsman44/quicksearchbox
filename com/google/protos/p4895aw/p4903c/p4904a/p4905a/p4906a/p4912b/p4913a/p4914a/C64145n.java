package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4912b.p4913a.p4914a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.aw.c.a.a.a.b.a.a.n */
/* compiled from: PG */
public final class C64145n extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C64145n f173426i;

    /* renamed from: j */
    private static volatile C63010eb f173427j;

    /* renamed from: a */
    public int f173428a;

    /* renamed from: b */
    public String f173429b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f173430c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f173431d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f173432e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f173433f;

    /* renamed from: g */
    public String f173434g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f173435h = BuildConfig.FLAVOR;

    static {
        C64145n nVar = new C64145n();
        f173426i = nVar;
        C62942bv.registerDefaultInstance(C64145n.class, nVar);
    }

    private C64145n() {
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
                return newMessageInfo(f173426i, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဌ\u0004\u0006ဈ\u0005\u0007ဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C64142k.f173425a, C30325g.f82003a, C19618h.f54585a});
            case 3:
                return new C64145n();
            case 4:
                return new C64144m();
            case 5:
                return f173426i;
            case 6:
                C63010eb ebVar = f173427j;
                if (ebVar == null) {
                    synchronized (C64145n.class) {
                        ebVar = f173427j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173426i);
                            f173427j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
