package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.p2565b.C33259r;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p3723ar.imp.view.C48004n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65346h;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.ao.a.e.ah */
/* compiled from: PG */
public final class C49524ah extends C62942bv implements C63001dt {

    /* renamed from: s */
    public static final C49524ah f127762s;

    /* renamed from: t */
    private static volatile C63010eb f127763t;

    /* renamed from: a */
    public int f127764a;

    /* renamed from: b */
    public int f127765b = 0;

    /* renamed from: c */
    public Object f127766c;

    /* renamed from: d */
    public int f127767d;

    /* renamed from: e */
    public String f127768e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public double f127769f;

    /* renamed from: g */
    public int f127770g;

    /* renamed from: h */
    public String f127771h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f127772i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public C49542az f127773j;

    /* renamed from: k */
    public C49534ar f127774k;

    /* renamed from: l */
    public int f127775l;

    /* renamed from: m */
    public int f127776m;

    /* renamed from: n */
    public boolean f127777n;

    /* renamed from: o */
    public int f127778o;

    /* renamed from: p */
    public String f127779p = BuildConfig.FLAVOR;

    /* renamed from: q */
    public long f127780q;

    /* renamed from: r */
    public String f127781r = BuildConfig.FLAVOR;

    static {
        C49524ah ahVar = new C49524ah();
        f127762s = ahVar;
        C62942bv.registerDefaultInstance(C49524ah.class, ahVar);
    }

    private C49524ah() {
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
                return newMessageInfo(f127762s, "\u0001\u0010\u0001\u0001\u0001\u0010\u0010\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ဈ\u0004\u0005ဈ\u0005\u0006ဉ\u0006\u0007ဉ\u0007\bြ\u0000\tဌ\t\nဇ\n\u000bင\b\fင\u0003\rဌ\u000b\u000eဈ\f\u000fဃ\r\u0010ဈ\u000e", new Object[]{C45240c.f118157a, "b", "a", "d", C49617h.m85586b(), "e", C10662f.f35572a, C19618h.f54585a, "i", "j", C19621k.f54601a, C49564bu.class, "m", C65346h.m96673c(), C48004n.f124238a, "l", C30325g.f82003a, C66412o.f180592a, C49521ae.f127761a, "p", "q", C33259r.f88929b});
            case 3:
                return new C49524ah();
            case 4:
                return new C49523ag();
            case 5:
                return f127762s;
            case 6:
                C63010eb ebVar = f127763t;
                if (ebVar == null) {
                    synchronized (C49524ah.class) {
                        ebVar = f127763t;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127762s);
                            f127763t = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
