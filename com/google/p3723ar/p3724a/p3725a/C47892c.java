package com.google.p3723ar.p3724a.p3725a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.core.viewer.jniprotolite.Types;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.ar.a.a.c */
/* compiled from: PG */
public final class C47892c extends C62942bv implements C63001dt {

    /* renamed from: t */
    public static final C47892c f123998t;

    /* renamed from: u */
    private static volatile C63010eb f123999u;

    /* renamed from: a */
    public int f124000a;

    /* renamed from: b */
    public C63088z f124001b = C63088z.f170246b;

    /* renamed from: c */
    public float f124002c;

    /* renamed from: d */
    public float f124003d;

    /* renamed from: e */
    public String f124004e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f124005f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public String f124006g = BuildConfig.FLAVOR;

    /* renamed from: h */
    public boolean f124007h;

    /* renamed from: i */
    public boolean f124008i;

    /* renamed from: j */
    public boolean f124009j;

    /* renamed from: k */
    public C63088z f124010k = C63088z.f170246b;

    /* renamed from: l */
    public String f124011l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public String f124012m = BuildConfig.FLAVOR;

    /* renamed from: n */
    public String f124013n = BuildConfig.FLAVOR;

    /* renamed from: o */
    public String f124014o = BuildConfig.FLAVOR;

    /* renamed from: p */
    public String f124015p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public int f124016q;

    /* renamed from: r */
    public int f124017r;

    /* renamed from: s */
    public int f124018s;

    static {
        C47892c cVar = new C47892c();
        f123998t = cVar;
        C62942bv.registerDefaultInstance(C47892c.class, cVar);
    }

    private C47892c() {
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
                return newMessageInfo(f123998t, "\u0001\u0012\u0000\u0001\u0001>\u0012\u0000\u0000\u0000\u0001ည\u0000\u0002ခ\u0001\u0003ခ\u0002\u0007ဈ\u0003\bဈ\u0004,ဈ\u0005.ဇ\u00060ဇ\u00071ဇ\b2ည\t7ဈ\n8ဈ\u000b9ဈ\f:ဈ\r;ဈ\u000e<ဌ\u000f=ဌ\u0010>ဌ\u0011", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, "l", "m", C48004n.f124238a, C66412o.f180592a, "p", "q", Types.ImageBasedLighting.internalGetVerifier(), C33259r.f88929b, Types.LightingSettings.Mode.internalGetVerifier(), C59002s.f156871a, Types.OcclusionSettings.Mode.internalGetVerifier()});
            case 3:
                return new C47892c();
            case 4:
                return new C47891b();
            case 5:
                return f123998t;
            case 6:
                C63010eb ebVar = f123999u;
                if (ebVar == null) {
                    synchronized (C47892c.class) {
                        ebVar = f123999u;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f123998t);
                            f123999u = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
