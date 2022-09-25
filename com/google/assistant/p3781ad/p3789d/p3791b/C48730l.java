package com.google.assistant.p3781ad.p3789d.p3791b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ad.d.b.l */
/* compiled from: PG */
public final class C48730l extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C48730l f126093h;

    /* renamed from: i */
    private static volatile C63010eb f126094i;

    /* renamed from: a */
    public int f126095a;

    /* renamed from: b */
    public int f126096b;

    /* renamed from: c */
    public String f126097c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f126098d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C48729k f126099e;

    /* renamed from: f */
    public C48726h f126100f;

    /* renamed from: g */
    public boolean f126101g;

    static {
        C48730l lVar = new C48730l();
        f126093h = lVar;
        C62942bv.registerDefaultInstance(C48730l.class, lVar);
    }

    private C48730l() {
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
                return newMessageInfo(f126093h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ဉ\u0004\bဇ\u0006", new Object[]{"a", "b", C48723e.f126083a, C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C48730l();
            case 4:
                return new C48727i();
            case 5:
                return f126093h;
            case 6:
                C63010eb ebVar = f126094i;
                if (ebVar == null) {
                    synchronized (C48730l.class) {
                        ebVar = f126094i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f126093h);
                            f126094i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
