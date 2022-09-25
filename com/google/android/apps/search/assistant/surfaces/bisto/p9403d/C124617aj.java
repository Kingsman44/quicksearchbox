package com.google.android.apps.search.assistant.surfaces.bisto.p9403d;

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

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.d.aj */
/* compiled from: PG */
public final class C124617aj extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C124617aj f343747l;

    /* renamed from: m */
    private static volatile C63010eb f343748m;

    /* renamed from: a */
    public int f343749a;

    /* renamed from: b */
    public String f343750b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f343751c;

    /* renamed from: d */
    public int f343752d = -1;

    /* renamed from: e */
    public int f343753e;

    /* renamed from: f */
    public String f343754f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public int f343755g = 220;

    /* renamed from: h */
    public int f343756h;

    /* renamed from: i */
    public int f343757i = 1;

    /* renamed from: j */
    public String f343758j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public int f343759k;

    static {
        C124617aj ajVar = new C124617aj();
        f343747l = ajVar;
        C62942bv.registerDefaultInstance(C124617aj.class, ajVar);
    }

    private C124617aj() {
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
                return newMessageInfo(f343747l, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဌ\u0001\u0003င\u0002\u0004ဌ\u0003\u0005ဈ\u0004\u0006င\u0005\u0007ဋ\u0006\tင\u0007\nဈ\b\u000bဌ\t", new Object[]{"a", "b", C45240c.f118157a, C124721s.m204383b(), "d", "e", C124651bq.f343907a, C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a, C124719q.m204381b()});
            case 3:
                return new C124617aj();
            case 4:
                return new C124616ai();
            case 5:
                return f343747l;
            case 6:
                C63010eb ebVar = f343748m;
                if (ebVar == null) {
                    synchronized (C124617aj.class) {
                        ebVar = f343748m;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f343747l);
                            f343748m = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
