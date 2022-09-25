package com.google.android.apps.gsa.staticplugins.opa.p8173aa;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3898a.C50870f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.aa.j */
/* compiled from: PG */
public final class C105960j extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C105960j f295835h;

    /* renamed from: i */
    private static volatile C63010eb f295836i;

    /* renamed from: a */
    public int f295837a;

    /* renamed from: b */
    public String f295838b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public boolean f295839c;

    /* renamed from: d */
    public C50870f f295840d;

    /* renamed from: e */
    public String f295841e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public boolean f295842f;

    /* renamed from: g */
    public boolean f295843g;

    static {
        C105960j jVar = new C105960j();
        f295835h = jVar;
        C62942bv.registerDefaultInstance(C105960j.class, jVar);
    }

    private C105960j() {
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
                return newMessageInfo(f295835h, "\u0001\u0006\u0000\u0001\u0001\u0007\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0004ဉ\u0002\u0005ဈ\u0003\u0006ဇ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C105960j();
            case 4:
                return new C105959i();
            case 5:
                return f295835h;
            case 6:
                C63010eb ebVar = f295836i;
                if (ebVar == null) {
                    synchronized (C105960j.class) {
                        ebVar = f295836i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f295835h);
                            f295836i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
