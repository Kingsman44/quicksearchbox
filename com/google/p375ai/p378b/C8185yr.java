package com.google.p375ai.p378b;

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

/* renamed from: com.google.ai.b.yr */
/* compiled from: PG */
public final class C8185yr extends C62942bv implements C63001dt {

    /* renamed from: k */
    public static final C8185yr f28747k;

    /* renamed from: l */
    private static volatile C63010eb f28748l;

    /* renamed from: a */
    public int f28749a;

    /* renamed from: b */
    public String f28750b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f28751c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f28752d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f28753e;

    /* renamed from: f */
    public int f28754f;

    /* renamed from: g */
    public int f28755g = 1;

    /* renamed from: h */
    public int f28756h;

    /* renamed from: i */
    public int f28757i = 2;

    /* renamed from: j */
    public int f28758j;

    static {
        C8185yr yrVar = new C8185yr();
        f28747k = yrVar;
        C62942bv.registerDefaultInstance(C8185yr.class, yrVar);
    }

    private C8185yr() {
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
                return newMessageInfo(f28747k, "\u0001\t\u0000\u0001\u0001\n\t\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004င\u0003\u0005င\u0004\u0006ဌ\u0005\u0007င\u0006\bဌ\u0007\nင\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C8181yn.f28745a, C19618h.f54585a, "i", C8183yp.f28746a, "j"});
            case 3:
                return new C8185yr();
            case 4:
                return new C8180ym();
            case 5:
                return f28747k;
            case 6:
                C63010eb ebVar = f28748l;
                if (ebVar == null) {
                    synchronized (C8185yr.class) {
                        ebVar = f28748l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28747k);
                            f28748l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
