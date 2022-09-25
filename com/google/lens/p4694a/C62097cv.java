package com.google.lens.p4694a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.a.cv */
/* compiled from: PG */
public final class C62097cv extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C62097cv f167704h;

    /* renamed from: i */
    private static volatile C63010eb f167705i;

    /* renamed from: a */
    public int f167706a;

    /* renamed from: b */
    public String f167707b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167708c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167709d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167710e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public int f167711f;

    /* renamed from: g */
    public String f167712g = BuildConfig.FLAVOR;

    static {
        C62097cv cvVar = new C62097cv();
        f167704h = cvVar;
        C62942bv.registerDefaultInstance(C62097cv.class, cvVar);
    }

    private C62097cv() {
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
                return newMessageInfo(f167704h, "\u0001\u0006\u0000\u0001\u0001\b\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004\u0007င\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C62097cv();
            case 4:
                return new C62096cu();
            case 5:
                return f167704h;
            case 6:
                C63010eb ebVar = f167705i;
                if (ebVar == null) {
                    synchronized (C62097cv.class) {
                        ebVar = f167705i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167704h);
                            f167705i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
