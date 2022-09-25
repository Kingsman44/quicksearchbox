package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.interpreter.p9860e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.p3926e.C51894da;
import com.google.assistant.p3897e.p3921j.p3926e.C51912ds;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.interpreter.e.n */
/* compiled from: PG */
public final class C129963n extends C62942bv implements C63001dt {

    /* renamed from: m */
    public static final C129963n f356442m;

    /* renamed from: n */
    private static volatile C63010eb f356443n;

    /* renamed from: a */
    public int f356444a;

    /* renamed from: b */
    public String f356445b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f356446c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f356447d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public boolean f356448e;

    /* renamed from: f */
    public C51912ds f356449f;

    /* renamed from: g */
    public C51894da f356450g;

    /* renamed from: h */
    public String f356451h = BuildConfig.FLAVOR;

    /* renamed from: i */
    public String f356452i = BuildConfig.FLAVOR;

    /* renamed from: j */
    public String f356453j = BuildConfig.FLAVOR;

    /* renamed from: k */
    public String f356454k = BuildConfig.FLAVOR;

    /* renamed from: l */
    public String f356455l = BuildConfig.FLAVOR;

    static {
        C129963n nVar = new C129963n();
        f356442m = nVar;
        C62942bv.registerDefaultInstance(C129963n.class, nVar);
    }

    private C129963n() {
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
                return newMessageInfo(f356442m, "\u0000\u000b\u0000\u0001\u0001\r\u000b\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003ለ\u0000\u0004\u0007\u0005\t\u0006\t\u0007Ȉ\bȈ\u000bȈ\fለ\u0001\rȈ", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", C19621k.f54601a, "l", "j"});
            case 3:
                return new C129963n();
            case 4:
                return new C129962m();
            case 5:
                return f356442m;
            case 6:
                C63010eb ebVar = f356443n;
                if (ebVar == null) {
                    synchronized (C129963n.class) {
                        ebVar = f356443n;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f356442m);
                            f356443n = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
