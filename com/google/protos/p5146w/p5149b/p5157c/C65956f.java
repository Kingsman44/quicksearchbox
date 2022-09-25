package com.google.protos.p5146w.p5149b.p5157c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.w.b.c.f */
/* compiled from: PG */
public final class C65956f extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C65956f f179386l;

    /* renamed from: m */
    private static volatile C63010eb f179387m;

    /* renamed from: a */
    public int f179388a;

    /* renamed from: b */
    public double f179389b;

    /* renamed from: c */
    public String f179390c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f179391d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f179392e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f179393f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f179394g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f179395h;

    /* renamed from: i */
    public int f179396i;

    /* renamed from: j */
    public float f179397j;

    /* renamed from: k */
    public String f179398k = BuildConfig.FLAVOR;

    static {
        C65956f fVar = new C65956f();
        f179386l = fVar;
        C62942bv.registerDefaultInstance(C65956f.class, fVar);
    }

    private C65956f() {
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
                return newMessageInfo(f179386l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bင\u0007\tခ\b\nဈ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C65956f();
            case 4:
                return new C65955e();
            case 5:
                return f179386l;
            case 6:
                C63010eb ebVar = f179387m;
                if (ebVar == null) {
                    synchronized (C65956f.class) {
                        ebVar = f179387m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f179386l);
                            f179387m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
