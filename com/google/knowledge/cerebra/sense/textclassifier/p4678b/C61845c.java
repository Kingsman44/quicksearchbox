package com.google.knowledge.cerebra.sense.textclassifier.p4678b;

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

/* renamed from: com.google.knowledge.cerebra.sense.textclassifier.b.c */
/* compiled from: PG */
public final class C61845c extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C61845c f167104m;

    /* renamed from: n */
    private static volatile C63010eb f167105n;

    /* renamed from: a */
    public int f167106a;

    /* renamed from: b */
    public String f167107b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f167108c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f167109d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f167110e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f167111f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f167112g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public String f167113h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f167114i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f167115j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f167116k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f167117l = BuildConfig.FLAVOR;

    static {
        C61845c cVar = new C61845c();
        f167104m = cVar;
        C62942bv.registerDefaultInstance(C61845c.class, cVar);
    }

    private C61845c() {
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
                return newMessageInfo(f167104m, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0003\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဈ\u0006\u0007ဈ\t\bဈ\n\tဈ\u0001\nဈ\u0007\u000bဈ\b", new Object[]{"a", "b", "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, C19621k.f54601a, "l", C45240c.f118157a, "i", "j"});
            case 3:
                return new C61845c();
            case 4:
                return new C61844b();
            case 5:
                return f167104m;
            case 6:
                C63010eb ebVar = f167105n;
                if (ebVar == null) {
                    synchronized (C61845c.class) {
                        ebVar = f167105n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f167104m);
                            f167105n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
